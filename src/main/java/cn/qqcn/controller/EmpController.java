package cn.qqcn.controller;

import cn.qqcn.common.vo.Result;
import cn.qqcn.entity.Dept;
import cn.qqcn.entity.Emp;
import cn.qqcn.entity.query.EmpQuery;
import cn.qqcn.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    //跳转到员工列表页
    @GetMapping("")
    public String toEmpListUI(){
        return "emp/empList1";
    }

    //获得员工列表
    @GetMapping("/list")
    @ResponseBody
    public Result<Object> getEmpList(EmpQuery param){
        List<Emp> list = empService.getEmpList(param);
        Long count = empService.countEmpList(param);
        //System.out.println(list);
        return Result.success(list,count);
    }
    //添加员工表单页面点击提交时,此函数接收并返回信息
    @PostMapping("")
    @ResponseBody
    public Result<Object> addEmp(Emp emp){
        empService.addEmp(emp);
        return Result.success("新增员工成功！");
    }
    //跳转到添加员工表单页面
    @GetMapping("/add/ui")
    public String toAddUI(Model model){
        List<Dept> deptList = empService.getAllDept();
        model.addAttribute("deptList",deptList);
        String[] staffNation = new String[]{"汉族","满族","蒙古族","回族","藏族","维吾尔族","苗族","彝族","壮族","布依族","侗族",
                "瑶族","白族","土家族","哈尼族","哈萨克族","傣族","黎族","傈僳族","佤族","畲族","高山族","拉祜族","水族","东乡族","纳西族",
                "景颇族","柯尔克孜族","土族","达斡尔族","仫佬族","羌族","布朗族","撒拉族","毛南族","仡佬族","锡伯族","阿昌族","普米族","朝鲜族",
                "塔吉克族","怒族","乌孜别克族","俄罗斯族","鄂温克族","德昂族","保安族","裕固族","京族","塔塔尔族","独龙族","鄂伦春族","赫哲族","门巴族","珞巴族","基诺族"};
        model.addAttribute("staffNation",staffNation);
        return "emp/empAdd1";
    }


    //删除员工
    @DeleteMapping("/{ids}")
    @ResponseBody
    public Result<Object> deleteEmpByIds(@PathVariable("ids") String ids){
        System.out.println(ids);
        String res = empService.deleteEmpByIds(ids);
        return Result.success(res);
    }
    //根据id获取员工信息,并跳转到员工编辑页
    @GetMapping("/{id}")
    public String getEmpById(@PathVariable("id") Integer id,Model model){
        Emp emp = empService.getEmpById(id);
        model.addAttribute("emp",emp);
        model.addAttribute("deptList",empService.getAllDept());
        String[] staffNation = new String[]{"汉族","满族","蒙古族","回族","藏族","维吾尔族","苗族","彝族","壮族","布依族","侗族",
                "瑶族","白族","土家族","哈尼族","哈萨克族","傣族","黎族","傈僳族","佤族","畲族","高山族","拉祜族","水族","东乡族","纳西族",
                "景颇族","柯尔克孜族","土族","达斡尔族","仫佬族","羌族","布朗族","撒拉族","毛南族","仡佬族","锡伯族","阿昌族","普米族","朝鲜族",
                "塔吉克族","怒族","乌孜别克族","俄罗斯族","鄂温克族","德昂族","保安族","裕固族","京族","塔塔尔族","独龙族","鄂伦春族","赫哲族","门巴族","珞巴族","基诺族"};
        model.addAttribute("staffNation",staffNation);
        //System.out.println(emp);
        return "emp/empEdit";
    }

    //根据id获取员工信息,并跳转到员工详情页
    @GetMapping("/look/{id}")
    public String toEmpLook(@PathVariable("id") Integer id,Model model){
        Emp emp = empService.getEmpById(id);
        model.addAttribute("emp",emp);
        model.addAttribute("deptList",empService.getAllDept());
        String[] staffNation = new String[]{"汉族","满族","蒙古族","回族","藏族","维吾尔族","苗族","彝族","壮族","布依族","侗族",
                "瑶族","白族","土家族","哈尼族","哈萨克族","傣族","黎族","傈僳族","佤族","畲族","高山族","拉祜族","水族","东乡族","纳西族",
                "景颇族","柯尔克孜族","土族","达斡尔族","仫佬族","羌族","布朗族","撒拉族","毛南族","仡佬族","锡伯族","阿昌族","普米族","朝鲜族",
                "塔吉克族","怒族","乌孜别克族","俄罗斯族","鄂温克族","德昂族","保安族","裕固族","京族","塔塔尔族","独龙族","鄂伦春族","赫哲族","门巴族","珞巴族","基诺族"};
        model.addAttribute("staffNation",staffNation);
        //System.out.println(emp);
        return "emp/empLook";
    }




    //更新
    @PutMapping("")
    @ResponseBody
    public Result<Object> updateEmp(Emp emp){
        empService.updateEmp(emp);
        return Result.success("员工信息修改成功！");
    }



    //根据入职时间查询员工列表



    //根据转正时间查询员工列表













}

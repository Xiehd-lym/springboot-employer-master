package cn.qqcn.controller;


import cn.qqcn.common.vo.Result;
import cn.qqcn.entity.Emp;
import cn.qqcn.entity.Salary;
import cn.qqcn.entity.query.EmpQuery;
import cn.qqcn.entity.query.Salquest;
import cn.qqcn.service.SalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sal")
public class SalaryController {

    //
    @Autowired
    private SalService salService;

    @GetMapping("")
    public String toSalListUI(){
        return "sal/salList";
    }

    //根据条件查询薪资列表
    @GetMapping("/salList")
    @ResponseBody
    public Result<Object> getEmpList(Salquest salquest){
        List<Salary> list = salService.getSalList(salquest);
        Long count = salService.countSalList(salquest);
        //System.out.println(list);
        return Result.success(list,count);
    }



    //根据月份查询实发薪资总额
    @GetMapping("/salTotalByMonth")
    @ResponseBody
    public Result<Object> getsalTatal(Salquest salquest){
        List<Salary> list = salService.getSalList(salquest);
        double salTotal = 0;
        for(Salary salary : list){
            double temp = Double.parseDouble(salary.getActualAmountMoney());
            salTotal = salTotal + temp;
        }
        return Result.success(String.valueOf(salTotal));
    }




}

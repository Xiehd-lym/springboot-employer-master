package cn.qqcn.service.impl;

import cn.qqcn.dao.DeptMapper;
import cn.qqcn.dao.EmpMapper;
import cn.qqcn.entity.Dept;
import cn.qqcn.entity.Emp;
import cn.qqcn.entity.query.EmpQuery;
import cn.qqcn.service.EmpService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;

    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<Emp> getEmpList(EmpQuery param) {
        return empMapper.getEmpList(param);
    }

    @Override
    public Long countEmpList(EmpQuery param) {
        return empMapper.countEmpList(param);
    }

    @Override
    public void addEmp(Emp emp) {
        if(emp.getId()==null || emp.getId().equals("")){
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String datenew = dateFormat.format(date);
            emp.setStaffCreationDate(datenew);
            emp.setStaffModificationDate(datenew);
        }else{
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String datenew = dateFormat.format(date);
            emp.setStaffModificationDate(datenew);
        }
        System.out.println(emp);
        empMapper.addEmp(emp);
    }

    @Override
    public List<Dept> getAllDept() {
        return deptMapper.getAllDept();
    }

    @Override
    public String deleteEmpByIds(String ids) {
        int i = empMapper.deleteEmpByIds(ids);
        System.out.println(ids);
        if(i>0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    @Override
    public Emp getEmpById(Integer id) {
        return empMapper.getEmpById(id);
    }

    @Override
    public void updateEmp(Emp emp) {
        empMapper.updateEmp(emp);
    }
}

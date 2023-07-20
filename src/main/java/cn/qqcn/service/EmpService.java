package cn.qqcn.service;



import cn.qqcn.entity.Dept;
import cn.qqcn.entity.Emp;
import cn.qqcn.entity.query.EmpQuery;

import java.util.List;

public interface EmpService {

    List<Emp> getEmpList(EmpQuery param);

    Long countEmpList(EmpQuery param);

    void addEmp(Emp emp);

    List<Dept> getAllDept();

    String deleteEmpByIds(String ids);

    Emp getEmpById(Integer id);

    void updateEmp(Emp emp);
}

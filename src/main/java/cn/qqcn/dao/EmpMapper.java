package cn.qqcn.dao;

import cn.qqcn.common.general.GeneralDAO;
import cn.qqcn.entity.Emp;
import cn.qqcn.entity.query.EmpQuery;

import java.util.List;

public interface EmpMapper extends GeneralDAO<Emp> {
    List<Emp> getEmpList(EmpQuery param);

    Long countEmpList(EmpQuery param);

    int addEmp(Emp emp);

    int deleteEmpByIds(String ids);

    Emp getEmpById(Integer id);

    void updateEmp(Emp emp);
}
package cn.qqcn.dao;

import cn.qqcn.common.general.GeneralDAO;
import cn.qqcn.entity.Salary;
import cn.qqcn.entity.query.Salquest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaryMapper extends GeneralDAO<Salary> {
    List<Salary> getSalList(Salquest salquest);

    Long countSalList(Salquest salquest);
}
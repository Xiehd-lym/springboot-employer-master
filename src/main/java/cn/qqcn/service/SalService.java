package cn.qqcn.service;

import cn.qqcn.entity.Salary;
import cn.qqcn.entity.query.Salquest;

import java.util.List;

public interface SalService {
    
    List<Salary> getSalList(Salquest salquest);

    Long countSalList(Salquest salquest);
}

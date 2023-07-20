package cn.qqcn.service.impl;

import cn.qqcn.dao.SalaryMapper;
import cn.qqcn.entity.Salary;
import cn.qqcn.entity.query.Salquest;
import cn.qqcn.service.SalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalServiceImpl implements SalService {

    @Autowired
    private SalaryMapper salaryMapper;


    //查询薪资表
    @Override
    public List<Salary> getSalList(Salquest salquest) {
        return salaryMapper.getSalList(salquest);
    }
    //获得查询列表总数
    @Override
    public Long countSalList(Salquest salquest) {
        return salaryMapper.countSalList(salquest);
    }
}

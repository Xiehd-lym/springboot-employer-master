package cn.qqcn.dao;

import cn.qqcn.common.general.GeneralDAO;
import cn.qqcn.entity.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DeptMapper extends GeneralDAO<Dept> {
    List<Dept> getAllDept();
}
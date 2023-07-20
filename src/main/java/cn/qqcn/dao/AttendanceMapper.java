package cn.qqcn.dao;

import cn.qqcn.common.general.GeneralDAO;
import cn.qqcn.entity.Attendance;
import cn.qqcn.entity.Emp;
import cn.qqcn.entity.query.EmpQuery;

import java.util.List;

public interface AttendanceMapper extends GeneralDAO<Attendance> {
    List<Attendance> getAttendList(EmpQuery param);

    Long countAttendList(EmpQuery param);

    Attendance getAttendById(Integer id);
}
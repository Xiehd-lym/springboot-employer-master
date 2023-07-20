package cn.qqcn.service;


import cn.qqcn.entity.Attendance;
import cn.qqcn.entity.Emp;
import cn.qqcn.entity.query.EmpQuery;

import java.util.List;

public interface AttendService {
    List<Attendance> getAttendList(EmpQuery param);

    Long countAttendList(EmpQuery param);

    Attendance getAttendById(Integer id);
}

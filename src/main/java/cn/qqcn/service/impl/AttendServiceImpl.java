package cn.qqcn.service.impl;

import cn.qqcn.dao.AttendanceMapper;
import cn.qqcn.entity.Attendance;
import cn.qqcn.entity.Emp;
import cn.qqcn.entity.query.EmpQuery;
import cn.qqcn.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendServiceImpl implements AttendService {

    @Autowired
    AttendanceMapper attendanceMapper;


    @Override
    public List<Attendance> getAttendList(EmpQuery param) {
        return attendanceMapper.getAttendList(param);
    }

    @Override
    public Long countAttendList(EmpQuery param) {
        return attendanceMapper.countAttendList(param);
    }

    @Override
    public Attendance getAttendById(Integer id) {
        return attendanceMapper.getAttendById(id);
    }
}

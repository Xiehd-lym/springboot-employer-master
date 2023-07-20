package cn.qqcn.entity.query;


import cn.qqcn.common.vo.Page;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Salquest extends Page {
    //员工姓名
    private String name;
   // 员工编号
    private String sraffNumber;

    //月份
    private String month;
    /*@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;*/



}

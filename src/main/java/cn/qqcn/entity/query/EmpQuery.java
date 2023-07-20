package cn.qqcn.entity.query;

import cn.qqcn.common.vo.Page;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class EmpQuery extends Page {
    //员工姓名
    private String staffName;
   //员工编号
    private String sraffNumber;

}

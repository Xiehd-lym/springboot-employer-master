package cn.qqcn.test;

import cn.qqcn.entity.Dept;
import cn.qqcn.entity.Emp;
import cn.qqcn.entity.Salary;
import cn.qqcn.entity.query.EmpQuery;
import cn.qqcn.entity.query.Salquest;
import cn.qqcn.service.EmpService;

import cn.qqcn.service.SalService;
import cn.qqcn.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest()
@RunWith(SpringRunner.class)
public class CryptTest {

    @Test
    public void test(){
        // md5 spring提供的加密方法，加盐得自己处理
        /*String s1 = DigestUtils.md5DigestAsHex("123456".getBytes());
        String s2 = DigestUtils.md5DigestAsHex("123456".getBytes());
        System.out.println(s1);
        System.out.println(s2);*/

        // spring 安全框架提供的加密方法，可以自动加盐，无需自己保存盐值
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode1 = passwordEncoder.encode("123456");
        String encode2 = passwordEncoder.encode("123456");
        System.out.println(encode1);
        System.out.println(encode2);

        // 验证
        boolean matches1 = passwordEncoder.matches("123456", "$2a$10$Oio8NAgcEi4L42a6wkrh3O7FtAsy5a4iEJ.nCrCNC/HyrPvbFHezO");
        boolean matches2 = passwordEncoder.matches("123456", "$2a$10$Uu2Ja/AmSsFvpxvD.U0yeeQT5FCO5akukka9kHDmAgEzOW79x6rZ1");
        System.out.println(matches1);
        System.out.println(matches2);
    }

    @Autowired
    private UserService userService;
    @Autowired
    private EmpService empService;

    @Test
    public void empList(){
/*         User user = new User();
         user.setUsername("zhangsan");
         User res = userService.login(user);
        System.out.println(res.getChName());*/
        EmpQuery empQuery = new EmpQuery();
        empQuery.setStaffName("张三");
        empQuery.setPage(1);
        empQuery.setLimit(1);
        List<Emp> empList = empService.getEmpList(empQuery);
        System.out.println(empList);

        Long count = empService.countEmpList(empQuery);
        System.out.println(count);

    }

    @Test
    public void deptList(){
/*        List<Dept> allDept = empService.getAllDept();
        System.out.println(allDept);*/
        Emp emp = new Emp();
        //emp.setId(10);
        emp.setSraffNumber("44444");
        emp.setStaffNo("12312341234554");
        emp.setStaffName("玩玩4玩");
        empService.addEmp(emp);

    }

    @Autowired
    private SalService salService;
    @Test
    public void salList(){
/*        List<Dept> allDept = empService.getAllDept();
        System.out.println(allDept);*/
        Salquest salquest = new Salquest();
        salquest.setPage(1);
        salquest.setLimit(5);
        Long aLong = salService.countSalList(salquest);
        List<Salary> salList = salService.getSalList(salquest);
        System.out.println(salList);
    }


}

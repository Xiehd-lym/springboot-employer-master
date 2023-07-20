package cn.qqcn.entity;

import javax.persistence.*;
import java.io.Serializable;

public class Emp implements Serializable {
    /**
     * 
id
     */
    @Id
    private Integer id;

    /**
     * 姓名
     */
    @Column(name = "staff_name")
    private String staffName;

    /**
     * 身份证号
     */
    @Column(name = "staff_no")
    private String staffNo;

    /**
     * 员工编号
     */
    @Column(name = "sraff_number")
    private String sraffNumber;

    /**
     * 性别
     */
    @Column(name = "staff_sex")
    private String staffSex;

    /**
     * 岗位
     */
    @Column(name = "staff_post")
    private String staffPost;

    /**
     * 职务
     */
    @Column(name = "staff_duties")
    private String staffDuties;

    /**
     * 部门
     */
    @Column(name = "staff_department")
    private String staffDepartment;

    /**
     * 出生日期
     */
    @Column(name = "staff_birthday")
    private String staffBirthday;

    /**
     * 年龄
     */
    @Column(name = "staff_age")
    private Integer staffAge;

    /**
     * 民族
     */
    @Column(name = "staff_nation")
    private String staffNation;

    /**
     * 婚姻状况
     */
    @Column(name = "`staff_marital status`")
    private String staffMaritalStatus;

    /**
     * 联系电话
     */
    @Column(name = "staff_phone")
    private String staffPhone;

    /**
     * 入职时间
     */
    @Column(name = "staff_hiredate")
    private String staffHiredate;

    /**
     * 是否试用
     */
    @Column(name = "staff_probation")
    private String staffProbation;

    /**
     * 是否在职
     */
    @Column(name = "staff_onthejob")
    private String staffOnthejob;

    /**
     * 转正日期
     */
    @Column(name = "staff_become_a_regular_worker_data")
    private String staffBecomeARegularWorkerData;

    /**
     * 离职日期
     */
    @Column(name = "staff_leave_office_data")
    private String staffLeaveOfficeData;

    /**
     * 创建日期
     */
    @Column(name = "staff_creation_date")
    private String staffCreationDate;

    /**
     * 修改日期
     */
    @Column(name = "staff_modification_date")
    private String staffModificationDate;

    /**
     * 获取
id
     *
     * @return id - 
id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
id
     *
     * @param id 
id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return staff_name - 姓名
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * 设置姓名
     *
     * @param staffName 姓名
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * 获取身份证号
     *
     * @return staff_no - 身份证号
     */
    public String getStaffNo() {
        return staffNo;
    }

    /**
     * 设置身份证号
     *
     * @param staffNo 身份证号
     */
    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    /**
     * 获取员工编号
     *
     * @return sraff_number - 员工编号
     */
    public String getSraffNumber() {
        return sraffNumber;
    }

    /**
     * 设置员工编号
     *
     * @param sraffNumber 员工编号
     */
    public void setSraffNumber(String sraffNumber) {
        this.sraffNumber = sraffNumber;
    }

    /**
     * 获取性别
     *
     * @return staff_sex - 性别
     */
    public String getStaffSex() {
        return staffSex;
    }

    /**
     * 设置性别
     *
     * @param staffSex 性别
     */
    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex;
    }

    /**
     * 获取岗位
     *
     * @return staff_post - 岗位
     */
    public String getStaffPost() {
        return staffPost;
    }

    /**
     * 设置岗位
     *
     * @param staffPost 岗位
     */
    public void setStaffPost(String staffPost) {
        this.staffPost = staffPost;
    }

    /**
     * 获取职务
     *
     * @return staff_duties - 职务
     */
    public String getStaffDuties() {
        return staffDuties;
    }

    /**
     * 设置职务
     *
     * @param staffDuties 职务
     */
    public void setStaffDuties(String staffDuties) {
        this.staffDuties = staffDuties;
    }

    /**
     * 获取部门
     *
     * @return staff_department - 部门
     */
    public String getStaffDepartment() {
        return staffDepartment;
    }

    /**
     * 设置部门
     *
     * @param staffDepartment 部门
     */
    public void setStaffDepartment(String staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    /**
     * 获取出生日期
     *
     * @return staff_birthday - 出生日期
     */
    public String getStaffBirthday() {
        return staffBirthday;
    }

    /**
     * 设置出生日期
     *
     * @param staffBirthday 出生日期
     */
    public void setStaffBirthday(String staffBirthday) {
        this.staffBirthday = staffBirthday;
    }

    /**
     * 获取年龄
     *
     * @return staff_age - 年龄
     */
    public Integer getStaffAge() {
        return staffAge;
    }

    /**
     * 设置年龄
     *
     * @param staffAge 年龄
     */
    public void setStaffAge(Integer staffAge) {
        this.staffAge = staffAge;
    }

    /**
     * 获取民族
     *
     * @return staff_nation - 民族
     */
    public String getStaffNation() {
        return staffNation;
    }

    /**
     * 设置民族
     *
     * @param staffNation 民族
     */
    public void setStaffNation(String staffNation) {
        this.staffNation = staffNation;
    }

    /**
     * 获取婚姻状况
     *
     * @return staff_marital status - 婚姻状况
     */
    public String getStaffMaritalStatus() {
        return staffMaritalStatus;
    }

    /**
     * 设置婚姻状况
     *
     * @param staffMaritalStatus 婚姻状况
     */
    public void setStaffMaritalStatus(String staffMaritalStatus) {
        this.staffMaritalStatus = staffMaritalStatus;
    }

    /**
     * 获取联系电话
     *
     * @return staff_phone - 联系电话
     */
    public String getStaffPhone() {
        return staffPhone;
    }

    /**
     * 设置联系电话
     *
     * @param staffPhone 联系电话
     */
    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    /**
     * 获取入职时间
     *
     * @return staff_hiredate - 入职时间
     */
    public String getStaffHiredate() {
        return staffHiredate;
    }

    /**
     * 设置入职时间
     *
     * @param staffHiredate 入职时间
     */
    public void setStaffHiredate(String staffHiredate) {
        this.staffHiredate = staffHiredate;
    }

    /**
     * 获取是否试用
     *
     * @return staff_probation - 是否试用
     */
    public String getStaffProbation() {
        return staffProbation;
    }

    /**
     * 设置是否试用
     *
     * @param staffProbation 是否试用
     */
    public void setStaffProbation(String staffProbation) {
        this.staffProbation = staffProbation;
    }

    /**
     * 获取是否在职
     *
     * @return staff_onthejob - 是否在职
     */
    public String getStaffOnthejob() {
        return staffOnthejob;
    }

    /**
     * 设置是否在职
     *
     * @param staffOnthejob 是否在职
     */
    public void setStaffOnthejob(String staffOnthejob) {
        this.staffOnthejob = staffOnthejob;
    }

    /**
     * 获取转正日期
     *
     * @return staff_become_a_regular_worker_data - 转正日期
     */
    public String getStaffBecomeARegularWorkerData() {
        return staffBecomeARegularWorkerData;
    }

    /**
     * 设置转正日期
     *
     * @param staffBecomeARegularWorkerData 转正日期
     */
    public void setStaffBecomeARegularWorkerData(String staffBecomeARegularWorkerData) {
        this.staffBecomeARegularWorkerData = staffBecomeARegularWorkerData;
    }

    /**
     * 获取离职日期
     *
     * @return staff_leave_office_data - 离职日期
     */
    public String getStaffLeaveOfficeData() {
        return staffLeaveOfficeData;
    }

    /**
     * 设置离职日期
     *
     * @param staffLeaveOfficeData 离职日期
     */
    public void setStaffLeaveOfficeData(String staffLeaveOfficeData) {
        this.staffLeaveOfficeData = staffLeaveOfficeData;
    }

    /**
     * 获取创建日期
     *
     * @return staff_creation_date - 创建日期
     */
    public String getStaffCreationDate() {
        return staffCreationDate;
    }

    /**
     * 设置创建日期
     *
     * @param staffCreationDate 创建日期
     */
    public void setStaffCreationDate(String staffCreationDate) {
        this.staffCreationDate = staffCreationDate;
    }

    /**
     * 获取修改日期
     *
     * @return staff_modification_date - 修改日期
     */
    public String getStaffModificationDate() {
        return staffModificationDate;
    }

    /**
     * 设置修改日期
     *
     * @param staffModificationDate 修改日期
     */
    public void setStaffModificationDate(String staffModificationDate) {
        this.staffModificationDate = staffModificationDate;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", staffName='" + staffName + '\'' +
                ", staffNo='" + staffNo + '\'' +
                ", sraffNumber='" + sraffNumber + '\'' +
                ", staffSex='" + staffSex + '\'' +
                ", staffPost='" + staffPost + '\'' +
                ", staffDuties='" + staffDuties + '\'' +
                ", staffDepartment='" + staffDepartment + '\'' +
                ", staffBirthday='" + staffBirthday + '\'' +
                ", staffAge=" + staffAge +
                ", staffNation='" + staffNation + '\'' +
                ", staffMaritalStatus='" + staffMaritalStatus + '\'' +
                ", staffPhone='" + staffPhone + '\'' +
                ", staffHiredate='" + staffHiredate + '\'' +
                ", staffProbation='" + staffProbation + '\'' +
                ", staffOnthejob='" + staffOnthejob + '\'' +
                ", staffBecomeARegularWorkerData='" + staffBecomeARegularWorkerData + '\'' +
                ", staffLeaveOfficeData='" + staffLeaveOfficeData + '\'' +
                ", staffCreationDate='" + staffCreationDate + '\'' +
                ", staffModificationDate='" + staffModificationDate + '\'' +
                '}';
    }
}
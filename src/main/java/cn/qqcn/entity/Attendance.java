package cn.qqcn.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "laydb..attendance")
public class Attendance {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 员工编号
     */
    @Column(name = "sraff_number")
    private String sraffNumber;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 入职时间
     */
    @Column(name = "staff_hiredate")
    private Date staffHiredate;

    /**
     * 实际出勤天数
     */
    @Column(name = "actual_attendance")
    private Integer actualAttendance;

    /**
     * 待岗
     */
    @Column(name = "on_duty")
    private Integer onDuty;

    /**
     * 公休假天数合计
     */
    @Column(name = "total_public_holidays")
    private Integer totalPublicHolidays;

    /**
     * 年休假
     */
    @Column(name = "annual_leave")
    private Integer annualLeave;

    /**
     * 事假
     */
    @Column(name = "compassionate_leave")
    private Integer compassionateLeave;

    /**
     * 病假
     */
    @Column(name = "sick_leave")
    private Integer sickLeave;

    /**
     * 婚假
     */
    @Column(name = "marriage_holiday")
    private Integer marriageHoliday;

    /**
     * 丧假
     */
    @Column(name = "bereavement_leave")
    private Integer bereavementLeave;

    /**
     * 实际产假
     */
    @Column(name = "actual_maternity_leave")
    private Integer actualMaternityLeave;

    /**
     * 小产假
     */
    @Column(name = "minor_maternity_leave")
    private Integer minorMaternityLeave;

    /**
     * 陪产假
     */
    @Column(name = "paternity_leave")
    private Integer paternityLeave;

    /**
     * 休假合计
     */
    @Column(name = "total_leave")
    private Integer totalLeave;

    /**
     * 疫情“四类”情况
     */
    @Column(name = "epidemic_situationof4")
    private Integer epidemicSituationof4;

    /**
     * 弹性迟到
     */
    @Column(name = "flexible_late_arrival")
    private Integer flexibleLateArrival;

    /**
     * 迟到总次数
     */
    @Column(name = "total_late")
    private Integer totalLate;

    /**
     * 迟到15分钟以上1小时以内或15分钟内未补回
     */
    @Column(name = "total_late_repair_15_1t")
    private Integer totalLateRepair151t;

    /**
     * 迟到1小时以上3小时以内
     */
    @Column(name = "total_late_repair_1t_3t")
    private Integer totalLateRepair1t3t;

    /**
     * 迟到3小时以上
     */
    @Column(name = "total_late_repair_exceed_3t")
    private Integer totalLateRepairExceed3t;

    /**
     * 忘记打卡
     */
    @Column(name = "forgot_to_punch")
    private Integer forgotToPunch;

    /**
     * 早退总次数
     */
    @Column(name = "total_of_early_leave")
    private Integer totalOfEarlyLeave;

    /**
     * 早退1小时以内
     */
    @Column(name = "early_leave_1t")
    private Integer earlyLeave1t;

    /**
     * 早退1小时以上3小时以内
     */
    @Column(name = "early_leave_1t_3t")
    private Integer earlyLeave1t3t;

    /**
     * 早退3小时以上
     */
    @Column(name = "early_leave_exceed_3t")
    private Integer earlyLeaveExceed3t;

    /**
     * 旷工
     */
    private Integer absenteeism;

    /**
     * 剩余病假
     */
    @Column(name = "remain_sick_leave")
    private Integer remainSickLeave;

    /**
     * 今年享有年假
     */
    @Column(name = "enjoy_annual_leave")
    private Integer enjoyAnnualLeave;

    /**
     * 累计已休年假
     */
    @Column(name = "accumulated_annua_leave_taken")
    private Integer accumulatedAnnuaLeaveTaken;

    /**
     * 剩余年假
     */
    @Column(name = "remain_annual_leave")
    private Integer remainAnnualLeave;

    /**
     * 上月余假
     */
    @Column(name = "remain_leave_of_last_month")
    private Integer remainLeaveOfLastMonth;

    /**
     * 生日假
     */
    @Column(name = "birthday_leave")
    private Integer birthdayLeave;

    /**
     * 本月公休假
     */
    @Column(name = "public_holiday_of_this_month")
    private Integer publicHolidayOfThisMonth;

    /**
     * 本月公休余假
     */
    @Column(name = "remain_public_holiday_this_month")
    private Integer remainPublicHolidayThisMonth;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取员工姓名
     *
     * @return name - 员工姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置员工姓名
     *
     * @param name 员工姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取入职时间
     *
     * @return staff_hiredate - 入职时间
     */
    public Date getStaffHiredate() {
        return staffHiredate;
    }

    /**
     * 设置入职时间
     *
     * @param staffHiredate 入职时间
     */
    public void setStaffHiredate(Date staffHiredate) {
        this.staffHiredate = staffHiredate;
    }

    /**
     * 获取实际出勤天数
     *
     * @return actual_attendance - 实际出勤天数
     */
    public Integer getActualAttendance() {
        return actualAttendance;
    }

    /**
     * 设置实际出勤天数
     *
     * @param actualAttendance 实际出勤天数
     */
    public void setActualAttendance(Integer actualAttendance) {
        this.actualAttendance = actualAttendance;
    }

    /**
     * 获取待岗
     *
     * @return on_duty - 待岗
     */
    public Integer getOnDuty() {
        return onDuty;
    }

    /**
     * 设置待岗
     *
     * @param onDuty 待岗
     */
    public void setOnDuty(Integer onDuty) {
        this.onDuty = onDuty;
    }

    /**
     * 获取公休假天数合计
     *
     * @return total_public_holidays - 公休假天数合计
     */
    public Integer getTotalPublicHolidays() {
        return totalPublicHolidays;
    }

    /**
     * 设置公休假天数合计
     *
     * @param totalPublicHolidays 公休假天数合计
     */
    public void setTotalPublicHolidays(Integer totalPublicHolidays) {
        this.totalPublicHolidays = totalPublicHolidays;
    }

    /**
     * 获取年休假
     *
     * @return annual_leave - 年休假
     */
    public Integer getAnnualLeave() {
        return annualLeave;
    }

    /**
     * 设置年休假
     *
     * @param annualLeave 年休假
     */
    public void setAnnualLeave(Integer annualLeave) {
        this.annualLeave = annualLeave;
    }

    /**
     * 获取事假
     *
     * @return compassionate_leave - 事假
     */
    public Integer getCompassionateLeave() {
        return compassionateLeave;
    }

    /**
     * 设置事假
     *
     * @param compassionateLeave 事假
     */
    public void setCompassionateLeave(Integer compassionateLeave) {
        this.compassionateLeave = compassionateLeave;
    }

    /**
     * 获取病假
     *
     * @return sick_leave - 病假
     */
    public Integer getSickLeave() {
        return sickLeave;
    }

    /**
     * 设置病假
     *
     * @param sickLeave 病假
     */
    public void setSickLeave(Integer sickLeave) {
        this.sickLeave = sickLeave;
    }

    /**
     * 获取婚假
     *
     * @return marriage_holiday - 婚假
     */
    public Integer getMarriageHoliday() {
        return marriageHoliday;
    }

    /**
     * 设置婚假
     *
     * @param marriageHoliday 婚假
     */
    public void setMarriageHoliday(Integer marriageHoliday) {
        this.marriageHoliday = marriageHoliday;
    }

    /**
     * 获取丧假
     *
     * @return bereavement_leave - 丧假
     */
    public Integer getBereavementLeave() {
        return bereavementLeave;
    }

    /**
     * 设置丧假
     *
     * @param bereavementLeave 丧假
     */
    public void setBereavementLeave(Integer bereavementLeave) {
        this.bereavementLeave = bereavementLeave;
    }

    /**
     * 获取实际产假
     *
     * @return actual_maternity_leave - 实际产假
     */
    public Integer getActualMaternityLeave() {
        return actualMaternityLeave;
    }

    /**
     * 设置实际产假
     *
     * @param actualMaternityLeave 实际产假
     */
    public void setActualMaternityLeave(Integer actualMaternityLeave) {
        this.actualMaternityLeave = actualMaternityLeave;
    }

    /**
     * 获取小产假
     *
     * @return minor_maternity_leave - 小产假
     */
    public Integer getMinorMaternityLeave() {
        return minorMaternityLeave;
    }

    /**
     * 设置小产假
     *
     * @param minorMaternityLeave 小产假
     */
    public void setMinorMaternityLeave(Integer minorMaternityLeave) {
        this.minorMaternityLeave = minorMaternityLeave;
    }

    /**
     * 获取陪产假
     *
     * @return paternity_leave - 陪产假
     */
    public Integer getPaternityLeave() {
        return paternityLeave;
    }

    /**
     * 设置陪产假
     *
     * @param paternityLeave 陪产假
     */
    public void setPaternityLeave(Integer paternityLeave) {
        this.paternityLeave = paternityLeave;
    }

    /**
     * 获取休假合计
     *
     * @return total_leave - 休假合计
     */
    public Integer getTotalLeave() {
        return totalLeave;
    }

    /**
     * 设置休假合计
     *
     * @param totalLeave 休假合计
     */
    public void setTotalLeave(Integer totalLeave) {
        this.totalLeave = totalLeave;
    }

    /**
     * 获取疫情“四类”情况
     *
     * @return epidemic_situationof4 - 疫情“四类”情况
     */
    public Integer getEpidemicSituationof4() {
        return epidemicSituationof4;
    }

    /**
     * 设置疫情“四类”情况
     *
     * @param epidemicSituationof4 疫情“四类”情况
     */
    public void setEpidemicSituationof4(Integer epidemicSituationof4) {
        this.epidemicSituationof4 = epidemicSituationof4;
    }

    /**
     * 获取弹性迟到
     *
     * @return flexible_late_arrival - 弹性迟到
     */
    public Integer getFlexibleLateArrival() {
        return flexibleLateArrival;
    }

    /**
     * 设置弹性迟到
     *
     * @param flexibleLateArrival 弹性迟到
     */
    public void setFlexibleLateArrival(Integer flexibleLateArrival) {
        this.flexibleLateArrival = flexibleLateArrival;
    }

    /**
     * 获取迟到总次数
     *
     * @return total_late - 迟到总次数
     */
    public Integer getTotalLate() {
        return totalLate;
    }

    /**
     * 设置迟到总次数
     *
     * @param totalLate 迟到总次数
     */
    public void setTotalLate(Integer totalLate) {
        this.totalLate = totalLate;
    }

    /**
     * 获取迟到15分钟以上1小时以内或15分钟内未补回
     *
     * @return total_late_repair_15_1t - 迟到15分钟以上1小时以内或15分钟内未补回
     */
    public Integer getTotalLateRepair151t() {
        return totalLateRepair151t;
    }

    /**
     * 设置迟到15分钟以上1小时以内或15分钟内未补回
     *
     * @param totalLateRepair151t 迟到15分钟以上1小时以内或15分钟内未补回
     */
    public void setTotalLateRepair151t(Integer totalLateRepair151t) {
        this.totalLateRepair151t = totalLateRepair151t;
    }

    /**
     * 获取迟到1小时以上3小时以内
     *
     * @return total_late_repair_1t_3t - 迟到1小时以上3小时以内
     */
    public Integer getTotalLateRepair1t3t() {
        return totalLateRepair1t3t;
    }

    /**
     * 设置迟到1小时以上3小时以内
     *
     * @param totalLateRepair1t3t 迟到1小时以上3小时以内
     */
    public void setTotalLateRepair1t3t(Integer totalLateRepair1t3t) {
        this.totalLateRepair1t3t = totalLateRepair1t3t;
    }

    /**
     * 获取迟到3小时以上
     *
     * @return total_late_repair_exceed_3t - 迟到3小时以上
     */
    public Integer getTotalLateRepairExceed3t() {
        return totalLateRepairExceed3t;
    }

    /**
     * 设置迟到3小时以上
     *
     * @param totalLateRepairExceed3t 迟到3小时以上
     */
    public void setTotalLateRepairExceed3t(Integer totalLateRepairExceed3t) {
        this.totalLateRepairExceed3t = totalLateRepairExceed3t;
    }

    /**
     * 获取忘记打卡
     *
     * @return forgot_to_punch - 忘记打卡
     */
    public Integer getForgotToPunch() {
        return forgotToPunch;
    }

    /**
     * 设置忘记打卡
     *
     * @param forgotToPunch 忘记打卡
     */
    public void setForgotToPunch(Integer forgotToPunch) {
        this.forgotToPunch = forgotToPunch;
    }

    /**
     * 获取早退总次数
     *
     * @return total_of_early_leave - 早退总次数
     */
    public Integer getTotalOfEarlyLeave() {
        return totalOfEarlyLeave;
    }

    /**
     * 设置早退总次数
     *
     * @param totalOfEarlyLeave 早退总次数
     */
    public void setTotalOfEarlyLeave(Integer totalOfEarlyLeave) {
        this.totalOfEarlyLeave = totalOfEarlyLeave;
    }

    /**
     * 获取早退1小时以内
     *
     * @return early_leave_1t - 早退1小时以内
     */
    public Integer getEarlyLeave1t() {
        return earlyLeave1t;
    }

    /**
     * 设置早退1小时以内
     *
     * @param earlyLeave1t 早退1小时以内
     */
    public void setEarlyLeave1t(Integer earlyLeave1t) {
        this.earlyLeave1t = earlyLeave1t;
    }

    /**
     * 获取早退1小时以上3小时以内
     *
     * @return early_leave_1t_3t - 早退1小时以上3小时以内
     */
    public Integer getEarlyLeave1t3t() {
        return earlyLeave1t3t;
    }

    /**
     * 设置早退1小时以上3小时以内
     *
     * @param earlyLeave1t3t 早退1小时以上3小时以内
     */
    public void setEarlyLeave1t3t(Integer earlyLeave1t3t) {
        this.earlyLeave1t3t = earlyLeave1t3t;
    }

    /**
     * 获取早退3小时以上
     *
     * @return early_leave_exceed_3t - 早退3小时以上
     */
    public Integer getEarlyLeaveExceed3t() {
        return earlyLeaveExceed3t;
    }

    /**
     * 设置早退3小时以上
     *
     * @param earlyLeaveExceed3t 早退3小时以上
     */
    public void setEarlyLeaveExceed3t(Integer earlyLeaveExceed3t) {
        this.earlyLeaveExceed3t = earlyLeaveExceed3t;
    }

    /**
     * 获取旷工
     *
     * @return absenteeism - 旷工
     */
    public Integer getAbsenteeism() {
        return absenteeism;
    }

    /**
     * 设置旷工
     *
     * @param absenteeism 旷工
     */
    public void setAbsenteeism(Integer absenteeism) {
        this.absenteeism = absenteeism;
    }

    /**
     * 获取剩余病假
     *
     * @return remain_sick_leave - 剩余病假
     */
    public Integer getRemainSickLeave() {
        return remainSickLeave;
    }

    /**
     * 设置剩余病假
     *
     * @param remainSickLeave 剩余病假
     */
    public void setRemainSickLeave(Integer remainSickLeave) {
        this.remainSickLeave = remainSickLeave;
    }

    /**
     * 获取今年享有年假
     *
     * @return enjoy_annual_leave - 今年享有年假
     */
    public Integer getEnjoyAnnualLeave() {
        return enjoyAnnualLeave;
    }

    /**
     * 设置今年享有年假
     *
     * @param enjoyAnnualLeave 今年享有年假
     */
    public void setEnjoyAnnualLeave(Integer enjoyAnnualLeave) {
        this.enjoyAnnualLeave = enjoyAnnualLeave;
    }

    /**
     * 获取累计已休年假
     *
     * @return accumulated_annua_leave_taken - 累计已休年假
     */
    public Integer getAccumulatedAnnuaLeaveTaken() {
        return accumulatedAnnuaLeaveTaken;
    }

    /**
     * 设置累计已休年假
     *
     * @param accumulatedAnnuaLeaveTaken 累计已休年假
     */
    public void setAccumulatedAnnuaLeaveTaken(Integer accumulatedAnnuaLeaveTaken) {
        this.accumulatedAnnuaLeaveTaken = accumulatedAnnuaLeaveTaken;
    }

    /**
     * 获取剩余年假
     *
     * @return remain_annual_leave - 剩余年假
     */
    public Integer getRemainAnnualLeave() {
        return remainAnnualLeave;
    }

    /**
     * 设置剩余年假
     *
     * @param remainAnnualLeave 剩余年假
     */
    public void setRemainAnnualLeave(Integer remainAnnualLeave) {
        this.remainAnnualLeave = remainAnnualLeave;
    }

    /**
     * 获取上月余假
     *
     * @return remain_leave_of_last_month - 上月余假
     */
    public Integer getRemainLeaveOfLastMonth() {
        return remainLeaveOfLastMonth;
    }

    /**
     * 设置上月余假
     *
     * @param remainLeaveOfLastMonth 上月余假
     */
    public void setRemainLeaveOfLastMonth(Integer remainLeaveOfLastMonth) {
        this.remainLeaveOfLastMonth = remainLeaveOfLastMonth;
    }

    /**
     * 获取生日假
     *
     * @return birthday_leave - 生日假
     */
    public Integer getBirthdayLeave() {
        return birthdayLeave;
    }

    /**
     * 设置生日假
     *
     * @param birthdayLeave 生日假
     */
    public void setBirthdayLeave(Integer birthdayLeave) {
        this.birthdayLeave = birthdayLeave;
    }

    /**
     * 获取本月公休假
     *
     * @return public_holiday_of_this_month - 本月公休假
     */
    public Integer getPublicHolidayOfThisMonth() {
        return publicHolidayOfThisMonth;
    }

    /**
     * 设置本月公休假
     *
     * @param publicHolidayOfThisMonth 本月公休假
     */
    public void setPublicHolidayOfThisMonth(Integer publicHolidayOfThisMonth) {
        this.publicHolidayOfThisMonth = publicHolidayOfThisMonth;
    }

    /**
     * 获取本月公休余假
     *
     * @return remain_public_holiday_this_month - 本月公休余假
     */
    public Integer getRemainPublicHolidayThisMonth() {
        return remainPublicHolidayThisMonth;
    }

    /**
     * 设置本月公休余假
     *
     * @param remainPublicHolidayThisMonth 本月公休余假
     */
    public void setRemainPublicHolidayThisMonth(Integer remainPublicHolidayThisMonth) {
        this.remainPublicHolidayThisMonth = remainPublicHolidayThisMonth;
    }
}
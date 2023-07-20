package cn.qqcn.entity;

import javax.persistence.*;
import java.io.Serializable;

public class Salary implements Serializable {
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
     * 所属部门
     */
    private String department;

    /**
     * 所属单位
     */
    private String unit;

    /**
     * 月份
     */
    private String month;

    /**
     * 本月应缴个税款
     */
    @Column(name = "tax_payable_this_month")
    private String taxPayableThisMonth;

    /**
     * 应发金额
     */
    @Column(name = "payable_amount")
    private String payableAmount;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 本月计薪天数
     */
    @Column(name = "salary_days_in_this_month")
    private Integer salaryDaysInThisMonth;

    /**
     * 原岗位工资标准
     */
    @Column(name = "standard_of_original_post")
    private String standardOfOriginalPost;

    /**
     * 岗位工资
     */
    @Column(name = "post_salary")
    private String postSalary;

    /**
     * 全勤奖
     */
    @Column(name = "full_attendance_bonus_reward")
    private String fullAttendanceBonusReward;

    /**
     * 社保补贴
     */
    @Column(name = "social_security_subsidy")
    private String socialSecuritySubsidy;

    /**
     * 评比5S首位奖励
     */
    @Column(name = "the_first_award_of_5S")
    private String theFirstAwardOf5s;

    /**
     * 其他补贴
     */
    @Column(name = "other_subsidies")
    private String otherSubsidies;

    /**
     * 补发工资
     */
    @Column(name = "reissue_salary")
    private String reissueSalary;

    /**
     * 标准工资项合计
     */
    @Column(name = "total_standard_salary_items")
    private String totalStandardSalaryItems;

    /**
     * 事假扣款
     */
    @Column(name = "personal_leave_deduction")
    private String personalLeaveDeduction;

    /**
     * 病假扣款
     */
    @Column(name = "deduction_for_sick_leave")
    private String deductionForSickLeave;

    /**
     * 旷工扣款
     */
    @Column(name = "deduction_for_absenteeism")
    private String deductionForAbsenteeism;

    /**
     * 迟到扣款
     */
    @Column(name = "late_deduction")
    private String lateDeduction;

    /**
     * 忘打卡扣款
     */
    @Column(name = "forget_to_punch_in_and_deduct")
    private String forgetToPunchInAndDeduct;

    /**
     * 早退扣款
     */
    @Column(name = "deduction_for_early_leave")
    private String deductionForEarlyLeave;

    /**
     * 考勤扣款合计
     */
    @Column(name = "total_attendance_deduction")
    private String totalAttendanceDeduction;

    /**
     * 评比5s末位罚款
     */
    @Column(name = "final_penalty_in_5S_evaluation")
    private String finalPenaltyIn5sEvaluation;

    /**
     * 追扣工资
     */
    @Column(name = "salary_deduction")
    private String salaryDeduction;

    /**
     * 其它扣款
     */
    @Column(name = "other_deductions")
    private String otherDeductions;

    /**
     * 扣款合计
     */
    @Column(name = "total_deduction")
    private String totalDeduction;

    /**
     * 代缴个人社保
     */
    @Column(name = "pay_personal_social_insurance_on_behalf")
    private String payPersonalSocialInsuranceOnBehalf;

    /**
     * 代缴个人公积金
     */
    @Column(name = "payment_of_individual_accumulation_fund")
    private String paymentOfIndividualAccumulationFund;

    /**
     * 其他代缴
     */
    @Column(name = "other_payments")
    private String otherPayments;

    /**
     * 续费提成
     */
    @Column(name = "renewal_commission")
    private String renewalCommission;

    /**
     * 团队业绩
     */
    @Column(name = "team_performance")
    private String teamPerformance;

    /**
     * 团队课消
     */
    @Column(name = "team_class_elimination")
    private String teamClassElimination;

    /**
     * 个人课消
     */
    @Column(name = "personal_elimination")
    private String personalElimination;

    /**
     * 往期协议提留
     */
    @Column(name = "retention_from_previous_agreements")
    private String retentionFromPreviousAgreements;

    /**
     * 其他奖励
     */
    @Column(name = "other_awards")
    private String otherAwards;

    /**
     * 关系单提成
     */
    @Column(name = "commission_of_relation_sheet")
    private String commissionOfRelationSheet;

    /**
     * 排课员提成
     */
    @Column(name = "course_setter_draw_a_percentage")
    private String courseSetterDrawAPercentage;

    /**
     * 招聘提成
     */
    @Column(name = "name_recruit_draw_a_percentage")
    private String nameRecruitDrawAPercentage;

    /**
     * 进电直访提成
     */
    @Column(name = "telephone_interview_draw_a_percentage")
    private String telephoneInterviewDrawAPercentage;

    /**
     * 补发提成
     */
    @Column(name = "reissue_draw_a_percentage")
    private String reissueDrawAPercentage;

    /**
     * 本月退费扣款
     */
    @Column(name = "refund_and_deduction_of_this_month")
    private String refundAndDeductionOfThisMonth;

    /**
     * 本月应发提成
     */
    @Column(name = "commission_payable_this_month")
    private String commissionPayableThisMonth;

    /**
     * 本月实发提成
     */
    @Column(name = "commission_actually_paid_this_month")
    private String commissionActuallyPaidThisMonth;

    /**
     * 兼职课酬
     */
    @Column(name = "part_time_salary")
    private String partTimeSalary;

    /**
     * 兼职课时
     */
    @Column(name = "part_time_class_hours")
    private String partTimeClassHours;

    /**
     * 专职课酬
     */
    @Column(name = "full_time_remuneration")
    private String fullTimeRemuneration;

    /**
     * 专职课时
     */
    @Column(name = "full_time_class_hours")
    private String fullTimeClassHours;

    /**
     * 课酬追补追扣
     */
    @Column(name = "remuneration_other")
    private String remunerationOther;

    /**
     * 其他课酬奖励
     */
    @Column(name = "other_remuneration_awards")
    private String otherRemunerationAwards;

    /**
     * 课酬合计
     */
    @Column(name = "total_remuneration")
    private String totalRemuneration;

    /**
     * 绩效标准
     */
    @Column(name = "performance_criteria")
    private String performanceCriteria;

    /**
     * 薪资天数
     */
    @Column(name = "pay_days")
    private String payDays;

    /**
     * 绩效基数
     */
    @Column(name = "performance_base")
    private String performanceBase;

    /**
     * 绩效分
     */
    @Column(name = "performance_score")
    private String performanceScore;

    /**
     * 绩效比例
     */
    @Column(name = "performance_ratio")
    private String performanceRatio;

    /**
     * 实发金额
     */
    @Column(name = "actual_amount_money")
    private String actualAmountMoney;

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
     * 获取所属部门
     *
     * @return department - 所属部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置所属部门
     *
     * @param department 所属部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取所属单位
     *
     * @return unit - 所属单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置所属单位
     *
     * @param unit 所属单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取月份
     *
     * @return month - 月份
     */
    public String getMonth() {
        return month;
    }

    /**
     * 设置月份
     *
     * @param month 月份
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * 获取本月应缴个税款
     *
     * @return tax_payable_this_month - 本月应缴个税款
     */
    public String getTaxPayableThisMonth() {
        return taxPayableThisMonth;
    }

    /**
     * 设置本月应缴个税款
     *
     * @param taxPayableThisMonth 本月应缴个税款
     */
    public void setTaxPayableThisMonth(String taxPayableThisMonth) {
        this.taxPayableThisMonth = taxPayableThisMonth;
    }

    /**
     * 获取应发金额
     *
     * @return payable_amount - 应发金额
     */
    public String getPayableAmount() {
        return payableAmount;
    }

    /**
     * 设置应发金额
     *
     * @param payableAmount 应发金额
     */
    public void setPayableAmount(String payableAmount) {
        this.payableAmount = payableAmount;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取本月计薪天数
     *
     * @return salary_days_in_this_month - 本月计薪天数
     */
    public Integer getSalaryDaysInThisMonth() {
        return salaryDaysInThisMonth;
    }

    /**
     * 设置本月计薪天数
     *
     * @param salaryDaysInThisMonth 本月计薪天数
     */
    public void setSalaryDaysInThisMonth(Integer salaryDaysInThisMonth) {
        this.salaryDaysInThisMonth = salaryDaysInThisMonth;
    }

    /**
     * 获取原岗位工资标准
     *
     * @return standard_of_original_post - 原岗位工资标准
     */
    public String getStandardOfOriginalPost() {
        return standardOfOriginalPost;
    }

    /**
     * 设置原岗位工资标准
     *
     * @param standardOfOriginalPost 原岗位工资标准
     */
    public void setStandardOfOriginalPost(String standardOfOriginalPost) {
        this.standardOfOriginalPost = standardOfOriginalPost;
    }

    /**
     * 获取岗位工资
     *
     * @return post_salary - 岗位工资
     */
    public String getPostSalary() {
        return postSalary;
    }

    /**
     * 设置岗位工资
     *
     * @param postSalary 岗位工资
     */
    public void setPostSalary(String postSalary) {
        this.postSalary = postSalary;
    }

    /**
     * 获取全勤奖
     *
     * @return full_attendance_bonus_reward - 全勤奖
     */
    public String getFullAttendanceBonusReward() {
        return fullAttendanceBonusReward;
    }

    /**
     * 设置全勤奖
     *
     * @param fullAttendanceBonusReward 全勤奖
     */
    public void setFullAttendanceBonusReward(String fullAttendanceBonusReward) {
        this.fullAttendanceBonusReward = fullAttendanceBonusReward;
    }

    /**
     * 获取社保补贴
     *
     * @return social_security_subsidy - 社保补贴
     */
    public String getSocialSecuritySubsidy() {
        return socialSecuritySubsidy;
    }

    /**
     * 设置社保补贴
     *
     * @param socialSecuritySubsidy 社保补贴
     */
    public void setSocialSecuritySubsidy(String socialSecuritySubsidy) {
        this.socialSecuritySubsidy = socialSecuritySubsidy;
    }

    /**
     * 获取评比5S首位奖励
     *
     * @return the_first_award_of_5S - 评比5S首位奖励
     */
    public String getTheFirstAwardOf5s() {
        return theFirstAwardOf5s;
    }

    /**
     * 设置评比5S首位奖励
     *
     * @param theFirstAwardOf5s 评比5S首位奖励
     */
    public void setTheFirstAwardOf5s(String theFirstAwardOf5s) {
        this.theFirstAwardOf5s = theFirstAwardOf5s;
    }

    /**
     * 获取其他补贴
     *
     * @return other_subsidies - 其他补贴
     */
    public String getOtherSubsidies() {
        return otherSubsidies;
    }

    /**
     * 设置其他补贴
     *
     * @param otherSubsidies 其他补贴
     */
    public void setOtherSubsidies(String otherSubsidies) {
        this.otherSubsidies = otherSubsidies;
    }

    /**
     * 获取补发工资
     *
     * @return reissue_salary - 补发工资
     */
    public String getReissueSalary() {
        return reissueSalary;
    }

    /**
     * 设置补发工资
     *
     * @param reissueSalary 补发工资
     */
    public void setReissueSalary(String reissueSalary) {
        this.reissueSalary = reissueSalary;
    }

    /**
     * 获取标准工资项合计
     *
     * @return total_standard_salary_items - 标准工资项合计
     */
    public String getTotalStandardSalaryItems() {
        return totalStandardSalaryItems;
    }

    /**
     * 设置标准工资项合计
     *
     * @param totalStandardSalaryItems 标准工资项合计
     */
    public void setTotalStandardSalaryItems(String totalStandardSalaryItems) {
        this.totalStandardSalaryItems = totalStandardSalaryItems;
    }

    /**
     * 获取事假扣款
     *
     * @return personal_leave_deduction - 事假扣款
     */
    public String getPersonalLeaveDeduction() {
        return personalLeaveDeduction;
    }

    /**
     * 设置事假扣款
     *
     * @param personalLeaveDeduction 事假扣款
     */
    public void setPersonalLeaveDeduction(String personalLeaveDeduction) {
        this.personalLeaveDeduction = personalLeaveDeduction;
    }

    /**
     * 获取病假扣款
     *
     * @return deduction_for_sick_leave - 病假扣款
     */
    public String getDeductionForSickLeave() {
        return deductionForSickLeave;
    }

    /**
     * 设置病假扣款
     *
     * @param deductionForSickLeave 病假扣款
     */
    public void setDeductionForSickLeave(String deductionForSickLeave) {
        this.deductionForSickLeave = deductionForSickLeave;
    }

    /**
     * 获取旷工扣款
     *
     * @return deduction_for_absenteeism - 旷工扣款
     */
    public String getDeductionForAbsenteeism() {
        return deductionForAbsenteeism;
    }

    /**
     * 设置旷工扣款
     *
     * @param deductionForAbsenteeism 旷工扣款
     */
    public void setDeductionForAbsenteeism(String deductionForAbsenteeism) {
        this.deductionForAbsenteeism = deductionForAbsenteeism;
    }

    /**
     * 获取迟到扣款
     *
     * @return late_deduction - 迟到扣款
     */
    public String getLateDeduction() {
        return lateDeduction;
    }

    /**
     * 设置迟到扣款
     *
     * @param lateDeduction 迟到扣款
     */
    public void setLateDeduction(String lateDeduction) {
        this.lateDeduction = lateDeduction;
    }

    /**
     * 获取忘打卡扣款
     *
     * @return forget_to_punch_in_and_deduct - 忘打卡扣款
     */
    public String getForgetToPunchInAndDeduct() {
        return forgetToPunchInAndDeduct;
    }

    /**
     * 设置忘打卡扣款
     *
     * @param forgetToPunchInAndDeduct 忘打卡扣款
     */
    public void setForgetToPunchInAndDeduct(String forgetToPunchInAndDeduct) {
        this.forgetToPunchInAndDeduct = forgetToPunchInAndDeduct;
    }

    /**
     * 获取早退扣款
     *
     * @return deduction_for_early_leave - 早退扣款
     */
    public String getDeductionForEarlyLeave() {
        return deductionForEarlyLeave;
    }

    /**
     * 设置早退扣款
     *
     * @param deductionForEarlyLeave 早退扣款
     */
    public void setDeductionForEarlyLeave(String deductionForEarlyLeave) {
        this.deductionForEarlyLeave = deductionForEarlyLeave;
    }

    /**
     * 获取考勤扣款合计
     *
     * @return total_attendance_deduction - 考勤扣款合计
     */
    public String getTotalAttendanceDeduction() {
        return totalAttendanceDeduction;
    }

    /**
     * 设置考勤扣款合计
     *
     * @param totalAttendanceDeduction 考勤扣款合计
     */
    public void setTotalAttendanceDeduction(String totalAttendanceDeduction) {
        this.totalAttendanceDeduction = totalAttendanceDeduction;
    }

    /**
     * 获取评比5s末位罚款
     *
     * @return final_penalty_in_5S_evaluation - 评比5s末位罚款
     */
    public String getFinalPenaltyIn5sEvaluation() {
        return finalPenaltyIn5sEvaluation;
    }

    /**
     * 设置评比5s末位罚款
     *
     * @param finalPenaltyIn5sEvaluation 评比5s末位罚款
     */
    public void setFinalPenaltyIn5sEvaluation(String finalPenaltyIn5sEvaluation) {
        this.finalPenaltyIn5sEvaluation = finalPenaltyIn5sEvaluation;
    }

    /**
     * 获取追扣工资
     *
     * @return salary_deduction - 追扣工资
     */
    public String getSalaryDeduction() {
        return salaryDeduction;
    }

    /**
     * 设置追扣工资
     *
     * @param salaryDeduction 追扣工资
     */
    public void setSalaryDeduction(String salaryDeduction) {
        this.salaryDeduction = salaryDeduction;
    }

    /**
     * 获取其它扣款
     *
     * @return other_deductions - 其它扣款
     */
    public String getOtherDeductions() {
        return otherDeductions;
    }

    /**
     * 设置其它扣款
     *
     * @param otherDeductions 其它扣款
     */
    public void setOtherDeductions(String otherDeductions) {
        this.otherDeductions = otherDeductions;
    }

    /**
     * 获取扣款合计
     *
     * @return total_deduction - 扣款合计
     */
    public String getTotalDeduction() {
        return totalDeduction;
    }

    /**
     * 设置扣款合计
     *
     * @param totalDeduction 扣款合计
     */
    public void setTotalDeduction(String totalDeduction) {
        this.totalDeduction = totalDeduction;
    }

    /**
     * 获取代缴个人社保
     *
     * @return pay_personal_social_insurance_on_behalf - 代缴个人社保
     */
    public String getPayPersonalSocialInsuranceOnBehalf() {
        return payPersonalSocialInsuranceOnBehalf;
    }

    /**
     * 设置代缴个人社保
     *
     * @param payPersonalSocialInsuranceOnBehalf 代缴个人社保
     */
    public void setPayPersonalSocialInsuranceOnBehalf(String payPersonalSocialInsuranceOnBehalf) {
        this.payPersonalSocialInsuranceOnBehalf = payPersonalSocialInsuranceOnBehalf;
    }

    /**
     * 获取代缴个人公积金
     *
     * @return payment_of_individual_accumulation_fund - 代缴个人公积金
     */
    public String getPaymentOfIndividualAccumulationFund() {
        return paymentOfIndividualAccumulationFund;
    }

    /**
     * 设置代缴个人公积金
     *
     * @param paymentOfIndividualAccumulationFund 代缴个人公积金
     */
    public void setPaymentOfIndividualAccumulationFund(String paymentOfIndividualAccumulationFund) {
        this.paymentOfIndividualAccumulationFund = paymentOfIndividualAccumulationFund;
    }

    /**
     * 获取其他代缴
     *
     * @return other_payments - 其他代缴
     */
    public String getOtherPayments() {
        return otherPayments;
    }

    /**
     * 设置其他代缴
     *
     * @param otherPayments 其他代缴
     */
    public void setOtherPayments(String otherPayments) {
        this.otherPayments = otherPayments;
    }

    /**
     * 获取续费提成
     *
     * @return renewal_commission - 续费提成
     */
    public String getRenewalCommission() {
        return renewalCommission;
    }

    /**
     * 设置续费提成
     *
     * @param renewalCommission 续费提成
     */
    public void setRenewalCommission(String renewalCommission) {
        this.renewalCommission = renewalCommission;
    }

    /**
     * 获取团队业绩
     *
     * @return team_performance - 团队业绩
     */
    public String getTeamPerformance() {
        return teamPerformance;
    }

    /**
     * 设置团队业绩
     *
     * @param teamPerformance 团队业绩
     */
    public void setTeamPerformance(String teamPerformance) {
        this.teamPerformance = teamPerformance;
    }

    /**
     * 获取团队课消
     *
     * @return team_class_elimination - 团队课消
     */
    public String getTeamClassElimination() {
        return teamClassElimination;
    }

    /**
     * 设置团队课消
     *
     * @param teamClassElimination 团队课消
     */
    public void setTeamClassElimination(String teamClassElimination) {
        this.teamClassElimination = teamClassElimination;
    }

    /**
     * 获取个人课消
     *
     * @return personal_elimination - 个人课消
     */
    public String getPersonalElimination() {
        return personalElimination;
    }

    /**
     * 设置个人课消
     *
     * @param personalElimination 个人课消
     */
    public void setPersonalElimination(String personalElimination) {
        this.personalElimination = personalElimination;
    }

    /**
     * 获取往期协议提留
     *
     * @return retention_from_previous_agreements - 往期协议提留
     */
    public String getRetentionFromPreviousAgreements() {
        return retentionFromPreviousAgreements;
    }

    /**
     * 设置往期协议提留
     *
     * @param retentionFromPreviousAgreements 往期协议提留
     */
    public void setRetentionFromPreviousAgreements(String retentionFromPreviousAgreements) {
        this.retentionFromPreviousAgreements = retentionFromPreviousAgreements;
    }

    /**
     * 获取其他奖励
     *
     * @return other_awards - 其他奖励
     */
    public String getOtherAwards() {
        return otherAwards;
    }

    /**
     * 设置其他奖励
     *
     * @param otherAwards 其他奖励
     */
    public void setOtherAwards(String otherAwards) {
        this.otherAwards = otherAwards;
    }

    /**
     * 获取关系单提成
     *
     * @return commission_of_relation_sheet - 关系单提成
     */
    public String getCommissionOfRelationSheet() {
        return commissionOfRelationSheet;
    }

    /**
     * 设置关系单提成
     *
     * @param commissionOfRelationSheet 关系单提成
     */
    public void setCommissionOfRelationSheet(String commissionOfRelationSheet) {
        this.commissionOfRelationSheet = commissionOfRelationSheet;
    }

    /**
     * 获取排课员提成
     *
     * @return course_setter_draw_a_percentage - 排课员提成
     */
    public String getCourseSetterDrawAPercentage() {
        return courseSetterDrawAPercentage;
    }

    /**
     * 设置排课员提成
     *
     * @param courseSetterDrawAPercentage 排课员提成
     */
    public void setCourseSetterDrawAPercentage(String courseSetterDrawAPercentage) {
        this.courseSetterDrawAPercentage = courseSetterDrawAPercentage;
    }

    /**
     * 获取招聘提成
     *
     * @return name_recruit_draw_a_percentage - 招聘提成
     */
    public String getNameRecruitDrawAPercentage() {
        return nameRecruitDrawAPercentage;
    }

    /**
     * 设置招聘提成
     *
     * @param nameRecruitDrawAPercentage 招聘提成
     */
    public void setNameRecruitDrawAPercentage(String nameRecruitDrawAPercentage) {
        this.nameRecruitDrawAPercentage = nameRecruitDrawAPercentage;
    }

    /**
     * 获取进电直访提成
     *
     * @return telephone_interview_draw_a_percentage - 进电直访提成
     */
    public String getTelephoneInterviewDrawAPercentage() {
        return telephoneInterviewDrawAPercentage;
    }

    /**
     * 设置进电直访提成
     *
     * @param telephoneInterviewDrawAPercentage 进电直访提成
     */
    public void setTelephoneInterviewDrawAPercentage(String telephoneInterviewDrawAPercentage) {
        this.telephoneInterviewDrawAPercentage = telephoneInterviewDrawAPercentage;
    }

    /**
     * 获取补发提成
     *
     * @return reissue_draw_a_percentage - 补发提成
     */
    public String getReissueDrawAPercentage() {
        return reissueDrawAPercentage;
    }

    /**
     * 设置补发提成
     *
     * @param reissueDrawAPercentage 补发提成
     */
    public void setReissueDrawAPercentage(String reissueDrawAPercentage) {
        this.reissueDrawAPercentage = reissueDrawAPercentage;
    }

    /**
     * 获取本月退费扣款
     *
     * @return refund_and_deduction_of_this_month - 本月退费扣款
     */
    public String getRefundAndDeductionOfThisMonth() {
        return refundAndDeductionOfThisMonth;
    }

    /**
     * 设置本月退费扣款
     *
     * @param refundAndDeductionOfThisMonth 本月退费扣款
     */
    public void setRefundAndDeductionOfThisMonth(String refundAndDeductionOfThisMonth) {
        this.refundAndDeductionOfThisMonth = refundAndDeductionOfThisMonth;
    }

    /**
     * 获取本月应发提成
     *
     * @return commission_payable_this_month - 本月应发提成
     */
    public String getCommissionPayableThisMonth() {
        return commissionPayableThisMonth;
    }

    /**
     * 设置本月应发提成
     *
     * @param commissionPayableThisMonth 本月应发提成
     */
    public void setCommissionPayableThisMonth(String commissionPayableThisMonth) {
        this.commissionPayableThisMonth = commissionPayableThisMonth;
    }

    /**
     * 获取本月实发提成
     *
     * @return commission_actually_paid_this_month - 本月实发提成
     */
    public String getCommissionActuallyPaidThisMonth() {
        return commissionActuallyPaidThisMonth;
    }

    /**
     * 设置本月实发提成
     *
     * @param commissionActuallyPaidThisMonth 本月实发提成
     */
    public void setCommissionActuallyPaidThisMonth(String commissionActuallyPaidThisMonth) {
        this.commissionActuallyPaidThisMonth = commissionActuallyPaidThisMonth;
    }

    /**
     * 获取兼职课酬
     *
     * @return part_time_salary - 兼职课酬
     */
    public String getPartTimeSalary() {
        return partTimeSalary;
    }

    /**
     * 设置兼职课酬
     *
     * @param partTimeSalary 兼职课酬
     */
    public void setPartTimeSalary(String partTimeSalary) {
        this.partTimeSalary = partTimeSalary;
    }

    /**
     * 获取兼职课时
     *
     * @return part_time_class_hours - 兼职课时
     */
    public String getPartTimeClassHours() {
        return partTimeClassHours;
    }

    /**
     * 设置兼职课时
     *
     * @param partTimeClassHours 兼职课时
     */
    public void setPartTimeClassHours(String partTimeClassHours) {
        this.partTimeClassHours = partTimeClassHours;
    }

    /**
     * 获取专职课酬
     *
     * @return full_time_remuneration - 专职课酬
     */
    public String getFullTimeRemuneration() {
        return fullTimeRemuneration;
    }

    /**
     * 设置专职课酬
     *
     * @param fullTimeRemuneration 专职课酬
     */
    public void setFullTimeRemuneration(String fullTimeRemuneration) {
        this.fullTimeRemuneration = fullTimeRemuneration;
    }

    /**
     * 获取专职课时
     *
     * @return full_time_class_hours - 专职课时
     */
    public String getFullTimeClassHours() {
        return fullTimeClassHours;
    }

    /**
     * 设置专职课时
     *
     * @param fullTimeClassHours 专职课时
     */
    public void setFullTimeClassHours(String fullTimeClassHours) {
        this.fullTimeClassHours = fullTimeClassHours;
    }

    /**
     * 获取课酬追补追扣
     *
     * @return remuneration_other - 课酬追补追扣
     */
    public String getRemunerationOther() {
        return remunerationOther;
    }

    /**
     * 设置课酬追补追扣
     *
     * @param remunerationOther 课酬追补追扣
     */
    public void setRemunerationOther(String remunerationOther) {
        this.remunerationOther = remunerationOther;
    }

    /**
     * 获取其他课酬奖励
     *
     * @return other_remuneration_awards - 其他课酬奖励
     */
    public String getOtherRemunerationAwards() {
        return otherRemunerationAwards;
    }

    /**
     * 设置其他课酬奖励
     *
     * @param otherRemunerationAwards 其他课酬奖励
     */
    public void setOtherRemunerationAwards(String otherRemunerationAwards) {
        this.otherRemunerationAwards = otherRemunerationAwards;
    }

    /**
     * 获取课酬合计
     *
     * @return total_remuneration - 课酬合计
     */
    public String getTotalRemuneration() {
        return totalRemuneration;
    }

    /**
     * 设置课酬合计
     *
     * @param totalRemuneration 课酬合计
     */
    public void setTotalRemuneration(String totalRemuneration) {
        this.totalRemuneration = totalRemuneration;
    }

    /**
     * 获取绩效标准
     *
     * @return performance_criteria - 绩效标准
     */
    public String getPerformanceCriteria() {
        return performanceCriteria;
    }

    /**
     * 设置绩效标准
     *
     * @param performanceCriteria 绩效标准
     */
    public void setPerformanceCriteria(String performanceCriteria) {
        this.performanceCriteria = performanceCriteria;
    }

    /**
     * 获取薪资天数
     *
     * @return pay_days - 薪资天数
     */
    public String getPayDays() {
        return payDays;
    }

    /**
     * 设置薪资天数
     *
     * @param payDays 薪资天数
     */
    public void setPayDays(String payDays) {
        this.payDays = payDays;
    }

    /**
     * 获取绩效基数
     *
     * @return performance_base - 绩效基数
     */
    public String getPerformanceBase() {
        return performanceBase;
    }

    /**
     * 设置绩效基数
     *
     * @param performanceBase 绩效基数
     */
    public void setPerformanceBase(String performanceBase) {
        this.performanceBase = performanceBase;
    }

    /**
     * 获取绩效分
     *
     * @return performance_score - 绩效分
     */
    public String getPerformanceScore() {
        return performanceScore;
    }

    /**
     * 设置绩效分
     *
     * @param performanceScore 绩效分
     */
    public void setPerformanceScore(String performanceScore) {
        this.performanceScore = performanceScore;
    }

    /**
     * 获取绩效比例
     *
     * @return performance_ratio - 绩效比例
     */
    public String getPerformanceRatio() {
        return performanceRatio;
    }

    /**
     * 设置绩效比例
     *
     * @param performanceRatio 绩效比例
     */
    public void setPerformanceRatio(String performanceRatio) {
        this.performanceRatio = performanceRatio;
    }

    /**
     * 获取实发金额
     *
     * @return actual_amount_money - 实发金额
     */
    public String getActualAmountMoney() {
        return actualAmountMoney;
    }

    /**
     * 设置实发金额
     *
     * @param actualAmountMoney 实发金额
     */
    public void setActualAmountMoney(String actualAmountMoney) {
        this.actualAmountMoney = actualAmountMoney;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", sraffNumber='" + sraffNumber + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", unit='" + unit + '\'' +
                ", month='" + month + '\'' +
                ", taxPayableThisMonth='" + taxPayableThisMonth + '\'' +
                ", payableAmount='" + payableAmount + '\'' +
                ", remarks='" + remarks + '\'' +
                ", salaryDaysInThisMonth=" + salaryDaysInThisMonth +
                ", standardOfOriginalPost='" + standardOfOriginalPost + '\'' +
                ", postSalary='" + postSalary + '\'' +
                ", fullAttendanceBonusReward='" + fullAttendanceBonusReward + '\'' +
                ", socialSecuritySubsidy='" + socialSecuritySubsidy + '\'' +
                ", theFirstAwardOf5s='" + theFirstAwardOf5s + '\'' +
                ", otherSubsidies='" + otherSubsidies + '\'' +
                ", reissueSalary='" + reissueSalary + '\'' +
                ", totalStandardSalaryItems='" + totalStandardSalaryItems + '\'' +
                ", personalLeaveDeduction='" + personalLeaveDeduction + '\'' +
                ", deductionForSickLeave='" + deductionForSickLeave + '\'' +
                ", deductionForAbsenteeism='" + deductionForAbsenteeism + '\'' +
                ", lateDeduction='" + lateDeduction + '\'' +
                ", forgetToPunchInAndDeduct='" + forgetToPunchInAndDeduct + '\'' +
                ", deductionForEarlyLeave='" + deductionForEarlyLeave + '\'' +
                ", totalAttendanceDeduction='" + totalAttendanceDeduction + '\'' +
                ", finalPenaltyIn5sEvaluation='" + finalPenaltyIn5sEvaluation + '\'' +
                ", salaryDeduction='" + salaryDeduction + '\'' +
                ", otherDeductions='" + otherDeductions + '\'' +
                ", totalDeduction='" + totalDeduction + '\'' +
                ", payPersonalSocialInsuranceOnBehalf='" + payPersonalSocialInsuranceOnBehalf + '\'' +
                ", paymentOfIndividualAccumulationFund='" + paymentOfIndividualAccumulationFund + '\'' +
                ", otherPayments='" + otherPayments + '\'' +
                ", renewalCommission='" + renewalCommission + '\'' +
                ", teamPerformance='" + teamPerformance + '\'' +
                ", teamClassElimination='" + teamClassElimination + '\'' +
                ", personalElimination='" + personalElimination + '\'' +
                ", retentionFromPreviousAgreements='" + retentionFromPreviousAgreements + '\'' +
                ", otherAwards='" + otherAwards + '\'' +
                ", commissionOfRelationSheet='" + commissionOfRelationSheet + '\'' +
                ", courseSetterDrawAPercentage='" + courseSetterDrawAPercentage + '\'' +
                ", nameRecruitDrawAPercentage='" + nameRecruitDrawAPercentage + '\'' +
                ", telephoneInterviewDrawAPercentage='" + telephoneInterviewDrawAPercentage + '\'' +
                ", reissueDrawAPercentage='" + reissueDrawAPercentage + '\'' +
                ", refundAndDeductionOfThisMonth='" + refundAndDeductionOfThisMonth + '\'' +
                ", commissionPayableThisMonth='" + commissionPayableThisMonth + '\'' +
                ", commissionActuallyPaidThisMonth='" + commissionActuallyPaidThisMonth + '\'' +
                ", partTimeSalary='" + partTimeSalary + '\'' +
                ", partTimeClassHours='" + partTimeClassHours + '\'' +
                ", fullTimeRemuneration='" + fullTimeRemuneration + '\'' +
                ", fullTimeClassHours='" + fullTimeClassHours + '\'' +
                ", remunerationOther='" + remunerationOther + '\'' +
                ", otherRemunerationAwards='" + otherRemunerationAwards + '\'' +
                ", totalRemuneration='" + totalRemuneration + '\'' +
                ", performanceCriteria='" + performanceCriteria + '\'' +
                ", payDays='" + payDays + '\'' +
                ", performanceBase='" + performanceBase + '\'' +
                ", performanceScore='" + performanceScore + '\'' +
                ", performanceRatio='" + performanceRatio + '\'' +
                ", actualAmountMoney='" + actualAmountMoney + '\'' +
                '}';
    }
}
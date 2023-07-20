package cn.qqcn.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Journal implements Serializable {
    /**
     * id
     */
    @Id
    @Column(name = "journal_id")
    private Integer journalId;

    /**
     * 日志时间
     */
    @Column(name = "journal_log_time")
    private Date journalLogTime;

    /**
     * 操作人
     */
    @Column(name = "journal_operator")
    private String journalOperator;

    /**
     * 执行结果
     */
    @Column(name = "journal_results_of_enforcement")
    private String journalResultsOfEnforcement;

    /**
     * 执行时间
     */
    @Column(name = "journal_execution_time")
    private Date journalExecutionTime;

    /**
     * 日志内容
     */
    @Column(name = "journal_log_content")
    private String journalLogContent;

    /**
     * 获取id
     *
     * @return journal_id - id
     */
    public Integer getJournalId() {
        return journalId;
    }

    /**
     * 设置id
     *
     * @param journalId id
     */
    public void setJournalId(Integer journalId) {
        this.journalId = journalId;
    }

    /**
     * 获取日志时间
     *
     * @return journal_log_time - 日志时间
     */
    public Date getJournalLogTime() {
        return journalLogTime;
    }

    /**
     * 设置日志时间
     *
     * @param journalLogTime 日志时间
     */
    public void setJournalLogTime(Date journalLogTime) {
        this.journalLogTime = journalLogTime;
    }

    /**
     * 获取操作人
     *
     * @return journal_operator - 操作人
     */
    public String getJournalOperator() {
        return journalOperator;
    }

    /**
     * 设置操作人
     *
     * @param journalOperator 操作人
     */
    public void setJournalOperator(String journalOperator) {
        this.journalOperator = journalOperator;
    }

    /**
     * 获取执行结果
     *
     * @return journal_results_of_enforcement - 执行结果
     */
    public String getJournalResultsOfEnforcement() {
        return journalResultsOfEnforcement;
    }

    /**
     * 设置执行结果
     *
     * @param journalResultsOfEnforcement 执行结果
     */
    public void setJournalResultsOfEnforcement(String journalResultsOfEnforcement) {
        this.journalResultsOfEnforcement = journalResultsOfEnforcement;
    }

    /**
     * 获取执行时间
     *
     * @return journal_execution_time - 执行时间
     */
    public Date getJournalExecutionTime() {
        return journalExecutionTime;
    }

    /**
     * 设置执行时间
     *
     * @param journalExecutionTime 执行时间
     */
    public void setJournalExecutionTime(Date journalExecutionTime) {
        this.journalExecutionTime = journalExecutionTime;
    }

    /**
     * 获取日志内容
     *
     * @return journal_log_content - 日志内容
     */
    public String getJournalLogContent() {
        return journalLogContent;
    }

    /**
     * 设置日志内容
     *
     * @param journalLogContent 日志内容
     */
    public void setJournalLogContent(String journalLogContent) {
        this.journalLogContent = journalLogContent;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "journalId=" + journalId +
                ", journalLogTime=" + journalLogTime +
                ", journalOperator='" + journalOperator + '\'' +
                ", journalResultsOfEnforcement='" + journalResultsOfEnforcement + '\'' +
                ", journalExecutionTime=" + journalExecutionTime +
                ", journalLogContent='" + journalLogContent + '\'' +
                '}';
    }
}
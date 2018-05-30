package com.portal.Entity.CoreModel;

import com.portal.Entity.HrMasters.Designation;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@Component
@Data
public class MasterPageModel {
    long id;

    private long mrfNumber;

    private long designation;

    private String billability;

    private String budgetScope;

    private String backFill;

    //private Set<String> costCode;

    //Grade Entity Code
    private long grade;

    private String skillSet;

    double expectedMinSalary;

    double expectedMaxSalary;

    private Date businessDate;        // current date

    private String justification;

    private Integer numberOfOpenings;

    //private Collection<String> businessEntityName;

    //Team Entity
    private long team;

    //always a kind of List or Collection (Type) require for @OneToMany
    //Set<JobLocation> Entity
    private long jobLocation;

    //Employment Entity
    private long employment;

    //Qualification Entity
    private long qualification;

    private String keyRequirementForPostion;

    private String detailedJobDescription;

    private double minExperience;

    private double maxExperience;

    /*@OneToOne
    private Collection<Employee> reportingManager;*/

    private long reportingManager;

    private String assetsRequired;

    //buddy name basically required
    //ReferalBuddy Entity
    private String referalBuddyName;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMrfNumber() {
        return mrfNumber;
    }

    public void setMrfNumber(long mrfNumber) {
        this.mrfNumber = mrfNumber;
    }

    public long getDesignation() {
        return designation;
    }

    public void setDesignation(long designation) {
        this.designation = designation;
    }

    public String getBillability() {
        return billability;
    }

    public void setBillability(String billability) {
        this.billability = billability;
    }

    public String getBudgetScope() {
        return budgetScope;
    }

    public void setBudgetScope(String budgetScope) {
        this.budgetScope = budgetScope;
    }

    public String getBackFill() {
        return backFill;
    }

    public void setBackFill(String backFill) {
        this.backFill = backFill;
    }

    public long getGrade() {
        return grade;
    }

    public void setGrade(long grade) {
        this.grade = grade;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public double getExpectedMinSalary() {
        return expectedMinSalary;
    }

    public void setExpectedMinSalary(double expectedMinSalary) {
        this.expectedMinSalary = expectedMinSalary;
    }

    public double getExpectedMaxSalary() {
        return expectedMaxSalary;
    }

    public void setExpectedMaxSalary(double expectedMaxSalary) {
        this.expectedMaxSalary = expectedMaxSalary;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    public Integer getNumberOfOpenings() {
        return numberOfOpenings;
    }

    public void setNumberOfOpenings(Integer numberOfOpenings) {
        this.numberOfOpenings = numberOfOpenings;
    }

    public long getTeam() {
        return team;
    }

    public void setTeam(long team) {
        this.team = team;
    }

    public long getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(long jobLocation) {
        this.jobLocation = jobLocation;
    }

    public long getEmployment() {
        return employment;
    }

    public void setEmployment(long employment) {
        this.employment = employment;
    }

    public long getQualification() {
        return qualification;
    }

    public void setQualification(long qualification) {
        this.qualification = qualification;
    }

    public String getKeyRequirementForPostion() {
        return keyRequirementForPostion;
    }

    public void setKeyRequirementForPostion(String keyRequirementForPostion) {
        this.keyRequirementForPostion = keyRequirementForPostion;
    }

    public String getDetailedJobDescription() {
        return detailedJobDescription;
    }

    public void setDetailedJobDescription(String detailedJobDescription) {
        this.detailedJobDescription = detailedJobDescription;
    }

    public double getMinExperience() {
        return minExperience;
    }

    public void setMinExperience(double minExperience) {
        this.minExperience = minExperience;
    }

    public double getMaxExperience() {
        return maxExperience;
    }

    public void setMaxExperience(double maxExperience) {
        this.maxExperience = maxExperience;
    }

    public long getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(long reportingManager) {
        this.reportingManager = reportingManager;
    }

    public String getAssetsRequired() {
        return assetsRequired;
    }

    public void setAssetsRequired(String assetsRequired) {
        this.assetsRequired = assetsRequired;
    }

    public String getReferalBuddyName() {
        return referalBuddyName;
    }

    public void setReferalBuddyName(String referalBuddyName) {
        this.referalBuddyName = referalBuddyName;
    }
}
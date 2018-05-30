package com.portal.Entity.Core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.portal.Entity.CoreModel.MasterPageModel;
import com.portal.Entity.HrMasters.Designation;
import com.portal.Entity.HrMasters.Employment;
import com.portal.Entity.HrMasters.Grade;
import com.portal.Entity.HrMasters.Qualification;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 21/5/2018
 */
@Entity
@Data
@Getter @Setter
public class MasterPage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(unique = true) @JsonIgnore
    private long mrfNumber;

    public MasterPage(MasterPageModel masterPageModel){
        this.billability=masterPageModel.getBillability();
        this.budgetScope=masterPageModel.getBudgetScope();
        this.backFill=masterPageModel.getBackFill();
        this.skillSet=masterPageModel.getSkillSet();
        this.skillSet=masterPageModel.getSkillSet();
        this.expectedMaxSalary=masterPageModel.getExpectedMaxSalary();
        this.expectedMinSalary=masterPageModel.getExpectedMinSalary();
        this.businessDate=masterPageModel.getBusinessDate();
        this.justification=masterPageModel.getJustification();
        this.numberOfOpenings=masterPageModel.getNumberOfOpenings();
        this.keyRequirementForPostion=masterPageModel.getKeyRequirementForPostion();
        this.detailedJobDescription=masterPageModel.getDetailedJobDescription();
        this.minExperience=masterPageModel.getMinExperience();
        this.maxExperience=masterPageModel.getMaxExperience();
        this.assetsRequired=masterPageModel.getAssetsRequired();
        this.referalBuddyName=masterPageModel.getReferalBuddyName();
    }


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="designation_id")
    private Designation designation;

    private String billability;

    private String budgetScope;

    private String backFill;

    //private Set<String> costCode;

    @ManyToOne
    @JoinColumn(name="grade_id")
    private Grade grade;

    private String skillSet;

    double expectedMinSalary;

    double expectedMaxSalary;

    private Date businessDate;        // current date

    private String justification;

    private Integer numberOfOpenings;

    //private Collection<String> businessEntityName;

    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;

    //always a kind of List or Collection (Type) require for @OneToMany
    @ManyToOne
    @JoinColumn(name="jobLocation_id")
    private JobLocation jobLocation;

    @ManyToOne
    @JoinColumn(name="employement_id")
    private Employment employment;

    @ManyToOne
    @JoinColumn(name="qualification_id")
    private Qualification qualification;

    private String keyRequirementForPostion;

    private String detailedJobDescription;

    private double minExperience;

    private double maxExperience;

    @OneToOne
    @JoinColumn(name="reportingManager_id")
    private Employee reportingManager;

    private String assetsRequired;


    /*//buddy name basically required
    private ReferalBuddy referalBuddy;*/

    private String referalBuddyName;

    //default ctor
    public MasterPage() {
    }

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

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setJobLocation(JobLocation jobLocation) {
        this.jobLocation = jobLocation;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
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

    public JobLocation getJobLocation() {
        return jobLocation;
    }

    public Employee getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(Employee reportingManager) {
        this.reportingManager = reportingManager;
    }
}

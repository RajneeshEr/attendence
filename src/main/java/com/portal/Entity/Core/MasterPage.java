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
        this.qualification=masterPageModel.getQualification();
        this.currency=masterPageModel.getCurrency();
        this.currencyType=masterPageModel.getCurrencyType();
        this.budgetedSalaryMin=masterPageModel.getBudgetedSalaryMin();
        this.budgetedSalaryMax=masterPageModel.getBudgetedSalaryMax();
        this.projectDuration=masterPageModel.getProjectDuration();
        this.billability=masterPageModel.getBillability();
        this.budgetScope=masterPageModel.getBudgetScope();
        this.newReplace=masterPageModel.getNewReplace();
        this.travelReady=masterPageModel.getTravelReady();
        this.passportReq=masterPageModel.getPassportReq();
        this.numberOfOpenings=masterPageModel.getNumberOfOpenings();
        this.nopJustification=masterPageModel.getNopJustification();
        this.assetReq=masterPageModel.getAssetReq();
        this.assetReqJustification=masterPageModel.getAssetReqJustification();
        this.bdDate=masterPageModel.getBdDate();
        this.bdDateJustification=masterPageModel.getBdDateJustification();
        this.majorSkills=masterPageModel.getMajorSkills();
        this.minorSkills=masterPageModel.getMinorSkills();
        this.jDesc=masterPageModel.getjDesc();
        this.explvlMin=masterPageModel.getExplvlMin();
        this.explvlMax=masterPageModel.getExplvlMax();
        this.accessRequired=masterPageModel.getAccessRequired();
        this.hiringManager=masterPageModel.getHiringManager();
        this.buddyName=masterPageModel.getBuddyName();
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="designation_id")
    private Designation designation;

    //private Set<String> costCode;

    //private Collection<String> businessUnit;

    @ManyToOne
    @JoinColumn(name="employement_id")
    private Employment employment;

    private String qualification;

    @ManyToOne
    @JoinColumn(name="team_id")
    private Team project;

    private String currency;

    private String currencyType;

    double budgetedSalaryMin;

    double budgetedSalaryMax;

    double projectDuration;

    private String billability;

    private String budgetScope;

    private String newReplace;   //new or replacement

    private String travelReady;

    private String passportReq;

    private Integer numberOfOpenings;

    private String nopJustification;   // number of opening justification

    private String assetReq;

    private String assetReqJustification;

    private Date bdDate;

    private String bdDateJustification;    // business date delivery justification

    private String majorSkills;

    private String minorSkills;

    private String jDesc;

    private String explvlMin; //experience level min

    private String explvlMax; // experience level max

    private String accessRequired;

    private String hiringManager;

    private String buddyName;

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

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Team getProject() {
        return project;
    }

    public void setProject(Team project) {
        this.project = project;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public double getBudgetedSalaryMin() {
        return budgetedSalaryMin;
    }

    public void setBudgetedSalaryMin(double budgetedSalaryMin) {
        this.budgetedSalaryMin = budgetedSalaryMin;
    }

    public double getBudgetedSalaryMax() {
        return budgetedSalaryMax;
    }

    public void setBudgetedSalaryMax(double budgetedSalaryMax) {
        this.budgetedSalaryMax = budgetedSalaryMax;
    }

    public double getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(double projectDuration) {
        this.projectDuration = projectDuration;
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

    public String getNewReplace() {
        return newReplace;
    }

    public void setNewReplace(String newReplace) {
        this.newReplace = newReplace;
    }

    public String getTravelReady() {
        return travelReady;
    }

    public void setTravelReady(String travelReady) {
        this.travelReady = travelReady;
    }

    public String getPassportReq() {
        return passportReq;
    }

    public void setPassportReq(String passportReq) {
        this.passportReq = passportReq;
    }

    public Integer getNumberOfOpenings() {
        return numberOfOpenings;
    }

    public void setNumberOfOpenings(Integer numberOfOpenings) {
        this.numberOfOpenings = numberOfOpenings;
    }

    public String getNopJustification() {
        return nopJustification;
    }

    public void setNopJustification(String nopJustification) {
        this.nopJustification = nopJustification;
    }

    public String getAssetReq() {
        return assetReq;
    }

    public void setAssetReq(String assetReq) {
        this.assetReq = assetReq;
    }

    public String getAssetReqJustification() {
        return assetReqJustification;
    }

    public void setAssetReqJustification(String assetReqJustification) {
        this.assetReqJustification = assetReqJustification;
    }

    public Date getBdDate() {
        return bdDate;
    }

    public void setBdDate(Date bdDate) {
        this.bdDate = bdDate;
    }

    public String getBdDateJustification() {
        return bdDateJustification;
    }

    public void setBdDateJustification(String bdDateJustification) {
        this.bdDateJustification = bdDateJustification;
    }

    public String getMajorSkills() {
        return majorSkills;
    }

    public void setMajorSkills(String majorSkills) {
        this.majorSkills = majorSkills;
    }

    public String getMinorSkills() {
        return minorSkills;
    }

    public void setMinorSkills(String minorSkills) {
        this.minorSkills = minorSkills;
    }

    public String getjDesc() {
        return jDesc;
    }

    public void setjDesc(String jDesc) {
        this.jDesc = jDesc;
    }

    public String getExplvlMin() {
        return explvlMin;
    }

    public void setExplvlMin(String explvlMin) {
        this.explvlMin = explvlMin;
    }

    public String getExplvlMax() {
        return explvlMax;
    }

    public void setExplvlMax(String explvlMax) {
        this.explvlMax = explvlMax;
    }

    public String getAccessRequired() {
        return accessRequired;
    }

    public void setAccessRequired(String accessRequired) {
        this.accessRequired = accessRequired;
    }

    public String getHiringManager() {
        return hiringManager;
    }

    public void setHiringManager(String hiringManager) {
        this.hiringManager = hiringManager;
    }

    public String getBuddyName() {
        return buddyName;
    }

    public void setBuddyName(String buddyName) {
        this.buddyName = buddyName;
    }
}

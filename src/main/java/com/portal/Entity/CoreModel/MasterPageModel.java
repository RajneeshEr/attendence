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

    private String designation;

    private String billability;

    private String budgetScope;

    private String backFill;

    //private Set<String> costCode;

    //Grade Entity Code
    private String grade;

    private String skillSet;

    double expectedMinSalary;

    double expectedMaxSalary;

    private Date businessDate;        // current date

    private String justification;

    private Integer numberOfOpenings;

    //private Collection<String> businessEntityName;

    //Team Entity
    private String team;

    //always a kind of List or Collection (Type) require for @OneToMany
    //Set<JobLocation> Entity
    private String jobLocation;

    //Employment Entity
    private String employment;

    //Qualification Entity
    private String qualification;

    private String keyRequirementForPostion;

    private String detailedJobDescription;

    private double minExperience;

    private double maxExperience;

    /*@OneToOne
    private Collection<Employee> reportingManager;*/

    private String reportingManager;

    private String assetsRequired;

    //buddy name basically required
    //ReferalBuddy Entity
    private String referalBuddyName;

    public MasterPageModel() {
    }
}
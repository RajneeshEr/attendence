package com.portal.Entity.Core;

import com.portal.Entity.HrMasters.Designation;
import com.portal.Entity.HrMasters.Employment;
import com.portal.Entity.HrMasters.Grade;
import com.portal.Entity.HrMasters.Qualification;
import lombok.Getter;
import lombok.Setter;

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
@Getter
@Setter
public class MasterPage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(unique = true)
    private long mrfNumber;

    @ManyToOne
    private Designation designation;

    private String billability;

    private String budgetScope;

    private String backFill;

    //private Set<String> costCode;

    @ManyToOne
    private Grade grade;

    private String skillSet;

    double expectedMinSalary;

    double expectedMaxSalary;

    private Date businessDate;        // current date

    private String justification;

    private Integer numberOfOpenings;

    //private Collection<String> businessEntityName;

    @ManyToOne
    private Team team;

    //always a kind of List or Collection (Type) require for @OneToMany
    @OneToMany(mappedBy = "masterPage",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<JobLocation> jobLocation;

    @ManyToOne
    private Employment employment;

    @ManyToOne
    private Qualification qualification;

    private String keyRequirementForPostion;

    private String detailedJobDescription;

    private double minExperience;

    private double maxExperience;

    /*@OneToOne
    private Collection<Employee> reportingManager;*/

    private String assetsRequired;

    //buddy name basically required
    private ReferalBuddy referalBuddy;

    public MasterPage() {

    }

}

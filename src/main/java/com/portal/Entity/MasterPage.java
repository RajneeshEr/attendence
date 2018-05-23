package com.portal.Entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

/**
 * @author rajneesh yadav
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
    @ManyToOne
    private Employment employment;
    @ManyToOne
    private Grade grade;

    //always a kind of List or Collection (Type) require for @OneToMany
    @OneToMany(mappedBy = "masterPage",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<JobLocation> jobLocation;

    @ManyToOne
    private Team team;

    private double salaryBracket;
    private Date businessDate;        // current date
    private Integer openings;
    private String qualification;
    private String specificationForPostion;
    private String jobDescription;
    private double experience;

    private String buddyName;
    private String buddyEmail;

    public MasterPage() {
    }

}

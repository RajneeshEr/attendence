package com.portal.Entity.Core;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 21/5/2018
 */
@Entity
@Data
public class Project implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String name;
    private String code;

    @ManyToOne
    private BusinessUnit businessUnit;

   /* @OneToMany(mappedBy = "project",fetch = FetchType.LAZY)
    private Set<Location> location;*/

    public Project() {
    }

}
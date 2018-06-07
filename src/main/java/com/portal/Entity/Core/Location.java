package com.portal.Entity.Core;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
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
public class Location implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String code;
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Project project;

    @OneToMany(mappedBy = "location",fetch = FetchType.EAGER)
    private Set<City> cities;

    /*@OneToMany
    private Set<MasterPage> masterPage;
*/
    public Location() {
    }

}
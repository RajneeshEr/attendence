package com.portal.Entity.Core;

import java.io.Serializable;
import lombok.Data;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@Entity
@Data
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String code;
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Location  location;

   /* @OneToOne
    private CostCenter costCenter;*/

    public City() {
    }

}
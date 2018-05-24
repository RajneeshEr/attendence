package com.portal.Entity.HrMasterSetUp;


import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 21/5/2018
 */
@Entity
@Getter
@Setter
public class Grade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(unique = true)
    private String code;
    @Column(unique = true)
    private String name;

    public Grade() {
    }

}
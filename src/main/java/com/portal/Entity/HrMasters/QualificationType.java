package com.portal.Entity.HrMasters;

import lombok.Data;
import java.io.Serializable;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@Entity
@Data
public class QualificationType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;


    @Column(unique = true)
    private String code;
    private String name;

    public QualificationType() {
    }

}
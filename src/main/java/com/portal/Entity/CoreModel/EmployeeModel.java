package com.portal.Entity.CoreModel;

import com.portal.Entity.HrMasters.*;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@Component
@Data
public class EmployeeModel {

    long id;
    private String role;
    private String code;
    private String firstName;
    private String lastName;
    private String email;
    private String sex;
    private String mobileNumber;
    private String passportNumber;


    private Department department;

    private Designation designation;

    private StaffType staffType;

    private Qualification qualification;

    private Employment employment;

}

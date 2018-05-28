package com.portal.Service;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Employee;
import com.portal.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Component
public class EmployeeService implements CommonConstant {

    @Autowired
    private EmployeeRepository employeeRepository;

    //this method will work for save or update object
    public Employee save(Employee object){
        try {
            return employeeRepository.save(object);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean findByIdGiven(long id){
        try {
            return employeeRepository.existsById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Employee findById(long id){
         try {
             return employeeRepository.findById(id);
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
    }

    public String delete(Employee object){
        try {
            employeeRepository.delete(object);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }

}

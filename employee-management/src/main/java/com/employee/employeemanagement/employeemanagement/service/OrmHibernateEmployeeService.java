package com.employee.employeemanagement.employeemanagement.service;

import com.employee.employeemanagement.employeemanagement.entities.OrmHibernateEmployee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrmHibernateEmployeeService {
    public OrmHibernateEmployee addEmployee(OrmHibernateEmployee employee);

    public List<OrmHibernateEmployee> getAllEmployee();

    public OrmHibernateEmployee findById(long id);
}

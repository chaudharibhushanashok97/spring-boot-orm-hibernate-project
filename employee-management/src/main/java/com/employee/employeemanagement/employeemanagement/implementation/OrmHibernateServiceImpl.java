package com.employee.employeemanagement.employeemanagement.implementation;

import com.employee.employeemanagement.employeemanagement.dao.OrmHibernateEmployeeRepository;
import com.employee.employeemanagement.employeemanagement.entities.OrmHibernateEmployee;
import com.employee.employeemanagement.employeemanagement.service.OrmHibernateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrmHibernateServiceImpl implements OrmHibernateEmployeeService {

    @Autowired
    OrmHibernateEmployeeRepository repository;

    @Transactional
    @Override
    public OrmHibernateEmployee addEmployee(OrmHibernateEmployee employee) {
        return repository.addEmployee(employee);
    }

    @Transactional
    @Override
    public List<OrmHibernateEmployee> getAllEmployee() {
        return repository.getAllEmployee();
    }

    @Transactional
    @Override
    public OrmHibernateEmployee findById(long id) {
        return repository.findById(id);
    }
}

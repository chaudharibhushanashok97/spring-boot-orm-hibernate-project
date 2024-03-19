package com.employee.employeemanagement.employeemanagement.controller;

import com.employee.employeemanagement.employeemanagement.entities.OrmHibernateEmployee;
import com.employee.employeemanagement.employeemanagement.service.OrmHibernateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orm/hibernate")
public class OrmHibernateController {

    @Autowired
    OrmHibernateEmployeeService ormHibernateEmployeeService;

    @PostMapping("/add/employee")
    public ResponseEntity<?> addEmployee(@RequestBody OrmHibernateEmployee employee){
        return new ResponseEntity<OrmHibernateEmployee>(ormHibernateEmployeeService.addEmployee(employee), HttpStatus.OK);
    }

    @GetMapping("/all/employee")
    public ResponseEntity<?> getAllEmployee(){
        return new ResponseEntity<>(ormHibernateEmployeeService.getAllEmployee(), HttpStatus.OK);
    }

    @GetMapping("/get/employee")
    public ResponseEntity<?> getEmployee(@RequestParam Long id){
        return new ResponseEntity<OrmHibernateEmployee>(ormHibernateEmployeeService.findById(id), HttpStatus.OK);
    }
}

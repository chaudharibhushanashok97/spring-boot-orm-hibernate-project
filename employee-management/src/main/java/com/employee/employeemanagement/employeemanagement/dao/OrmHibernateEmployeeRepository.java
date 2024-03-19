package com.employee.employeemanagement.employeemanagement.dao;

import com.employee.employeemanagement.employeemanagement.entities.OrmHibernateEmployee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class OrmHibernateEmployeeRepository {

    @Autowired
    EntityManager entityManager;

//    @Transactional
    public OrmHibernateEmployee addEmployee(OrmHibernateEmployee employee){
        entityManager.persist(employee);
        return employee;
    }

    public List<OrmHibernateEmployee> getAllEmployee() {
//        TypedQuery<OrmHibernateEmployee> query = entityManager.createQuery("select e from OrmHibernateEmployee e join fetch e.ormHibernateDepartment", OrmHibernateEmployee.class);

        TypedQuery<OrmHibernateEmployee> query = entityManager.createQuery("select e from OrmHibernateEmployee e", OrmHibernateEmployee.class);
        return query.getResultList();
    }

    public OrmHibernateEmployee findById(long id) {
        return entityManager.find(OrmHibernateEmployee.class,id);
    }


}

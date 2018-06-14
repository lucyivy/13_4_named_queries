package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Facade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Company> processCompanySearch(final String companyPartName) {
        try {
            LOGGER.info("Searching companies complete");
            return companyDao.retrieveCompanyByNamePart(companyPartName);

        } catch (Exception e) {
            LOGGER.error("Error" + e.getMessage());
            return new ArrayList<>();
        }
    }

    public List<Employee> processEmployeeSearch(final String employeePartName) {
        try {
            LOGGER.info("Searching employees complete");
            return employeeDao.retrieveEmployeeByNamePart(employeePartName);

        } catch (Exception e) {
            LOGGER.error("Error" + e.getMessage());
            return new ArrayList<>();
        }
    }
}

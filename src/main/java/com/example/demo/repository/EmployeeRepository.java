package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;



@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {

	

	}

package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public Page<Employee> findAll(Pageable pageable) {
		return employeeRepository.findAll(pageable);
	}

	public List<Employee> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy) {
		 Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

	        Page<Employee> pagedResult = employeeRepository.findAll(paging);

	        if(pagedResult.hasContent()) {
	            return pagedResult.getContent();
	        } else {
	            return new ArrayList<Employee>();
	        }
	}

	public Iterable<Employee> sortEmployees(String field) {
		
       return employeeRepository.findAll(Sort.by(field));
		//return employeeRepository.findAll(Sort.by(Direction.DESC, field));
	}

	public Page<Employee> pagingEmployees(int page,int pageSize) {
		Pageable paging = PageRequest.of(page, pageSize);
		 return employeeRepository.findAll(paging);
		}
	
	public Page<Employee> pagingAndSortingEmployees(int offset,int pageSize,String field) {
		Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
			return employeeRepository.findAll(paging);
		}


}

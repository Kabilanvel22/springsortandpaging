package com.example.demo.controller;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
	

	@RestController
	public class EmployeeController {

		@Autowired
		EmployeeService employeeService;
		
		//sorting
		//http://localhost:9080/sortEmployees/name
		@GetMapping("/sortEmployees/{field}")
		public Iterable<Employee> employeesSort(@PathVariable ("field") String field) {
			return employeeService.sortEmployees(field);

		}

		//paging
		@GetMapping(value = "/pagingEmployees/{pageNo}/{pageSize}")
		public Page<Employee> employeesPaging(@PathVariable ("pageNo") int pageno,@PathVariable ("pageSize") int pageSize) {
			return employeeService.pagingEmployees(pageno, pageSize);

		}
		
		//paging and sorting
	//http://localhost:9080/pagingSortingEmployees/0/4/name
		@GetMapping(value = "/pagingSortingEmployees/{pageNo}/{pageSize}/{field}")
		public Page<Employee> employeesPagingAndSorting(@PathVariable ("pageNo") int pageno,@PathVariable ("pageSize") int pageSize,@PathVariable ("field")String field) {
			return employeeService.pagingAndSortingEmployees(pageno, pageSize,field);

		}
		
		}


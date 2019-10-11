package com.ustglobal.usttyspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.usttyspringboot.dto.Employee;
import com.ustglobal.usttyspringboot.dto.EmployeeResponse;
import com.ustglobal.usttyspringboot.service.EmployeeService;

@RestController // controller+response body
@RequestMapping("/employee") // it will give path
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true") // allow
// credentials:-it
// used to send
// cookies backend
// to frontend

//allowHeaders:- it is used in postman
public class EmployeeController {
	@Autowired
	@Qualifier("jpa")
	private EmployeeService service;

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE) // produces:-it will give output as a json
	// value
	public EmployeeResponse getEmployee(@RequestParam("id") int id) {

		Employee employee = service.getEmployee(id);
		EmployeeResponse response = new EmployeeResponse();
		if (employee == null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("no data found");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");
			response.setEmployees(Arrays.asList(employee));
		}
		return response;
	}

	@GetMapping(path = "/get-all-name", produces = MediaType.APPLICATION_JSON_VALUE) // produces:-it will give output as
	// a json
	// value
	public EmployeeResponse getAllEmployee(@RequestParam("name") String name) {

		EmployeeResponse response = new EmployeeResponse();
		List<Employee> employees = service.getEmployeesByName(name);

		if (employees == null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("no data found");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");
			response.setEmployees(employees);
		}
		return response;
	}

	@GetMapping(path = "get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee() {
		List<Employee> employees = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		if (employees == null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("no data found");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");
			response.setEmployees(employees);
		}
		return response;
	}

	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody Employee employee) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.addEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("no data found");
		}
		return response;
	}

	@PutMapping(path = "/modify", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody Employee employee) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.modifyEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("no data found");
		}
		return response;
	}

	@DeleteMapping(path = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse removeEmployee(@PathVariable("id") int id) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.removeEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("no data found");
		}
		return response;
	}

	@GetMapping("/exce")
	public String throwException() throws Exception {
		throw new Exception();
	}

}

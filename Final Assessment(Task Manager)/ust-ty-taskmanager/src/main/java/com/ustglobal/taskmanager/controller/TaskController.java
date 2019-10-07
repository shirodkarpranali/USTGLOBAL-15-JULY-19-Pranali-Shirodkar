package com.ustglobal.taskmanager.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.taskmanager.dto.Task;
import com.ustglobal.taskmanager.dto.TaskResponse;
import com.ustglobal.taskmanager.service.TaskService;


@RestController // controller+response body
@RequestMapping("/task") // it will give path
@CrossOrigin(origins = "*")

public class TaskController {
	@Autowired
	@Qualifier("jpa")
	private TaskService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class,editor);
	}
	

	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse addTask(@RequestBody Task task) {
		TaskResponse response = new TaskResponse();
		if (service.addTask(task)) {
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

	@GetMapping(path = "get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse getAllEmployee() {
		List<Task> task = service.getAllTaskList();
		TaskResponse response = new TaskResponse();
		if (task == null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("no data found");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");
			response.setTaskList(task);
		}
		return response;
	}

	@DeleteMapping(path = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse removeTask(@PathVariable("id") int taskId) {
		TaskResponse response = new TaskResponse();
		if (service.removeTask(taskId)) {
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
	public TaskResponse modifyEmployee(@RequestBody Task task) {
		TaskResponse response = new TaskResponse();
		if (service.modifyTask(task)) {
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

}

package com.ustglobal.taskmanager.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.taskmanager.dto.Task;
import com.ustglobal.taskmanager.repository.TaskRepository;

@Service("jpa")
public class TaskServiceJpaImpl implements TaskService {

	@Autowired
	private TaskRepository repository;

	@Override
	public boolean addTask(Task task) {
		Date date = new Date();
		task.setStartDate(date);
		repository.save(task);
		return true;
	}

	@Override
	public boolean removeTask(int taskId) {
		repository.deleteById(taskId);
		return true;
	}

	@Override
	public boolean modifyTask(Task task) {
		Date endDate=new Date();
		repository.update(endDate, task.getTaskId());
		return true;
	}

	@Override
	public List<Task> getAllTaskList() {

		return repository.findAll();
	}

}

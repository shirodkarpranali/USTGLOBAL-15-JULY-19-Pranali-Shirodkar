package com.ustglobal.taskmanager.service;

import java.util.List;

import com.ustglobal.taskmanager.dto.Task;

public interface TaskService {
	
	public boolean addTask(Task task);
	public boolean removeTask(int taskId);
	public boolean modifyTask(Task task);
	public List<Task> getAllTaskList();

}

package day12.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import day06.practice.Task;
import day11.practice.DAOException;
import day12.practice.TaskDAO;

public  class TestCreateTasks {
	@Test
	 void TestCreateTask() throws DAOException{
		Task newTask = new Task();
		newTask.setId(123456);
		newTask.setTaskName("Task 12345");
		newTask.setStatus("Pending");
		assertTrue(TaskDAO.createTask(newTask));
	}
}

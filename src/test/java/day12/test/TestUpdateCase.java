package day12.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import day06.practice.Task;
import day11.practice.DAOException;
import day12.practice.TaskDAO;

public  class TestUpdateCase {
	@Test
	 void TestUpdatetTask() throws DAOException{
		Task newTask = new Task();
		newTask.setId(123456);
		newTask.setTaskName("Task 123456");
		newTask.setStatus("completed");
		assertTrue(TaskDAO.updateTask(newTask));
	}
}

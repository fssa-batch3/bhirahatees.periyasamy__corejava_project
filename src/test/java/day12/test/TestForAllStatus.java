package day12.test;

import java.util.List;

import day06.practice.Task;
import day11.practice.DAOException;
import day12.practice.TaskDAO;

public class TestForAllStatus {
	public static void main(String[] args) {
		Task newTask = new Task();
		newTask.setId(12345);
		newTask.setTaskName("Task 12345");
		newTask.setStatus("Pending");
		
		try {
			List<Task> taskList = TaskDAO.getAllTasks();
			for (Task task : taskList) {
				System.out.println(
						"Id :" + task.getId() + " TaskName : " + task.getTaskName() + " Status : " + task.getStatus());
			}
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

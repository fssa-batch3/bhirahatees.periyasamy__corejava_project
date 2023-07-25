package day12.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import day06.practice.Task;
import day11.practice.*;
import day11.solved.ConnectionUtil;

public class TaskDAO {

	public static boolean createTask(Task task) throws DAOException {
		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement stmt = connection
						.prepareStatement("INSERT INTO task (taskId, name, status) VALUES (?, ?, ?)")) {	// This is the try-with-resources

			// Hint: Set the values for the PreparedStatement using task properties
             stmt.setInt(1,task.getId());
             stmt.setString(2, task.getTaskName());
             stmt.setString(3, task.getStatus());
			// Hint: Execute the update statement
             int row = stmt.executeUpdate();
             System.out.print(true);
		} catch (SQLException e) {
			throw new DAOException("Error in createTask method", e);
		}
		return true;
	}

	public static boolean updateTask(Task task) throws DAOException {
		try (Connection connection = ConnectionUtil.getConnection();
			// Hint: Add the SQL update statement here
				) {
             String query = "UPDATE task SET name=?,status=? Where taskId =?";  
			// Hint: Set the values for the PreparedStatement using task properties
             PreparedStatement pst = connection.prepareStatement(query);
             pst.setString(1, task.getTaskName());
             pst.setString(2, task.getStatus());
             pst.setInt(3, task.getId());
             
             int row = pst.executeUpdate();
             System.out.print("Rows Updated " + row);
			// Hint: Execute the update statement
		} catch (SQLException e) {
			throw new DAOException("Error in updateTask method", e);
		}
		return true;
	}

	public static boolean deleteTask(int taskId) throws DAOException {
		try (Connection connection = ConnectionUtil.getConnection();
				// Hint: Add the SQL update statement here
					) {
	             String query = "DELETE FROM task WHERE taskId=?";  
				// Hint: Set the values for the PreparedStatement using task properties
	             PreparedStatement pst = connection.prepareStatement(query);
	             pst.setInt(1,taskId);
	             
	             int row = pst.executeUpdate();
	             System.out.print("Rows Deleted " + row);
				// Hint: Execute the update statement
			} catch (SQLException e) {
				throw new DAOException("Error in updateTask method", e);
			}
			return true;
	}

	public static List<Task> getAllTasks() throws DAOException {
		List<Task> tasks = new ArrayList<>();

		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement stmt = connection.prepareStatement("SELECT taskId, name, status FROM task");
				ResultSet rs = stmt.executeQuery()) {

			  while(rs.next()) {
				  Task task = new Task();
				  task.setId(rs.getInt("taskId"));
				  task.setTaskName(rs.getString("name"));
				  task.setStatus(rs.getString("status"));
				  tasks.add(task);
			  }

		} catch (SQLException e) {
			throw new DAOException("Error in getAllTasks method", e);
		}

		return tasks;
	}
	public static void main(String[] args) {
		Task newTask = new Task();
		newTask.setId(1235);
		newTask.setTaskName("Task 12345");
		newTask.setStatus("Pending");
		
	
		
		try {
			List<Task> taskList = TaskDAO.getAllTasks();
			for(Task task : taskList) {
				System.out.println("Id :" + task.getId() + " TaskName : " + task.getTaskName() + " Status : " + task.getStatus());
			}
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
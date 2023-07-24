package day11.practice;

import day11.solved.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Task {
	private int id;
	private String name;
	private String status;
	public Task(int id , String name , String status) {
		this.id = id;
		this.name = name;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getStatus() {
		return status;
	}

}

public class TASKDao {
	public static void addTasks(Task task) throws SQLException {
	    // Write code here to get connection
	    Connection connection = ConnectionUtil.getConnection();
	    Statement stmt = connection.createStatement();
	    
	    // Create insert statement
	    String query = "INSERT INTO task (taskId, name, status) VALUES ('" + task.getId() + "', '" + task.getName() + "', '" + task.getStatus() + "')";

	    // Execute insert statement
	    int rows = stmt.executeUpdate(query);
	    System.out.println("No of rows inserted: " + rows);
	    
	    // Close connection
	    ConnectionUtil.close(connection, stmt, null);
	}
}

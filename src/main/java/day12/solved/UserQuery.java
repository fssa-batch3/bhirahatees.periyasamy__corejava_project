/**
 * 
 */
package day12.solved;

import day11.solved.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class UserQuery {

	public static void main(String[] args) throws Exception {

		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection);

		Statement stmt = connection.createStatement();

//        // Step 03: Execute Insert Query
		String query = "INSERT INTO task (taskId,name,status) VALUES (\"4\",\"Task 4\", \"Completed\")";
		int rows = stmt.executeUpdate(query);
		System.out.println("No of rows inserted :" + rows);

		// Step 04: Execute SELECT Query
		final String selectQuery = "SELECT taskId,name,status FROM task WHERE status = \"Pending\"";

		// Step 05: Get the resultset
		ResultSet rs = stmt.executeQuery(selectQuery);
//		System.out.println(rs.toString());
		// Step 06: Iterate the result
		while (rs.next()) {
			int userId = rs.getInt("taskId");
			String userName = rs.getString("name");
			String status = rs.getString("status");

			System.out.println("TaskId:" + userId + ", TaskName:" + userName + ", Status :" + status);
		}

		// Step 07: close the connection resources
		rs.close();
		stmt.close();
		connection.close();

	}

}
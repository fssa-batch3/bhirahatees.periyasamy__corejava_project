package day12.solved;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import day11.solved.*;


public class TaskStatusUpdate  {
		 
	    public static void UpdateQuery(int id , String status) throws SQLException {
	 
	        Connection connection = ConnectionUtil.getConnection();

	        String query = "UPDATE task SET status=? WHERE taskId=?;";
	 
	        PreparedStatement pst = connection.prepareStatement(query);
	        pst.setString(1, status);
	        pst.setInt(2, id);
	       
	 
	        int rows = pst.executeUpdate();
	        System.out.println("No of rows updated " + rows);
	      
	    }
	 
	 
	
}
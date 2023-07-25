package day12.solved;

import java.sql.*;
import day11.solved.*;
public class UserQueryPrepStmt {
public static int addingTasks(int id , String name , String status) throws SQLException{
	Connection connection = ConnectionUtil.getConnection();
	String query ="INSERT INTO task (taskId, name,  status) VALUES ( ?, ?, ? );";
	PreparedStatement pst = connection.prepareStatement(query);
	pst.setString(1,""+ id);
	pst.setString(2, name);
	pst.setString(3, status);
	System.out.println(pst.toString());
	int rows2 = pst.executeUpdate();
//	System.out.println("No of rows inserted :" + rows2 );
	pst.close();
	return rows2;
}
}

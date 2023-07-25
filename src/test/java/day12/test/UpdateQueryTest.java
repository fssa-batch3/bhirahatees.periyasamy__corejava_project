package day12.test;



import java.sql.SQLException;



import  day12.solved.TaskStatusUpdate;

public class UpdateQueryTest {
	   public static void main(String[] args){
		   	 try {
				TaskStatusUpdate.UpdateQuery(123, "Completed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    }
}

package day12.test;


import day12.solved.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class UserQuerypreStaTest {

  public static void main(String[] args) {
	  int[] tasks = {521,123,452};
	  String[][] taskname = {{"Task 521" , "pending"},{"Task 123" , "Pending"},{"Task 452" , "Completed"}};
	  for(int i =0; i < tasks.length;i++) {
		  try {
		   UserQueryPrepStmt.addingTasks(tasks[i], taskname[i][0], taskname[i][1]);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	  }

  }
}

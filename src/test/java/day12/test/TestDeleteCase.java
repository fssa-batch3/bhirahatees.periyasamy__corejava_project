package day12.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import day06.practice.Task;
import day11.practice.DAOException;
import day12.practice.TaskDAO;

public  class TestDeleteCase {
	@Test
	 void TestDeletetTask() throws DAOException{
		assertTrue(TaskDAO.deleteTask(123456));
	}
}

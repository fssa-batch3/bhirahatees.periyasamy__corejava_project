package day11.test;

import day11.practice.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

class TestTaskDAO {
    @Test
    void testCreateTask() {
        TaskDAO taskDAO = new TaskDAO();
        Task task = new Task(7,"Sample Task 3","Pending");

        assertThrows(SQLException.class, () -> taskDAO.addTasks(task));
    }
    
}
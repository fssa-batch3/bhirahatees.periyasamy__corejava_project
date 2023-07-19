package day07.practice.uniqueTasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import day07.practice.uniqueTasks.*;


public class RemoveDuplicateTasks {
    public static void main(String[] args) {
 
        ArrayList<Task> tasks = new ArrayList<>();

        Task task1 = new Task(1, "Task1", LocalDate.of(2023, 7, 18));
        Task task2 = new Task(2, "Task1", LocalDate.of(2023, 7, 18));
        Task task3 = new Task(3, "Task2", LocalDate.of(2023, 7, 19));
        Task task4 = new Task(4, "Task2", LocalDate.of(2023, 7, 19));

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);


        HashSet<Task> unique = new HashSet<>(tasks);

    
        System.out.println("Unique tasks:");
        for (Task task : unique) {
            System.out.println("Task ID: " + task.getId() + ", Name: " + task.getName() + ", Deadline: " + task.getFinishingDate());
        }
    }
}


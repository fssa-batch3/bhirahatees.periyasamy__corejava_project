package day06.practice;

import java.util.*;
import day06.practice.*;

public class TaskNameAndPriority {
	public static void main(String[] args) {
	ArrayList<Task> tasks = new ArrayList<>();
	tasks.add(new Task("Waking Up" , 1));  
	tasks.add(new Task("Brushing" , 1));  
	tasks.add(new Task("Reading News" , 2));  
	tasks.add(new Task("Bathing" , 1));
	
	for(Task task : tasks) {
		System.out.println("Task : " + task.getTask() + " , Priority :" + task.priority);
	}
	
	
	}
}

package day06.practice;

import java.util.*;
import day06.solved.*;

public class findTaskByName {

	public static boolean find(String name , ArrayList<Task> tasks) {
		   for(Task task : tasks) {
		        if(task.getTask().equals(name)) {
		            return true;
		        }
		    }
		    return false;
		}
	
	public static void main(String[] args) {
	ArrayList<Task> tasks = new ArrayList<>();
	tasks.add(new Task("Waking Up" , 1));  
	tasks.add(new Task("Brushing" , 1));  
	tasks.add(new Task("Reading News" , 2));  
	tasks.add(new Task("Bathing" , 1));

	
	if(find("Waking Up",tasks)) {
		System.out.print("Found");
	}else {
		System.out.print("Not Found");
	}
	
	
	}
	
	
	
}

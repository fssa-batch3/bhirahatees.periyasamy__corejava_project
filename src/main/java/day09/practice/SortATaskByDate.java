package day09.practice;

import java.util.Comparator;

public class SortATaskByDate implements Comparator<Task> {
	public int compare(Task a, Task b) {

	return a.getDeadline().compareTo(b.getDeadline());
	
	

	}
}
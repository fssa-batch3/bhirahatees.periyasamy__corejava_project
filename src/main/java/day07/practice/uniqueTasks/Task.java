package day07.practice.uniqueTasks;

import java.time.LocalDate;

public class Task {
	private int id;
	private String name;
	private LocalDate finishingDate;

	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.finishingDate = deadline;
	}

	public String getName() {
		return name;
	}

	public LocalDate getFinishingDate() {
		return finishingDate;
	}


	public int getId() {
		return id;
	}

}

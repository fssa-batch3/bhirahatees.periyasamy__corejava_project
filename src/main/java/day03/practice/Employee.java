package day03.practice;

public class Employee {
	public int id;
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Bhirahatees");
		Employee e2 = new Employee(2, "Arun");

		System.out.println("id = " + e1.id + "," + "name = " + e1.name);
		System.out.println("id = " + e2.id + "," + "name = " + e2.name);
	}

}
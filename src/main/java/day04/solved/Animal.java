package day04.solved;

public class Animal {
	private int age;
	private String name;

	public Animal(String name) {
		System.out.println("Calling Parent Constructor");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Lion extends Animal {

	public Lion(String name) {
		super(name);
		System.out.println("Calling Child Constructor");
	}

	private void roar() {
		System.out.println("The " + getAge() + " year old " + getName() + " says: Roar!");
	}

	public static void main(String[] args) {
		Lion simba = new Lion("Simba");
		simba.setAge(10);
		simba.roar();
	}
}

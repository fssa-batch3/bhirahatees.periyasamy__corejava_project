
package day02.solved;


public class Person {
	private String name; // Private data member
	private int age;
    private String nativeTown;
	
	private String getNativeTown() {
		return nativeTown;
	}

	private void setNativeTown(String nativeTown) {
		this.nativeTown = nativeTown;
	}

	public String getName() { // Public getter method
		return name;
	}

	public void setName(String name) { // Public setter method
		// name = name; Wrong way to use refer the attribute of class
		this.name = name; // this Keyword used for referring current instance
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("John"); // Setting the name using the setter method
		person.setAge(23);
		person.setNativeTown("Theni");
		String name = person.getName(); // Accessing the name using the getter method
		int age = person.getAge();
		String nativetown = person.getNativeTown();
		System.out.println(name); // Output: John
		System.out.println(age);
		System.out.println(nativetown);
		
	}
}
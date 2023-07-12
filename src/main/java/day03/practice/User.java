package day03.practice;


public class User {

	public String name;

	public String email;
	public String password;

	public User() {
	}

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;

	}

	public String getName() {

		return name;
	}

	public String getEmail() {

		return email;
	}

	public String getPassword() {

		return password;
	}
	
	
	

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public static void main(String [] args) {
		
		User_class student1 = new User_class("Gopikannan","gopikannan2902@gmail.com","Redvelvet2002");
		System.out.println("Student 1 Name : "+student1.name);
		System.out.println("Student 1 Email : "+student1.email);
		System.out.println("Student 1 Password : "+student1.password);
		
		User_class student2 = new User_class();
		student2.setName("Arun");
		student2.setEmail("arun2002@gmail.com");
		student2.setPassword("arun2002@");
		
	
		
	}
}
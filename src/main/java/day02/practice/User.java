package day02.practice;

public class User {
	
	private int id;
	private String name;
	private String email;
	private String password;
		
    private int getId() {
		return id;
	}


	private void setId(int id) {
		this.id = id;
	}


	private String getName() {
		return name;
	}


	private void setName(String name) {
		this.name = name;
	}


	private String getEmail() {
		return email;
	}


	private void setEmail(String email) {
		this.email = email;
	}


	private String getPassword() {
		return password;
	}


	private void setPassword(String password) {
		this.password = password;
	}


	
    
   
	public static void main(String[] args) {
		User jack = new User();
		jack.setId(92);
		jack.setName("Jack");
		jack.setEmail("bhirahatees.periyasamy@fssa.freshworks.com");
		jack.setPassword("Jack@123");
		
		System.out.println("Name : " + jack.getName());
		System.out.println("Id   : " + jack.getId());
		System.out.println("Email: " + jack.getEmail());
//		System.out.println("Pass : " + jack.getPassword());

	}

}

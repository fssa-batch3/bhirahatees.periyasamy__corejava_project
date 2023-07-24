package day03.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import day03.practice.*;

class TestUser {
	
	@Test
	void test1() {
		User user1 = new User("Bhirahateesvaran","bhirahatees@gmail.com","bhirahatee123");
		assertEquals("Arunkumar",user1.getName());
		assertNotEquals("password",user1.getPassword());
	}
	
	@Test
	void test2() {
		User user2 = new User();
		user2.setName("Bhirahatees");
		user2.setEmail("bhirahattes@gmail.com");
		assertNotEquals("mailid",user2.getEmail());
		assertEquals("Bhirahattes",user2.getName());
		
	}
	
}
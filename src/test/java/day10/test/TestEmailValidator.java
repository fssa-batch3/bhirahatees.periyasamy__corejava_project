package day10.test;

import static org.junit.jupiter.api.Assertions.*;
import day10.practice.*;

import org.junit.jupiter.api.Test;

 class TestEmailValidator {
	
	@Test
	void testEmail() {
		
		String email = "bhirahatees@gmail.com";
		
		try {
			assertTrue(new EmailValidator().isValidEmail(email));
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}
	}

}
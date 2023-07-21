package day10.practice;

import java.util.regex.Pattern;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class EmailValidator {
    public static void isValidEmail(String emailId) throws InvalidEmailException {
    	String regEx = "^.*@.*\\..*$";
		
		if(Pattern.matches(regEx,emailId)) {
			System.out.print(true);
		}else {
			 throw new InvalidEmailException("Invalid email address");
		}
		
    }
}


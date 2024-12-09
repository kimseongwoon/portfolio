package ch11.exercise.problem7;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		
	}
	public WrongPasswordException(String message) {
		super(message);
	}

}

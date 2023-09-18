package javaprogram.customexception;

public class NotEligibleForVoting extends RuntimeException {

	public NotEligibleForVoting(String string) {
		 super(string);
	}
}

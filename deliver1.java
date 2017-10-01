import java.util.Scanner;

public class deliver1 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int firstEntry = -1;
		int secondEntry = -1;
		String message = " ";

		// I used a try catch so if people enter letters or characters it tells them
		// immediately
		try {
			System.out.println("Please enter a positive 3 digit number (example 012, or 998):");
			firstEntry = scnr.nextInt();
		} catch (Exception e) {
			message = "Sorry you must enter numbers. You entered non numbers.";
		}
		// I did two ifs back to back with no first else because the catch gave the
		// error message only if someone entered numbers, not if someone entered
		// negative numbers
		if (firstEntry > 0) {
			try {
				System.out.println("Please enter an additional positive 3 digit number:");
				secondEntry = scnr.nextInt();
			} catch (Exception e) {

				message = "Sorry you must enter numbers. You entered non numbers.";
			}

		}
		if (secondEntry > 0) {

			// this checks if the digits are the the correct length and positive
			if ((Integer.toString(firstEntry).length() == 3) && (Integer.toString(secondEntry).length() == 3)) {
				message = matchDigits(firstEntry, secondEntry);
			}
			// I decided to do this to get more specific error messages
			else {
				message = ("Please run program again with correct parameters, positive three digit numbers.");
			}
		} else {
			if (message == " ") {
				message = "You must enter positive numbers of the correct length.";
			}
		}
		System.out.println(message);
	}

	public static String matchDigits(int firstNumber, int secondNumber) {
		// I set these to negative one for troubleshooting purposes
		int digitFirst = -1;
		int digitSecond = -1;
		int remainderFirst = -1;
		int remainderSecond = -1;
		int summation = -1;
		boolean digitsEqual = true;
		String message = " Default";

		// I set these this way so the remainder could change but the original numbers
		// be untouched
		remainderFirst = firstNumber;
		remainderSecond = secondNumber;
		int divisor = 100;
		while (digitsEqual && divisor >= 1) // helps prevent an infinite loop
		{
			digitFirst = remainderFirst / divisor;
			remainderFirst = remainderFirst - (digitFirst * divisor); // I know its a little weird to divide and then
																		// multiply it
			digitSecond = remainderSecond / divisor;
			remainderSecond = remainderSecond - (digitSecond * divisor);

			// so comparing to previous summation, however if there was no previous
			// summation then it will be -1, this allowed me one less variable
			if (summation > 0) {
				digitsEqual = (summation == (digitFirst + digitSecond));
			}
			// dividing by 10 to get the next digit until we get down to 1, .1 with end the
			// loop
			divisor = divisor / 10;
			summation = digitFirst + digitSecond;
		}

		if (digitsEqual) {
			message = "Your numbers " + firstNumber + " " + secondNumber + " have digits that add up to " + summation;
		} else {
			message = "Your numbers did not have matching adding digits.";
		}
		return message;
	}
}

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class deliverable2 {

	public static void main(String[] args) {
		LocalDate firstDate = LocalDate.of(1999, 04, 30);
		LocalDate secondDate = LocalDate.now();
		Period differenceDates = Period.ZERO;
		int firstEntry = 0;
		Scanner scnr = new Scanner(System.in);
		boolean playing = true;
		String answer = "";
		while (playing) {
			System.out.println("This is a program that calculates the amount of time between two dates. ");
			try {
				System.out.println("Please enter your first date in the format: yyyy mm dd");
				firstDate = LocalDate.of(scnr.nextInt(), scnr.nextInt(), scnr.nextInt());

			} catch (Exception e) {
				System.out.println("Please make sure you entered the appropriate value.");
			}
			try {
				System.out.println("Please enter your second date in the format: yyyy mm dd");
				secondDate = LocalDate.of(scnr.nextInt(), scnr.nextInt(), scnr.nextInt());

			} catch (Exception e) {
				System.out.println("Please make sure you entered the appropriate value.");
			}
			differenceDates = Period.between(firstDate, secondDate);
			System.out.println("The amount of time that has passed between the two dates is: "
					+ differenceDates.getYears() + " years, " + differenceDates.getMonths() + " months, and "
					+ differenceDates.getDays() + " days.");
			System.out.println("Dates are " + firstDate + "  " + secondDate);

			System.out.println("Would you like to try new dates? Please Type y to continue");
			try {
				answer = scnr.next();
			} catch (Exception e) {
				System.out.println("Please make sure you entered the appropriate value.");
			}
			if (answer.charAt(0) != 'y') {
				playing = false;
			}

		}

	}

}

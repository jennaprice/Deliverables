import java.time.LocalDate;
import java.util.Scanner;

public class deliverable2 {

	public static void main(String[] args) {
		LocalDate firstDate = LocalDate.of(1999, 04, 30);
		LocalDate secondDate = LocalDate.now();
		int firstEntry = 0;
		Scanner scnr = new Scanner(System.in);
		System.out.println("This is a program that calculates the amount of time between two dates. ");
		try {
			System.out.println("Please enter your first date in the format: yyyy mm dd");
			firstDate = LocalDate.of(scnr.nextInt(), scnr.nextInt(), scnr.nextInt());

		} catch (Exception e) {
			System.out.println("Please make sure you entered the appropriate value.");
		}
		try {
			System.out.println("Please enter your second date in the format: yyyy mm dd");
			firstDate = LocalDate.of(scnr.nextInt(), scnr.nextInt(), scnr.nextInt());

		} catch (Exception e) {
			System.out.println("Please make sure you entered the appropriate value.");
		}
		System.out.println(firstDate + " " + secondDate);
	}

}

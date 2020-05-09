package theaterProject;

import java.util.*;

public class TheatersRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tickets ticket = new Tickets();

		ticket.tix();
		ticket.membership();

		Scanner again = new Scanner(System.in);
		System.out.println("Is there anything that we can assist you with(y/n): ");
		String tryagain = again.nextLine();

		while (tryagain.equals("y") || tryagain.equals("Y")) {

			ticket.tix();
			ticket.membership();

			System.out.println("Is there anything that we can assist you with(y/n): ");
			tryagain = again.nextLine();

			if (tryagain.equalsIgnoreCase("n")) {

				System.out.println("Thank you for visiting AE theaters! Enjoy the movie!");
				System.exit(1);
			}
		}

		if (tryagain.equalsIgnoreCase("n")) {

			System.out.println("Thank you for visiting AE theaters! Enjoy the movie!");
			System.exit(1);
		}

	}// end of TheatersRunner

}

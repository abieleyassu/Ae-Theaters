package theaterProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tickets {

	private double adults = 11.20;
	private double kids = 8.50;
	private String movie = "";
	double totalcost = 0;
	long phoneNumber;

	ArrayList<Integer> usaPhones = new ArrayList<>(Arrays.asList(403, 907, 205, 256, 334, 251, 870, 501, 479, 480, 623,
			928, 602, 520, 628, 341, 764, 925, 909, 562, 661, 657, 510, 650, 949, 760, 415, 951, 752, 831, 209, 669,
			408, 559, 626, 442, 530, 916, 707, 627, 714, 310, 323, 213, 424, 747, 818, 858, 935, 619, 805, 369, 720,
			303, 970, 719, 203, 959, 475, 860, 202, 302, 689, 407, 239, 836, 727, 321, 754, 954, 352, 863, 904, 386,
			561, 772, 786, 305, 861, 941, 813, 850, 478, 770, 470, 404, 706, 678, 912, 229, 671, 808, 515, 319, 563,
			641, 712, 208, 217, 282, 872, 312, 773, 464, 708, 815, 224, 847, 618, 309, 331, 630, 765, 574, 260, 219,
			317, 812, 913, 785, 316, 620, 327, 502, 859, 606, 270, 504, 985, 225, 318, 337, 774, 508, 781, 339, 857,
			617, 978, 351, 413, 443, 410, 280, 249, 969, 240, 301, 207, 383, 517, 546, 810, 278, 313, 586, 248, 734,
			269, 906, 989, 616, 231, 679, 947, 612, 320, 651, 763, 952, 218, 507, 636, 660, 975, 816, 314, 557, 573,
			417, 670, 601, 662, 228, 406, 336, 252, 984, 919, 980, 910, 828, 704, 701, 402, 308, 603, 908, 848, 732,
			551, 201, 862, 973, 609, 856, 505, 957, 702, 775, 315, 518, 716, 585, 646, 347, 718, 212, 516, 917, 845,
			631, 607, 914, 216, 330, 234, 567, 419, 380, 440, 740, 614, 283, 513, 937, 918, 580, 405, 503, 971, 541,
			814, 717, 570, 358, 878, 835, 484, 610, 445, 267, 215, 724, 412, 939, 787, 401, 843, 864, 803, 605, 423,
			865, 931, 615, 901, 731, 254, 325, 713, 940, 817, 430, 903, 806, 737, 512, 361, 210, 936, 409, 979, 972,
			469, 214, 682, 832, 281, 830, 956, 432, 915, 435, 801, 385, 434, 804, 757, 703, 571, 540, 276, 381, 236,
			802, 509, 360, 564, 206, 425, 253, 715, 920, 414, 262, 608, 353, 420, 304, 307));

	public void tix() {

		System.out.println(
				"Welcome to AE Theaters! The Premier Theater Choice of Families Around the World for Over 60 Years!");

		Scanner confirm = new Scanner(System.in);
		System.out.println("Would you like to take a look at today's movies? (yes/no): ");

		String conformation = confirm.nextLine();

		ArrayList<String> movies = new ArrayList<>(
				Arrays.asList("Space Jam", "Black Panther", "Avengers: Endgame", "Avengers: Infinity War"));

		if (conformation.equalsIgnoreCase("yes") || conformation.equalsIgnoreCase("y")) {

			int a = 0;

			while (a < movies.size()) {
				System.out.println("\n" + movies.get(a) + " " + "Showtimes: "
						+ "9:00AM (IMAX), 9:15AM (RealD 3D), 10:15AM (RealD 3D), 10:30AM (IMAX), 11:20AM (IMAX), "
						+ "\n"
						+ "11:40AM (RealD 3D), 12:05AM (RealD 3D), 12:10AM (IMAX), 1:10PM (IMAX), 1:15PM (RealD 3D), 2:30PM (RealD 3D), 2:45PM (IMAX), 3:00PM (RealD 3D)"
						+ "\n"
						+ "3:30PM(RealD 3D), 3:45PM(IMAX), 4:15PM(IMAX), 4:20PM(RealD 3D), 4:30PM(IMAX), 4:35PM(RealD 3D), 5:05PM(RealD 3D), 5:10PM(IMAX), 6:00PM(RealD 3D), "
						+ "\n"
						+ "6:00PM(IMAX), 6:30OM(IMAX), 6:40PM(RealD 3D), 7:10PM(RealD 3D), 7:15PM(IMAX), 7:40PM(RealD 3D), 7:45PM(IMAX), 8:00PM(IMAX)"
						+ "8:15PM(RealD 3D), 8:20PM(IMAX), " + "\n"
						+ "8:35PM(RealD 3D), 9:00PM(IMAX), 9:00PM(RealD 3D), 9:15PM(IMAX), 9:20PM(RealD 3D), 9:30PM(IMAX), 9:35PM(RealD 3D), 9:40PM(IMAX), 9:45PM(RealD 3D)");

				System.out.println("\n");
				a++;
			}

			Scanner movieSelection = new Scanner(System.in);
			System.out.println("Please select the movie you want to watch: ");
			movie = movieSelection.nextLine();

			if (movie.equalsIgnoreCase("Space Jam") || movie.equalsIgnoreCase("Avengers: Endgame")
					|| movie.equalsIgnoreCase("Black Panther") || movie.equalsIgnoreCase("Avengers: Infinity War")) {

				System.out.println("\n");

				Scanner time = new Scanner(System.in);
				System.out.println("Which showtime would you like to purchase a ticket for?: ");
				String showTime = time.nextLine();

				System.out.println("\n");

				Scanner guest = new Scanner(System.in);
				System.out.println("How many of the guests visiting today are adults?: ");
				int adult = guest.nextInt();

				Scanner guest2 = new Scanner(System.in);
				System.out.println("How many of the guests visiting today are kids?");
				int kid = guest2.nextInt();

				System.out.println("\n");
				System.out.println("You have selected: " + "\n" + movie + " with the showtime at " + showTime + " with "
						+ adult + " adults and " + kid + " kids attending today.");

				totalcost = (adult * adults) + (kids * kid);

				System.out.println("Your total cost is $" + totalcost);
			}

			else {
				while (!movie.equalsIgnoreCase("Space Jam") || !movie.equalsIgnoreCase("Avengers: Endgame")
						|| !movie.equalsIgnoreCase("Black Panther")
						|| !movie.equalsIgnoreCase("Avengers: Infinity War")) {

					System.out.println("Sorry we currently don't have the title you have selected. ");

					movieSelection = new Scanner(System.in);
					System.out.println("Please select the movie you want to watch from the selection above: ");
					movie = movieSelection.nextLine();

					if (movie.equalsIgnoreCase("Space Jam") || movie.equalsIgnoreCase("Avengers: Endgame")
							|| movie.equalsIgnoreCase("Black Panther")
							|| movie.equalsIgnoreCase("Avengers: Infinity War")) {
						{
							System.out.println("\n");

							Scanner time = new Scanner(System.in);
							System.out.println("Which showtime would you like to purchase a ticket for?: ");
							String showTime = time.nextLine();

							System.out.println("\n");
							Scanner guest = new Scanner(System.in);
							System.out.println("How many of the guests visiting today are adults?: ");
							int adult = guest.nextInt();

							Scanner guest2 = new Scanner(System.in);
							System.out.println("How many of the guests visiting today are kids?");
							int kid = guest2.nextInt();

							System.out.println("\n");
							System.out.println("You have selected: " + "\n" + movie + " with the showtime at "
									+ showTime + " with " + adult + " adults and " + kid + " kids attending today.");

							totalcost = (adult * adults) + (kids * kid);

							System.out.println("Your total cost is $" + totalcost);

							break;

						}
					}

				}

			}

		}

		else {

			System.out.println("Thank you for visiting AE theaters!");
			System.exit(1);
		}

	}

	public void membership() {

		Scanner name = new Scanner(System.in);
		System.out.println("Can you plase provide us with your name?");
		String Name = name.nextLine();
		
		System.out.println("\n");
		
		
		System.out.println(
				"Are you a current card holding member, student, or a senoir citizen over the age of 64+(Y/N)?: ");


		Scanner userMembership = new Scanner(System.in);
		String answerMembership = userMembership.nextLine();

		if (answerMembership.contains("y") || answerMembership.contains("yes") || answerMembership.contains("Yes")
				|| answerMembership.contains("Y")) {

			Scanner phone = new Scanner(System.in);
			System.out.println(
					"Can you please enter in your phone number to gain access to our members discounts and perks: ");
			phoneNumber = phone.nextLong();

			int z = (int) (phoneNumber / 10000000);

			boolean membershipCheck = usaPhones.contains(z);

			double concessionsSavings = .15;
			double ticketSavings = .10;

			if (membershipCheck == true) {
				System.out.println("Thank you " + Name + " for varifying your membership!");
				System.out.println("You are eligible for upto " + ticketSavings * 100
						+ "% in savings on any current or future ticket purchases " + "with " + concessionsSavings * 100
						+ "% off of any purchase of conessions.");

				double savings = totalcost - (totalcost * ticketSavings);

				System.out.println("Bringing your total today to $" + savings);
			}

			else {

				System.out.println("Sorry " + Name
						+ " it looks like we weren't able to validate your membership. Please try Again");

				while (usaPhones.contains(z) == false) {

					System.out.println(
							"Can you please enter in your phone number to gain access to our members discounts and perks: ");

					phone = new Scanner(System.in);
					phoneNumber = phone.nextLong();

					int a = (int) (phoneNumber / 10000000);
					double savings = totalcost - (totalcost * ticketSavings);

					if (usaPhones.contains(a)) {
						System.out.println("Thank you " + Name + " for varifying your membership!");
						System.out.println("You are eligible for " + ticketSavings * 100
								+ "% saving(s) on any current or future ticket purchases " + "with "
								+ concessionsSavings * 100 + "% off of any purchase of conessions.");

						System.out.println("Bringing your total today to $" + savings);

						break;
					}

				}

			}

		} // end of yes answer

		else {

			System.out.println("Sorry " + Name + " to hear that would you like to sign up for a membership(y/n):");

			Scanner signUp = new Scanner(System.in);
			String membership = signUp.nextLine();

			if (membership.contentEquals("yes") || membership.contains("Yes") || membership.contains("y")
					|| membership.contains("Y")) {

				Scanner SignUp = new Scanner(System.in);
				System.out.println("Please enter in your phone number(USA only): ");
				long memberSignUp = SignUp.nextLong();

				int q = (int) (memberSignUp / 10000000);

				if (usaPhones.contains(q)) {

					System.out.println(
							"Great thanks for signing up for our Gold plus membership! You are currently eligible for a free Popcorn on us!");

				}

				else {

					while (usaPhones.contains(q) == false) {
						System.out.println("Would you like to try again and put a valid phone number(USA only): ");

						signUp = new Scanner(System.in);
						memberSignUp = signUp.nextLong();

						int r = (int) (memberSignUp / 10000000);

						if (usaPhones.contains(r) == true) {
							System.out.println(
									"Great thanks for signing up for our Gold plus membership! You are currently eligible for a free Popcorn on us!");
							break;
						}
					}
				}

			} // Membership answer yes

		} // end of no else statement answer

	}// end of welcome method
}

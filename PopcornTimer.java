// We have to first import the Scanner class from the java.util package

import java.util.Scanner;

public class PopcornTimer {
	
	static final int number_of_secs_in_a_min = 60;

	public static void main(String[] args) {
		
		// I am creating a Scanner object
		Scanner scan = new Scanner(System.in);
		
		// Welcome message
		System.out.println("Welcome to WATT's-A-Poppin Popcorn Setup!");
		
		// Design as shown in the sample!
		System.out.println("*****************************************");
		
		// Asking the user to input name
		System.out.print("Please enter your name: ");
		String name = scan.next();
		
		// Asking the user to input number of popcorn packs.
		System.out.print("Hello "+name+", how many popcorn packs do you need to pop today? ");
		int number_of_packets = scan.nextInt();
		
		// Every popcorn packet needs 3 minutes 25 seconds = 60 + 60 + 60 + 25 = 205 seconds to pop.
		int time_in_secs_for_one_packet = 205;
		
		int time_in_secs_for_all_packets = number_of_packets * time_in_secs_for_one_packet;
		
		System.out.println("Please set the time to "+ time_in_secs_for_all_packets + " seconds.");
		
		int minutes_part = time_in_secs_for_all_packets / 60;
		int seconds_part = time_in_secs_for_all_packets % 60;
		
		System.out.println("Please set the time to "+ minutes_part + " minutes and " + seconds_part + " seconds.");
		
		// Final part
		System.out.println("*******************************************");
		System.out.println("Thanks for using this app. Have a nice day!");
		
		
		
	}

}


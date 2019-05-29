package com.itacademy.enumy;

import java.util.Scanner;

public class App {
	
	private static String askForName() {
		System.out.println("Enter polish day's name: ");
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}

	public static void main(String[] args) {
		System.out.println("Working days: "+DayOfWeek.getWorkingDays());
		System.out.println("Weekend days: "+DayOfWeek.getWeekendDays());

		do {
			try {
				String polishName = askForName();
				DayOfWeek myDay = DayOfWeek.getByPolishName(polishName);
				System.out.println("Day " + myDay + " is " + (myDay.isWeekendDay() ? "weekend" : "working") + " day");
			} catch (NullPointerException e) {
				System.out.println("Unknown day's name");
			}
		} while (true);
	}
}

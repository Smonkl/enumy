package com.itacademy.enumy;

import java.util.Scanner;

public class Enumy {

	private static String askForName() {
		System.out.println("Enter polish day's name: ");
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}

	public static void main(String[] args) {
		System.out.println("Working days: " + DayOfWeek.getWorkingDays());
		System.out.println("Weekend days: " + DayOfWeek.getWeekendDays());

		DayOfWeek[] days = DayOfWeek.values();
		for (DayOfWeek day : days) {
			System.out.println(day.getPolishName());
		}

		do {
			try {
				String polishName = askForName();
				if ("exit".equalsIgnoreCase(polishName)) {
					break;
				}
				DayOfWeek day = DayOfWeek.getByPolishName(polishName);
				System.out.println("Day " + day + " is " + (day.isWeekendDay() ? "weekend" : "working") + " day");
			} catch (NullPointerException e) {
				System.out.println("Unknown day's name");
			}
		} while (true);
	}
}

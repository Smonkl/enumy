package com.itacademy.enumy;

import java.util.*;
import org.apache.commons.lang3.*;

public enum DayOfWeek {
	MONDAY("Poniedziałek", false), 
	TUESDAY("Wtorek", false), 
	WEDNESDAY("Środa", false), 
	THURSDAY("Czwartek", false),
	FRIDAY("Piątek", false), 
	SATURDAY("Sobota", true), 
	SUNDAY("Niedziela", true);

	public String getPolishName() {
		return polishName;
	}

	public boolean isWeekendDay() {
		return isWeekendDay;
	}

	private String polishName;
	private boolean isWeekendDay;

	DayOfWeek(String polishName, boolean isWeekendDay) {
		this.polishName = polishName;
		this.isWeekendDay = isWeekendDay;
	}
	
	public static Collection<DayOfWeek> getWorkingDays(){
		return List.of(MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY);
	}

	public static Collection<DayOfWeek> getWeekendDays(){
		return List.of(SATURDAY,SUNDAY);
	}

	public static DayOfWeek getByPolishName(String polishName) {
		if (StringUtils.isEmpty(polishName)) return null;

		DayOfWeek[] days = DayOfWeek.values();
		for (DayOfWeek day:days) {
			if (day.polishName.equalsIgnoreCase(polishName))
				return day;
		}
		return null;
	}

}


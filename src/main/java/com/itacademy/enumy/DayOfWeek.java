package com.itacademy.enumy;

import java.util.*;
import org.apache.commons.lang3.*;

//javaDoc generator, extra  javadoc options
//-encoding UTF-8 -charset UTF-8 -docencoding UTF-8

public enum DayOfWeek {
	MONDAY("Poniedziałek", false),
	TUESDAY("Wtorek", false),
	WEDNESDAY("Środa", false),
	THURSDAY("Czwartek", false),
	FRIDAY("Piątek", false),
	SATURDAY("Sobota", true),
	SUNDAY("Niedziela", true);

	/**
	 * <p>
	 * Returns polish name of given enum instance.
	 * </p>
	 *
	 * <p>
	 * Polish letters (ĄĆĘŁŃÓŚŻąćęłńóśż) are used in names.
	 * </p>
	 *
	 * @return Polish name for enum
	 * @since 1.0
	 */
	public String getPolishName() {
		return polishName;
	}

	/**
	 * <p>
	 * Checks if given enum instance is weekend day.
	 * </p>
	 *
	 * @return {@code true} if the day is weekend day
	 * @since 1.0
	 */
	public boolean isWeekendDay() {
		return isWeekendDay;
	}

	private String polishName;
	private boolean isWeekendDay;

	DayOfWeek(String polishName, boolean isWeekendDay) {
		this.polishName = polishName;
		this.isWeekendDay = isWeekendDay;
	}

	/**
	 * <p>
	 * Provides a list of working days.
	 * </p>
	 *
	 * @return Unmodifiable list of working days
	 * @since 1.0
	 */
	public static Collection<DayOfWeek> getWorkingDays() {
		return List.of(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY);
	}

	/**
	 * <p>
	 * Provides a list of weekend days.
	 * </p>
	 *
	 * @return Unmodifiable list of weekend days
	 * @since 1.0
	 */
	public static Collection<DayOfWeek> getWeekendDays() {
		return List.of(SATURDAY, SUNDAY);
	}

	/**
	 * <p>
	 * Returns enum instance by polish name.
	 * </p>
	 *
	 * <p>
	 * Polish letters (ĄĆĘŁŃÓŚŻąćęłńóśż) are used in names.
	 * </p>
	 *
	 * @param polishName the String of polish name
	 * @return enum instance if the name matches, otherwise {@code null}
	 * @since 1.0
	 */
	public static DayOfWeek getByPolishName(String polishName) {
		if (StringUtils.isBlank(polishName))
			return null;

		DayOfWeek[] days = DayOfWeek.values();
		for (DayOfWeek day : days) {
			if (day.polishName.equalsIgnoreCase(polishName))
				return day;
		}
		return null;
	}

}

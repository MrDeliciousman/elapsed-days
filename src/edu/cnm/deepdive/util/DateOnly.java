package edu.cnm.deepdive.util;

public class DateOnly {

  public static int elapsedDays(int year, int month, int day) {
    int count = 0;
    int[] daysinMonth = {31, 28, 31, 30,31, 30, 31, 31,30, 31, 30, 31};
    count = year - 1970;
    count += day;
    for (int i = 0; i <= month; i++) {
      count += daysinMonth[i];
    }
    for (int i = 1970; i <= year; i++) {
      isLeapYear(i);
    }

    return count; // TODO Implement this method to return correct value.
  }

  private static boolean isLeapYear(int year) {
    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

      return true;
    }
    return false;
  }

}

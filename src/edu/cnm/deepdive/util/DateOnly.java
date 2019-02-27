package edu.cnm.deepdive.util;

import java.text.DateFormat;

public class DateOnly {

  public static int elapsedDays(int year, int month, int day) {
    int count = 0;
    int[] daysInMonth = {31, 28, 31, 30,31, 30, 31, 31,30, 31, 30, 31};
    int START_YEAR = 1970;
    count = (year - 1970) * 365;
    count += (day - 1);
    if(year<START_YEAR){
      START_YEAR = year;
      year = 1970;
    }
    if (month > 1) {
      for (int i = 0; i < month; i++) {
        count += daysInMonth[i];
      }
    }
      for (int i = START_YEAR; i <= year; i++) {
        if (isLeapYear(i)) {
          if (year == 1970) {
            count--;
          } else {

            count++;
          }
        }
      }

    return count;
  }

  private static boolean isLeapYear(int year) {
    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

      return true;
    } else {
      return false;
    }
  }

}

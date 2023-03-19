package javaprograms;

import java.time.LocalDate;
import java.time.Period;

public class DateDiffrence 
{
	 public static void main(String[] args) {
		    LocalDate oldDate = LocalDate.of(1995, 05, 01);
		    LocalDate now = LocalDate.now();
		    Period diff = Period.between(oldDate, now);
		    System.out.printf("Date Difference is %d years, %d months and %d days old",
		                        diff.getYears(), diff.getMonths(), diff.getDays());
		  }
}

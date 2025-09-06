package Exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountWorkingDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String startDateInput = scanner.nextLine();
        String endDateInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate startDate = LocalDate.parse(startDateInput, formatter);
        LocalDate endDate = LocalDate.parse(endDateInput, formatter);

        Set<MonthDay> holidays = Set.of(
                MonthDay.of(1, 1),
                MonthDay.of(3, 3),
                MonthDay.of(5, 1),
                MonthDay.of(5, 6),
                MonthDay.of(5, 24),
                MonthDay.of(9, 6),
                MonthDay.of(9, 22),
                MonthDay.of(11, 1),
                MonthDay.of(12, 24),
                MonthDay.of(12, 25),
                MonthDay.of(12, 26)
        );

        LocalDate currentDate = startDate;
        int workingDaysCounter = 0;
        while (!currentDate.isAfter(endDate)) {
            DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
            MonthDay monthDay = MonthDay.from(currentDate);

            if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                currentDate = currentDate.plusDays(1);
                continue;
            } else if (holidays.contains(monthDay)) {
                currentDate = currentDate.plusDays(1);
                continue;
            } else {
                workingDaysCounter++;
            }
            currentDate = currentDate.plusDays(1);
        }
        System.out.println(workingDaysCounter);
    }
}

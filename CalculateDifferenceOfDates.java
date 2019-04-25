package Homework3.dateTimeForm;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculateDifferenceOfDates {

     /*Following function takes a date imported by the user and present date and
     calculates the difference between those dates */

        public long difference(String importedDate,  LocalDate localDate) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate input = LocalDate.parse(importedDate, formatter);
        long daysBetween = ChronoUnit.DAYS.between(input, localDate);

        if(daysBetween>=0)
        return daysBetween;
        else
        return -daysBetween;

    }


}

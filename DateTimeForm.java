package Homework3.dateTimeForm;
import java.time.LocalDate;
import java.util.Scanner;
public class DateTimeForm {

    public static void main(String[] args) {
        // Taking input from the user
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter a date in dd/MM/yyyy format");
          String importedDate = scan.nextLine();
        // Creating today's date in LocalDate type
          LocalDate localDate = LocalDate.now();
          System.out.println("Today's date is: " + localDate);


         CalculateDifferenceOfDates obj = new CalculateDifferenceOfDates();
         long difference = obj.difference(importedDate, localDate);
         System.out.println("Difference between now and " + importedDate + " is " + difference +  " days.");



        }

    }


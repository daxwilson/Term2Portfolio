import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo {

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      Calendar cal = Calendar.getInstance(); 
      System.out.println("The current date is: " + cal.getTime());
      System.out.print("Enter your full birth year: ");
        int year = keyboard.nextInt();
      System.out.print("Enter the number of your birth month: ");
        int month = keyboard.nextInt();
      System.out.print("Enter the day of your birth: ");
        int day = keyboard.nextInt();
      System.out.print("Enter the hour of your birth: ");
        int hour = keyboard.nextInt();
      System.out.print("Enter the minute of your birth: ");
        int minute = keyboard.nextInt();
      System.out.print("Enter the second of your birth: ");
        int second = keyboard.nextInt();
      
        System.out.println("Day = " + day);
        System.out.println("Month = " + month);
        System.out.println("Year = " + year);
        
        int yearAge = (cal.get(Calendar.YEAR)) - year;
        int monthAge = (cal.get(Calendar.MONTH)) - month + 1;
        int dayAge = (cal.get(Calendar.DATE)) - day;
        int hourAge = (cal.get(Calendar.HOUR)) - hour;
        int minuteAge = (cal.get(Calendar.MINUTE)) - minute;
        int secondAge = (cal.get(Calendar.SECOND)) - second;
        
        if(monthAge < 0) {
          yearAge --;
          monthAge += 12;
        }
        if(dayAge < 0) {
          monthAge --;
          dayAge += 31;
        }
        if(hourAge < 0) {
          dayAge --;
          hourAge += 24;
        }
        if(minuteAge < 0) {
          hourAge --;
          minuteAge += 60;
        }
        if(secondAge < 0) {
          minuteAge --;
          secondAge += 60;
        }
        
        System.out.println(yearAge + " years, " + monthAge + " months, " + dayAge + " days, " + hourAge + " hours, " 
                             + minuteAge + " minutes and " + secondAge + " seconds old.");

   }
}
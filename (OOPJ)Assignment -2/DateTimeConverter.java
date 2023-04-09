import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Scanner;

class DateTimeConverter
{
    public static void main(String[] args)throws Exception
    {
       Scanner sc=new Scanner(System.in);

       System.out.print("Enter date & time (dd/mm/yyyy) (hh:mm:ss a): ");
       String dateTime = sc.nextLine();
        
       

        //covert string date into LocalTimeDate Oject
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        LocalDateTime localDateTime=LocalDateTime.parse(dateTime, dateTimeFormatter);

        //covertig date into required format as per question
        String ddmmyyyy = localDateTime.format(DateTimeFormatter.ofPattern("dd/mm/yyyy"));
        String mmddyyyy = localDateTime.format(DateTimeFormatter.ofPattern("mm/dd/yyyy"));
        String yyyymmdd = localDateTime.format(DateTimeFormatter.ofPattern("yyyy/mm/dd"));

        //print date
        System.out.println("dd/mm/yyyy: "+ddmmyyyy);
        System.out.println("mm/dd/yyyy: "+mmddyyyy);
        System.out.println("yyyy/mm/dd: "+yyyymmdd);
        System.out.println();
        

       // convertig time into required format as per question
        String hhmmss = localDateTime.format( DateTimeFormatter.ofPattern("hh:mm:ss"));
        String hhmmssa = localDateTime.format( DateTimeFormatter.ofPattern("hh:mm:ss a"));
        String hhmm = localDateTime.format( DateTimeFormatter.ofPattern("hh:mm"));

        //print time
        System.out.println("hh:mm:ss: "+hhmmss);
        System.out.println("hh:mm:ss a: "+hhmmssa);
        System.out.println("hh:mm: "+hhmm);
        System.out.println();

         // convertig date and time into required format as per question
        String ddmmyyyyhhmmss = localDateTime.format( DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss"));
        String mmddyyyyhhmmssa = localDateTime.format( DateTimeFormatter.ofPattern("mm/dd/yyyy hh:mm:ss a"));
        String yyyymmddhhmm = localDateTime.format( DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm"));

       //print date and time
        System.out.println("dd/mm/yyyy hh:mm:ss: "+ddmmyyyyhhmmss);
        System.out.println("mm/dd/yyyy hh:mm:ss a: "+mmddyyyyhhmmssa);
        System.out.println("yyyy/mm/dd hh:mm: "+yyyymmddhhmm);
        

    }
}
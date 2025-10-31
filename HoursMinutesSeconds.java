import java.util.Scanner;
public class HoursMinutesSeconds{
  public static void main(String[] args){
   
   int hours,minutes,second;
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter Hours");
   hours=sc.nextInt();
   
   System.out.println("Enter Minutes");
   minutes=sc.nextInt();
   
   System.out.println("Enter Seconds");
   second=sc.nextInt();
   
     if(hours>=0 && hours<24 )
        if(minutes>=0 && minutes<60)
     if(second>=0 && second<60){
       System.out.println("Time is valid");
     }
    else{
        System.out.println("second are Invalid");
    }
   else{
        System.out.println("Minutes are Invalid");
    }
   else{
      System.out.println("Hours are Invalid");
  }
  }
}
   
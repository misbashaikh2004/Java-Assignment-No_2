//13. Accept the time as hour, minute and seconds and check whether the time is valid. (Hint:0<=hour<24, 0<=minute <60, 0<=second <60) (3 logics) 

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
   
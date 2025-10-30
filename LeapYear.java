import java.util.Scanner;
public class LeapYear{
 public static void main(String[] args){
   
   int a;
   Scanner sc=new Scanner(System.in);

   System.out.println("Enter a Year");
   a=sc.nextInt();
   
    if(a%100 == 0 && a%400 == 0 || a%100 != 0 && a%4==0){
      System.out.println("Leap Year");
   }
    else{ 
      System.out.println("Not Leap Year");
   } 
 }
}
    
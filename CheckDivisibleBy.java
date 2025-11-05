//5. Write a program to check whether given number is divisible by 5 and 7? (with && operator and with nested if)

import java.util.Scanner;
public class CheckDivisibleBy
{
    public static void main(String[] args){
    
    int num;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter A Number");
    num=sc.nextInt();
 
     if (num % 5 == 0) {
        if (num % 7 == 0)
            System.out.println("Number is divisible by both 5 and 7");
        else
            System.out.println("Number is divisible by 5 but not by 7");
    } 
     else
        System.out.println("Number is not divisible by 5");
     
  
  }
}  
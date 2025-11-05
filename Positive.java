//1. Write a program to check whether given number is positive?

import java.util.Scanner;
public class Positive{
 public static void main(String[] args){

   int a;
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter a Number");
   a=sc.nextInt();
   
   if(a>0)
     System.out.println("Positive Number");
  }
}
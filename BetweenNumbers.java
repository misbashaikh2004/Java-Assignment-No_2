//7. Write a program to accept three numbers and check whether the first is between the other two numbers. Ex: Input 20 10 30. Output: 20 is //between 10 and 30 


import java.util.Scanner;
public class BetweenNumbers{
   public static void main(String[] args){
  
    int a,b,c;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter 3 Numbers:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();

   
        if((a > b && a < c) || (a > c && a < b)) {
            System.out.println(a + " is between " + b + " and " + c);
        }
        else {
            System.out.println(a + " is NOT between " + b + " and " + c);
        }
    }
}
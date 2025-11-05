//11. Write a program to compare two numbers? (==,>,<)


import java.util.Scanner;
public class Compare{
   public static void main(String[] args){
  
    int a,b;
    Scanner sc = new Scanner(System.in);
     
    System.out.println("Enter 2 Numbers");
    a=sc.nextInt();
    b=sc.nextInt();

    if( a == b){
        System.out.println("A Is Equal To B");
    }
    else if( a > b){
        System.out.println("A Is Greater Than B");
    }

    else if( a < b){
         System.out.println("A Is Less Than B");
    }
    else{
         System.out.println("INVALID");
    }
   }
}
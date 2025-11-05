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
        System.out.println(a +" "+"Is Equal To"+" " + b);
    }
    else if( a > b){
        System.out.println(a +" "+"Is Greater Than"+" "+ b);
    }

    else if( a < b){
         System.out.println(a +" "+"Is Less Than" +" "+ b);
    }
    else{
         System.out.println("INVALID");
    }
   }
}
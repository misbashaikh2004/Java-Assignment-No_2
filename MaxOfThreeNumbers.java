import java.util.Scanner;
 public class MaxOfThreeNumbers{
   
   public static void main(String args[]){
     
    int a,b,c;
    Scanner sc=new Scanner(System.in);
     
    System.out.println("Enter Three Numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
   
    if(a>=b && a>=c){
       System.out.println("Max is :"+a);
    }

    else if(b>=a && b>=c){
      System.out.println("Max is :"+b);
     }
     
    else
      System.out.println("Max is :"+c);
    }
}
  
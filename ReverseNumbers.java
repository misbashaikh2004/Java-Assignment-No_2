import java.util.Scanner;
public class ReverseNumbers{
public static void main(String[] args){
 
  int n,result=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter Numbers");
  n=sc.nextInt();
  
 while(n > 0){
   int rem=n % 10;
   result = result * 10 + rem;
   n=n/10;
   }
  System.out.println("Reverse Number Is:"+result);
  }
}
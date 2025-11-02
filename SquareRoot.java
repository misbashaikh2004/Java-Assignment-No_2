import java.util.Scanner;
public class SquareRoot{
  public static void main(String[] args){
  
   int n;
   Scanner sc=new Scanner(System.in);

   System.out.println("Enter A Number");
   n=sc.nextInt();
   
  double m=Math.sqrt(n);
   System.out.println("Square Root Of " + n + " = " + m); 
 }
}
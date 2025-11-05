import java.util.Scanner;
public class InterChangeUsingOpe{
  public static void main(String args[]){
     
   int a,b;
   Scanner sc=new Scanner(System.in);
 
   System.out.println("Enter 2 Numbers");
   a=sc.nextInt();
   b=sc.nextInt();
 
   a = a * b;
   b = a / b;
   a = a / b;

    
   System.out.println("After Changing The Number:"+ a +" "+b);
  }
}
  
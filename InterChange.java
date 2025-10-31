import java.util.Scanner;
public class InterChange{
public static void main(String[] args){

 int a,b;
 Scanner sc=new Scanner(System.in);
  
 System.out.println("Enter 2 Number");
 a=sc.nextInt();
 b=sc.nextInt();

  a = a+b;
  b = a-b;
  a = a-b; 
  
System.out.println("After Changing The Number:"+ a +" "+b);
  }
}
  
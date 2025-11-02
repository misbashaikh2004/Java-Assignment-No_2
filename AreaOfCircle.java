import java.util.Scanner;
public class AreaOfCircle{
  public static void main(String[] args){

   double radius,area;
   Scanner sc=new Scanner(System.in);

   System.out.println("Enter A Radius Circle");
    radius=sc.nextDouble(); 

   area = 3.14 * radius * radius;
   System.out.println("Area of Circle"+area);
   }
}
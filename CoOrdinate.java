//14. Accept the x and y coordinate of a point and find the quadrant in which the point lies. (2 logics and origin condition) 


import java.util.Scanner;
public class CoOrdinate{
  public static void main(String[] args){

   int x,y;
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter X co-ordinate");
   x=sc.nextInt();

   System.out.println("Enter Y co-ordinate");
   y=sc.nextInt();

   
  if (x == 0 && y == 0) {
            System.out.println("Point lies at Origin");
        }
        else if (x == 0) {
            System.out.println("Point lies on Y-Axis");
        }
        else if (y == 0) {
            System.out.println("Point lies on X-Axis");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Point lies in 1st Quadrant");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Point lies in 2nd Quadrant");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Point lies in 3rd Quadrant");
        }
        else {
            System.out.println("Point lies in 4th Quadrant");
        }
    }
}
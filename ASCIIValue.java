import java.util.Scanner;
public class ASCIIValue{
  public static void main(String[] args){
   
  char ch;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter Character");
  ch=sc.next().charAt(0);

   System.out.println("ASCII value of " + ch + " is: " + (int)ch);
  }
}
//19. Write a Program to convert lowercase letter into uppercase letter and vice versa.


import java.util.Scanner;
public class ConvertUpperIntoLower{
   public static void main(String[] args){
   
   char ch,ch2;
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter Character:");
   ch=sc.next().charAt(0);

   if(ch >= 'A' && ch <= 'Z'){
      ch2 = Character.toLowerCase(ch);
      System.out.println("Lowercase"+" "+ch2);
   }

   else{     
      ch2 = Character.toUpperCase(ch);
      System.out.println("Uppercase"+" "+ch2);
   }
  }
}
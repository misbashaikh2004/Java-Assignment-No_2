import java.util.Scanner;
public class Calculator{
  public static void main(String[] args){
    
    int a,b,c,ch;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter 2 Number:");
    a=sc.nextInt();
    b=sc.nextInt();
    
    System.out.println("Enter your choice");
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplition");
    System.out.println("4.Division");
    System.out.println("5.Modulus");
    ch=sc.nextInt();

    if(ch==1){
      c=a+b;
      System.out.println("Addition is:"+c);
     }  
     
     else if(ch==2){
      c=a-b;
      System.out.println("Subtraction is:"+c);
     }  
   
      else if(ch==3){
      c=a*b;
      System.out.println("MultiPlication is:"+c);
     }  
     
      else if(ch==4){
      c=a/b;
      System.out.println("Division is:"+c);
     }  
 
     else if(ch==5){
      c=a%b;
      System.out.println("Modulus is:"+c);
     }  
    
     else{
         System.out.println("Invalid Choice");
      }
   }
} 
       
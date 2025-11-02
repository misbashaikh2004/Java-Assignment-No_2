import java.util.Scanner;
public class ArmStrongNumbers{
  public static void main(String[] args){
  
    int arm=0,rem,c,n;
    Scanner sc=new Scanner(System.in);
  
    System.out.println("Enter Numbers");
    n=sc.nextInt();
    
    c=n;
    while(n>0){
       rem=n % 10;
       arm=(rem*rem*rem)+arm;
       n/=10;
     }
  
    if(c == arm)
       System.out.println("ArmStrong Numbers");

    else
       System.out.println("not ArmStrongNumbers");
   
   }
} 
import java.util.Scanner;
public class CheckPalindromeNumbers{
  public static void main(String[] args){
  
    int rev=0,temp,n;
    Scanner sc=new Scanner(System.in);
  
    System.out.println("Enter Numbers");
    n=sc.nextInt();
    
    temp=n;
    while(n>0){
       int rem=n % 10;
       rev=rev * 10 + rem;
       n/=10;
     }
  
    if(rev == temp)
       System.out.println("palindrome");

    else
       System.out.println("not palindrome");
   
   }
} 
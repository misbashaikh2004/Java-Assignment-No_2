import java.util.Scanner;
public class PrimeOrNot{
  public static void main(String[] args){
    
   int n,cnt=0;
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter a Number");
   n=sc.nextInt();
   
  for(int i=1;i<=n;i++){
    if(n % i == 0)
      cnt++;
   }
    
    if(cnt==2)
      System.out.println("Prime Number");
     
    else
        System.out.println("Not Prime Number");
    
  }
}
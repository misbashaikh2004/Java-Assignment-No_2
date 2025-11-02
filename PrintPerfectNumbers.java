import java.util.Scanner;
public class PrintPerfectNumbers{
   public static void main(String[] args){
     
    int n;
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter A Number:");
    n=sc.nextInt();

    for(int i=1;i<=n;i++){
      if(n % i == 0){
         System.out.println(i+" ");
      }
    }
   }
}
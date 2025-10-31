import java.util.Scanner;
public class PrintHello{
  public static void main(String[] args){
   
   int n;
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter A Number");
   n=sc.nextInt();
   
   for(int i=1;i<=n;i++){
     System.out.println("Hello");
    }
  }
}
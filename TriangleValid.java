import java.util.Scanner;
public class TriangleValid{
    public static void main(String[] args){
  
   int a,b,c;
   Scanner sc=new Scanner(System.in);
  
   System.out.println("Enter First Side");
   a=sc.nextInt();
   
   System.out.println("Enter Two Side");
   b=sc.nextInt();
   
   System.out.println("Enter Third Side");
   c=sc.nextInt();
   
   if(a+b>c && b+c>a && c+a>b){
      System.out.println("Triangle is Valid");
    }
   else{
      System.out.println("Triangle is Not Valid");
    }
  }
}
     
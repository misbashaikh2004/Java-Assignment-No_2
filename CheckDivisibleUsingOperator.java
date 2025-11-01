import java.util.Scanner;
public class CheckDivisibleUsingOperator{
    public static void main(String[] args){
    
    int num;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter A Number");
    num=sc.nextInt();
 
     if (num % 5 == 0 && num % 7 == 0){
            System.out.println("Number Is Divisible By Both 5 And 7");
        }
        
     else{
        System.out.println("Number Is Not Divisible By Both");
    }
     
  }
}  
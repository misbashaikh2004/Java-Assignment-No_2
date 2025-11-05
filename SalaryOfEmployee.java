//15. Write a program, which accepts annual basic salary of an employee and 
//calculates and displays the Income tax as per the following rules 
//1. Basic: < 1,50,000 Tax = 0 
//2. 1,50,000 to 3,00,000 Tax = 20% 
//3. > 3,00,000 Tax = 30%

import java.util.Scanner;
public class SalaryOfEmployee{
   public static void main(String[] args){

     double salary,tax;
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Annual Basic Salary:");
     salary = sc.nextDouble();
         
     if( salary < 150000){
        tax = 0;
     }
     else if(salary <= 300000){
         tax = salary * 0.20;
     }

     else{
         tax = salary * 0.30;
    }
     System.out.println("Income tax is "+tax);
    }
}

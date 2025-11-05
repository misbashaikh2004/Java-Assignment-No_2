//17. Write a program to accept quantity and rate for three items, compute the total sales amount, Also compute and print the discount as follows: (amount > – 
//20% discount, amount between to – 15% discount, amount between – to -- 8 % discount


import java.util.Scanner;
public class Quantity{
   public static void main(String[] args){

    int rate1,rate2,rate3,quantity1,quantity2,quantity3;
    double total,discount=0;
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter a quantity1 and rate1:");
    quantity1=sc.nextInt();
    rate1=sc.nextInt();

    System.out.println("Enter a quantity2 and rate2:");
    quantity2=sc.nextInt();
    rate2=sc.nextInt();

    System.out.println("Enter a quantity3 and rate3:");
    quantity3=sc.nextInt();
    rate3=sc.nextInt();
   
    total=(quantity1 * rate1) + (quantity2 * rate2) + (quantity3 * rate3);

    if(total > 5000){
       discount=total * 0.20;
    }

    else if(total >=3000){
    discount=total * 0.15;
    }

    else if(total >=1000){
    discount=total * 0.08;
    }
    System.out.println("Total sales Amount:" + total);
    System.out.println("Discount:" + discount);
    System.out.println("Amount to pay:" + (total-discount));
   }
}

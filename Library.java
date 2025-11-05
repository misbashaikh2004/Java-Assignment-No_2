//18. A library charges a fine for every book returned late. Accept the number of days the member is late, compute and print the fine as //follows:(less than five days Rs fine, for 6 to 10 days Rs. Fine and above 10 days Rs. fine )

import java.util.Scanner;
   public class Library{
        public static void main(String[] args){

        int days , fine =0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of late days:");
        days = sc.nextInt();

        if(days < 5){
        fine=days*1;
        }

        else if(days<=10){
        fine=days*2;
        }

        else{
        fine=days*5;
        } 

         System.out.println("Total fine:"+fine);
       }
  }
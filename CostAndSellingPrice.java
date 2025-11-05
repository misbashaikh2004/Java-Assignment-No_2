//4. Accept the cost price and selling price from the keyboard. Find out if the seller has made a profit or loss and display how much profit or //loss has been made?


import java.util.Scanner;
   public class CostAndSellingPrice{
      public static void main(String[] args){
  
      Scanner sc=new Scanner(System.in);
        
      System.out.println("Enter Cost Price:");
      double cp=sc.nextDouble();

      System.out.println("Enter Selling Price:");
      double sp=sc.nextDouble();

      if(sp > cp){
        double profit= sp- cp;
        System.out.println("Profit is"+profit);
      }
        
      else if(cp < sp){
         double loss=cp-sp;
         System.out.println("Loss is"+loss);
      }

      else{
          System.out.println("NO PROFIT NO LOSS");
      }
   }
}
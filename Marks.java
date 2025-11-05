//16. Write a program to accept marks for three subjects and find the total marks secured , average and also display the class obtained. (Class I – above %, //class II – % to %, pass class – % to % and fail otherwise) 


import java.util.Scanner;
  public class Marks{
     public static void main(String[] args){

     int marks1,marks2,marks3,total;
     float avg;
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter 3 Subject marks:");
     marks1=sc.nextInt();
     marks2=sc.nextInt();
     marks3=sc.nextInt();

     total = marks1 + marks2 + marks3;
     avg = total/3;
   
     System.out.println("Total Marks is :"+total);
     System.out.println("Average of :"+avg);

     if(avg >= 70){
       System.out.println("The First Class");
     }
   
     else if(avg >=50){
       System.out.println("Second Class");
    }
   
     else if(avg >=30){
        System.out.println("Third Class");
    }
     else{
        System.out.println("FAIL");
     }
   }
} 
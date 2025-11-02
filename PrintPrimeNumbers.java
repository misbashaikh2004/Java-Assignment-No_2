import java.util.Scanner;
public class PrintPrimeNumbers{
   public static void main(String[] args){
     
    int n,i,j;
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter A Number:");
    n=sc.nextInt();

        for(i=2;i<=n;i++){
        int cnt=0;
        for(j=2;j<=i/2;j++){
          if(i % j== 0){
        cnt++;
        break;
    }
}
    if(cnt == 0){
    System.out.print(i+" ");
     }
} 
   }
}
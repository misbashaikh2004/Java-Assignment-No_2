import java.util.Scanner;
public class SquaresOfNumbers{
    public static void main(String[] args){

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        n = sc.nextInt();

        System.out.println("Number   Square");
        for(int i=1; i<=n; i++){
            System.out.println(i + "   =   " + (i*i));
        }
    }
}

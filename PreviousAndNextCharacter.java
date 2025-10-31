import java.util.Scanner;

public class PreviousAndNextCharacter{
   public static void main(String[] args){
  
   char ch;
   Scanner sc=new Scanner(System.in);
     
    System.out.println("Enter Character:");
    ch=sc.next().charAt(0);

    System.out.println("Previous character is :"+(char)(ch - 1));;
 
    System.out.println("Next character is :"+(char)(ch + 1));;

  }
}

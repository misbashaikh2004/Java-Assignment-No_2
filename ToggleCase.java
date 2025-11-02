import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Character: ");
        char ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);     // uppercase to lowercase
            System.out.println("Lowercase: " + ch);
        }
        else if(ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);     // lowercase to uppercase
            System.out.println("Uppercase: " + ch);
        }
        else {
            System.out.println("Not an Alphabet!");
        }
    }
}

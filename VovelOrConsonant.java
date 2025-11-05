//8. Accept a lowercase character from the user and check whether the character is a vowel or consonant. (Hint: a,e,i,o,u are vowels)

import java.util.Scanner;
public class VovelOrConsonant{
  public static void main(String[] args){
   
  char ch;
 
  System.out.println("Enter Any Character"); 
  Scanner sc=new Scanner(System.in);

  ch=sc.next().charAt(0);

  if(ch=='a' || ch=='e' || ch=='i' || ch=='e' || ch=='u'){
     System.out.println("Character is Vovel");
   }
  else{
     System.out.println("Character Is Consonant");
  }
 }
}
  
  
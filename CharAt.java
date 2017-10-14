
package charat;
import java.util.Scanner;
public class CharAt {

   /*public static char charAtSpecificType(int index,String yourName){
      return yourName.charAt(index);
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String myName = sc.nextLine();
//        System.out.println("Your name length is : "+ myName.length());
        char firstName = myName.charAt(5);
//        System.out.println("My fist name is = "+ firstName);
        int length = myName.length();
        char lastChar = myName.charAt(length-1);
        System.out.println("My first char is = "+firstName );
        System.out.println("My last name is = "+ lastChar);
        System.out.println(myName.charAt(length-3));
        System.out.println(myName.substring(length-3, length-1));
                
               
        
        
        /*int me = myName.length();
        System.out.println();
        
        char yourChar = charAtSpecificType(4,myName);
        System.out.println("Your char at 4th position is : "+ yourChar);*/
    }
    
}

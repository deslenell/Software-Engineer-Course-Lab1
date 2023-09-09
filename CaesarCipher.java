import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter your offset digit!");
        int offset = Integer.parseInt(myObj.nextLine());
        //Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter your message in lower case!");
        String message = myObj.nextLine();  // Read user input
        cipher(offset, message);
       
        
    }
    
    public static void  cipher(int offset, String message){
        
        char[] letterArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (char c: message.toCharArray()){ // converting the string message to a character
            for( char i : letterArray){ // looping the alphabet
                if(c == i){
                    int index = c - 'a';
                    int hint = ( index +  offset ) % 26;
                    System.out.println(letterArray[hint]);
                }
            }
        }
    }

}   
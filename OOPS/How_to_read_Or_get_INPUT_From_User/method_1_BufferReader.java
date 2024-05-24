/* 

How to read or get input from user in java ?
    
        THERE ARE MANY WAYS TO READ INPUT FROM USER IN JAVA

        HERE I  EXPLAIN WITH BUFFERED READER

        What is BufferedReader?
            BufferedReader is a Java class to reads the text from an Input stream (like a file) by buffering characters that seamlessly reads characters, arrays, or lines.
            It makes the performance fast. It inherits Reader class.
        

        Example:
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in); // why in is passed as argument because BufferedReader class constructor takes Reader object as argument and InputStreamReader is a subclass of Reader class


        br.readLine() // this method reads the input from the user and returns the string
        br.read() // this method reads the input from the user and returns the ASCII value of the character

        br.close() // this method closes the BufferedReader object  =========> Good to practice to close the BufferedReader object after reading the input from the user



*/


package How_to_read_Or_get_INPUT_From_User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class method_1_BufferReader {

    public static void main(String[] args) throws IOException {  // IOException is thrown by the readLine() method but good practice not to handle any exceptions in main method , Here it is 0okay for basic understanding

        InputStreamReader in = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(in);

        System.out.println("Enter your number: ");

        int num = Integer.parseInt(br.readLine()); // readLine() method reads the input from the user and returns the string parseInt() method converts the string to integer
        System.out.println("You entered: " + num);
        
        br.close(); // closing the BufferedReader object

    }

    
}

/* 

How to read or get input from user in java ?
    
        THERE ARE MANY WAYS TO READ INPUT FROM USER IN JAVA

        HERE I  EXPLAINED WITH BUFFERED READER

        What is BufferedReader?
            BufferedReader is a Java class to reads the text from an Input stream (like a file) by buffering characters that seamlessly reads characters, arrays, or lines.
            It makes the performance fast. It inherits Reader class.
        

        Example:
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in); // why in is passed as argument because BufferedReader class constructor takes Reader object as argument and InputStreamReader is a subclass of Reader class


            br.readLine() // this method reads the input from the user and returns the string
            br.read() // this method reads the input from the user and returns the ASCII value of the character

            br.close() // this method closes the BufferedReader object  =========> Good to practice to close the BufferedReader object after reading the input from the user




    BufferedReader vs Scanner : 

        - BufferedReader is used to read text from a character-based input stream. It can be used to read data line by line by readLine() method. It makes the performance fast.
        - Scanner class in Java is found in the java.util package. It is used for scanning the input from the user. It has methods like nextInt(), nextFloat(), nextDouble() etc. 
          It is used to read the input of primitive data types like int, double, long, short, float, and byte.
        
        - BufferedReader is used to read the input character by character. It is used to read the input from the user as a string.
        - Scanner is used to read the input from the user as a string, int, float, double, and long.


    Which is better BufferedReader or Scanner?
        - BufferedReader is faster than Scanner because Scanner does parsing of input data and BufferedReader simply reads sequence of characters.
        - BufferedReader is synchronous while Scanner is not.
        - BufferedReader is good for reading streams of characters. Scanner is good for parsing text data.
        - BufferedReader is used to read the input character by character. It is used to read the input from the user as a string.
        - Scanner is used to read the input from the user as a string, int, float, double, and long.

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

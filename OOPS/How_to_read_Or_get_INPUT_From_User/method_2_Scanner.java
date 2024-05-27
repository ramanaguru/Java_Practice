/* 
 
    Scanner ?
        - Scanner class is a part of java.util package.
        - It is used to read the input available from an InputStream object.
        - It is used to read the input available from the user.

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

import java.util.Scanner;

public class method_2_Scanner {

    public static void main(String[] args) {

        System.out.println("Enter your number: ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // nextInt() method reads the input from the user and returns the integer
        System.out.println(num + " is your number");


        sc.close(); // closing the Scanner object is not mandatory but good practice to close the Scanner object after reading the input from the user
    }
    
}
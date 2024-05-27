/*
 
    Finally ? 

    - finally block is used to execute important code such as closing connection, stream etc.
    - finally block is always executed whether exception is handled or not.
    - finally block is executed after try and catch block.
    - finally block is used to close the resources (Or) Connection.

    Syntax :

        try{
            code that may raise exception
        }
        catch(Exception e){
            code to handle exception
        }
        finally{
            code that will always execute
        }
        
        (OR) if you are not handling the exception then you can use finally block to  close manually  the connection.

        try{
            code that may raise exception
        }
        finally{
            code that will always execute
            for ex : buffereader.close();
        }


        (OR) if you are trying to close a connection , resource etc. then you can use finally block to close the connection.

        try(){
            code that may raise exception
            code to close the connection

        }

        try() ===>  this will try which is extends from Closeable interface and it will close the connection automatically.


*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class finallyDemo {
    public static void main(String[] args) throws NumberFormatException, IOException, customExceptions {
        //First understand this code (this is working code and uncomment and run this code and also we are close the resource/connection manually)
        // int num = 0;

        // try{
        //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //     num = Integer.parseInt(br.readLine()); 
               

        //     if(num <= 402){
        //         throw new customExceptions("Number is lessThan or Equalsto  402");
        //     }
        //     if(num != 402){
        //         System.out.println(num);
        //     }
        // }
        // finally{
        //     System.out.println("Finally block is executed");
        //     br.close(); 
        // }



        //Try with resources
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(br.readLine());

            if(num <= 402){
                throw new customExceptions("Number is lessThan or Equalsto  402");
            }

            if(num != 402){
                System.out.println(num);
            }

            System.out.println("Print HEY is executed"); // if num == 402  || num < 402 then this will not execute  and see we are not closing the connection manually because we are using try with resources which have Closeable interface and it will close the connection automatically.

        }
            
        
    }
}


class customExceptions extends Exception{
    public customExceptions(String message){
        super(message);
    }
}

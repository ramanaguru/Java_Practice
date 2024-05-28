/*
StringBuffer is a peer class of String that provides much of the functionality of strings. String represents fixed-length, 
immutable character sequences while StringBuffer represents growable and writable character sequences.

Default capacity of buffer is 16. When the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2) + 2.

StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.


Feature          | StringBuilder                                    | StringBuffer
 * -----------------|-----------------------------------------------|---------------------
 * Thread-Safety    | Not thread-safe                             | Thread-safe
 * Performance      | Faster (non-synchronized)                   | Slower (synchronized)
 * Mutability       | Mutable                                     | Mutable
 * Synchronization  | Not synchronized                            | Synchronized
 * Introduced in    | Java 5                                      | Java 1.0
 * Usage            | Preferred for single-threaded environments  | Preferred for multi-threaded environments
 * Methods          | Similar methods to StringBuffer             | Similar methods to StringBuilder
 * Efficiency       | More efficient in single-threaded scenarios | More overhead in single-threaded scenarios due to synchronization

*/


public class StringBufferExample {
    
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        System.out.println(sb.capacity()); // 16

        sb.append("Ramana");
        System.out.println(sb.length());//6

        System.out.println(sb.capacity()); // 16

        sb= new StringBuffer("Hello");
        System.out.println(sb.capacity()); // 21

        //sb.ensureCapacity(100); => 100 is the minimum capacity


        sb.deleteCharAt(1);
        System.out.println(sb); //Hllo

        sb.insert(1, "e"); 
        System.out.println(sb); // Hello


        sb.append(sb);
        System.out.println(sb); // HelloHello

        sb.reverse(); // olleHolleH


        //StringBuffer to String
        String str = sb.toString();
        System.out.println(str + " string added") ; // olleHolleH

        str.contentEquals(sb);
    }

}

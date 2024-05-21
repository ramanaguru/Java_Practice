/*

StringBuilder is a class in java that is used to create mutable (modifiable) string.
it is same as StringBuffer except it is not synchronized.
It is not thread safe. It is fast.

StringBuilder sb = new StringBuilder();
sout.println(sb.capacity()); // 16

16 is the default capacity of StringBuilder.



When the number of characters in the StringBuilder exceeds its current capacity, the capacity is increased using the following formula:
new capacity = (oldcapacity * 2) + 2


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



public class StringBuilderExample {
    
}

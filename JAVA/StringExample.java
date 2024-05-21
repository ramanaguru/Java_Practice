/*
    What is String ?
    - String is a sequence of characters.
    - String is a class in java.

    String is Immutable ?   Yes
    - Immutable means once we create a string object we can't modify that object.

    How to create a String object ?
    - By using new keyword

   Ex :  String s1 = new String("Hello");


*/




public class StringExample {
    public static void main(String[] args) {
        String name = "Ramana";
        System.out.println(name + " " + "Hello");



        System.out.println(name.length());  // 6
        System.out.println(name.charAt(1)); // a

        System.out.println(name.substring(2)); //mana
        System.out.println(name.concat(" Guru")); // Ramana Guru

        //Play with String you will get more methods.\
        //This all are immutable , it stores in String constant pool(HEAPS)
        
        //What if we want to modify the string ? 
        //We can use StringBuffer or StringBuilder (Mutable)
    }
}


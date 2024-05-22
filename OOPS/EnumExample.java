/* 

    what is Enum?
        Enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
        Enums are used to give names to constants, which makes the code easier to read and maintain. 
        Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.


    
  Example:
        enum Level {
            LOW,
            MEDIUM,
            HIGH
        }


*/
enum Status{
    
    SUCCESS,
    FAILURE,
    PENDING,
    TRYAGAIN
}

public class EnumExample {

    public static void main(String[] args) {
        Status status = Status.TRYAGAIN;
        System.out.println(status);
        System.out.println(status.ordinal()); //It will return the index of the enum value , in java enum starts from 0

        //Let's iterate over all the values of the enum , lets write with enhanced for loop
        Status[] ss = Status.values(); // values() is a static method of Enum class which returns all the values of the enum

        for(Status s: ss){
            System.out.println(s.ordinal() + " : " + s);
        }

    }
    
}

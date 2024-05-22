/* 

    Lambda expression is used to implement the functional interface , it is used to write the code in more readable and concise way.
    It is introduced in Java 8.

    Syntax:
        (argument) -> {body of the method}

    
    what is @FunctionalInterface?
        A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. 
        From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. 
        A functional interface can have any number of default methods. 
        Runnable, ActionListener, Callable, Comparator are some of the examples of functional interfaces.



*/

@FunctionalInterface
interface I{

    void shownumber(int num);
    
}



public class Lambda_expressionExample {
    public static void main(String[] args) {
       //  I i = new I(); THIS IS  NOT ALLOWED AS "I" is a functional interface , INTERFACE CAN'T BE INSTANTIATED 
    
       //This is Lambda expression , it is used to implement the functional interface  
       //we can write like this also : I i = (num) -> {System.out.println("Number is : " + num);};

       I i = (int num) -> { System.out.println("Number is ==> " + num);};
       
       i.shownumber(10);
       // OUTPUT : Number is ==> 10 
    }
     
}
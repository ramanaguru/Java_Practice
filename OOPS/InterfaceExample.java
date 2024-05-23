/*
      What is Interface?
        - Interface is a reference type in Java.
        - It is similar to class. It is a collection of abstract methods.
        - A class implements an interface, thereby inheriting the abstract methods of the interface.
        
        Why use Interface?
        - It is used to achieve total abstraction.
        - Since Java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance.
        - It is also used to achieve loose coupling.

        Points to remember:

        Ex: class A extends B implements C, D
        - A class can extend only one class but can implement multiple interfaces.

        keywords: interface, implements
        class      ->   class        ===> extends
        class      -> interface      ===> implements
        interface  -> interface      ===> extends


        - Interface is a blueprint of a class.
        - It has static constants and abstract methods.
        - constants are public, static, final by default. so we can't change the value.


        Interface vs Abstract class:
        - Interface can have only abstract methods. Abstract class can have abstract and non-abstract methods.
        - Interface can have only public static final variables. Abstract class can have final, non-final, static and non-static variables.
        - Interface can't have a constructor. Abstract class can have a constructor.
        - Interface can't have instance variables. Abstract class can have instance variables.
        - Interface can't have a method body. Abstract class can have a method body.
        - Multiple inheritance is possible in Interface. Multiple inheritance is not possible in Abstract class.


  In interview rememeber this point to Explain : 
      Let's say , You are travelling  and asking  direction to  reach  temple to  person   , he\she will give you direction to reach temple , like go left , right, take 2nd right , you will reach temple.
      they are giving you direction to reach temple.  but they wont travel/walk  with you , you have to do it by yourself.
      Same way , Interface is like giving direction to class , what to do , but it wont do it by itself. class has to do it by itself.


    ===> Generalising it and not specificing/specializing it.

    TYPES OF INTERFACES  : 
        *  Normal Interface :
                It have more than one method 

        *  Functional Interface  or it is also known "SAM" (Single Abstract Method)
                It have only one method 

        *  Marker Interface : 
                It is used to deliver type information at runtime to the JVM so that it can take some action based on the information received.
                It is used for Handling Exceptions

            =======> See Markerinterface_STUDENTexample.java file  in this same folder for detailed explaination with example < ======================

            It is  an empty interface which made on purpose
            ex: Cloneable, Serializable (This examples are in-build)

            public interface Cloneable{
                ===>    If you like to use this , in main method just  import java.lang.Cloneable;     <===
            }

            public interface Serializable{
                ===>    If you like to use this , in main method just  import java.lang.Serializable;     <===
            }


*/




public class InterfaceExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();

        Dog d = new Dog();
        d.eat();
        d.bark();
        d.sleep();

        Animal l = new Lion();
        l.eat();
        l.sleep();

        Animal t = new Tiger();
        t.eat();
        
        // Cast to Tiger to call run()
        if (t instanceof Tiger) {   // Check if t is instance of Tiger class or not ,   ==> instancesOf is a keyword in Java which is used to check whether the object is an instance of the specified type (class or subclass or interface).
          ((Tiger) t).run();
        }
    }
    
}

interface Animal{
    public void eat();
    public void sleep();
}

abstract class Cat implements Animal{

    public  abstract void bark();
    
    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

}

class Dog extends Cat{
    public void bark(){
        System.out.println("Animal is eating");
    }
   
}


class Lion implements Animal{
    public void eat(){
        System.out.println("Lion is eating");
    }

    public void sleep(){
        System.out.println("Lion is sleeping");
    }
}

class Tiger implements Animal{
    public void eat(){
        System.out.println("Tiger is eating");
    }

    public void sleep(){
        System.out.println("Tiger is sleeping");
    }

    public void run(){
      System.out.println("Tiger is running");
    }
}
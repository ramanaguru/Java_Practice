class Animal {
    public int publicAge = 5;         // Accessible from anywhere
    private int privateAge = 10;      // Accessible only within this class
    protected int protectedAge = 15;  // Accessible within the same package and subclasses
    int defaultAge = 20;              // Default access: Accessible within the same package
}

class Dog extends Animal {
    public void showAges() {
        // Accessing variables from the Animal class
        System.out.println("Public Age: " + publicAge);       // Accessible
        // System.out.println("Private Age: " + privateAge);  // Not accessible, would cause an error
        System.out.println("Protected Age: " + protectedAge); // Accessible
        System.out.println("Default Age: " + defaultAge);     // Accessible
    }
}

public class Access_Modifier {
    public static void main(String[] args) {
        //  Dog dogg1 = new Animal(); --->  cause error , because only parent class object can be assigned to child class reference
        Dog myDog = new Dog();
        myDog.showAges();

        // Accessing variables from the Animal class via the Dog object
        System.out.println("From main - Public Age: " + myDog.publicAge); // Accessible
        // System.out.println("From main - Private Age: " + myDog.privateAge); // Not accessible, would cause an error
        System.out.println("From main - Protected Age: " + myDog.protectedAge); // Accessible
        System.out.println("From main - Default Age: " + myDog.defaultAge); // Accessible
    }
}



/*
 

Output for above Code :

Public Age: 5
Protected Age: 15
Default Age: 20
From main - Public Age: 5
From main - Protected Age: 15
From main - Default Age: 20





Remember this table for Access Modifiers:

subclass means ChildClass Basically



Modifier  || Same Class || Same package subclass  || Same package non-subclass || Different Packages subclass || Different Packages non-subclass
===============================================================================================================================================
private  ||    Yes     ||          No            ||            No             ||            No                ||            No
===============================================================================================================================================
protected ||    Yes     ||          Yes           ||            Yes            ||            Yes              ||            No
===============================================================================================================================================
default  ||    Yes     ||          Yes           ||            Yes            ||            No               ||            No
===============================================================================================================================================
public   ||    Yes     ||          Yes           ||            Yes            ||            Yes              ||            Yes








*/
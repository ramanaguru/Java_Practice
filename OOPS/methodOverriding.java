class Abc {
    void display() {
        System.out.println("Hi From A :) ");
    }
}

class Xyz extends Abc {
    void display() {
        // super.display(); if  you like to have an output from the parent class method  output: Hi From A :) and then Hi From B :) will be printed

        System.out.println("Hi From B :) ");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Abc obj = new Xyz();  // Create an instance of class Xyz

       // Xyz obj1 = new Abc();  It will give an error because we can't assign a parent class object to a child class reference


        obj.display(); // This will invoke the display() method of class Xyz  Output: Hi From B :)

    }
}

 

/* 

    What is method overriding?
    2 major rules for method overriding:
    - Must have same name and same parameter in both classes(i.e. parent and child class)
    - Inheritance (IS_A Relationship) must be there



    Theory of Method Overriding: (Fancy Definition) Personally i will not recommend to remember this definition

    - Method overriding is a feature that allows a SubClass/Childclass to provide a specific implementation of a method that is already provided by its ParentClass/SuperClass/BaseClass.
    - name and parameter of the method are the same, and there is IS-A relationship between the classes, so there is method overriding



*/

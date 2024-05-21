/* 
 
    What is Polymorphism?
        Different Behaviour : for example we behave differently in front of our parents, friends, teachers, etc.

    - Polymorphism is the ability of a single function or method to operate on multiple data types.
    - Polymorphism is a feature of OOPs that allows us to perform a single action in different ways.    
    - Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.


    Types of Polymorphism:
     
    1. Compile Time Polymorphism
        - Compile time polymorphism is also known as static polymorphism.
        - Compile time polymorphism is achieved by method overloading
        - Method overloading is a type of polymorphism where the same method name is used multiple times but with different parameters.

    2. Run Time Polymorphism
        - Run time polymorphism is also known as dynamic polymorphism.
        - Run time polymorphism is achieved by method overriding.
        - Method overriding is a type of polymorphism where a subclass has the same method with the same name and exactly the same number and type of parameters as a superclass.
        - Method overriding is used to provide the specific implementation of the method that is already provided by its superclass.

    Method Overloading: (Compile Time Polymorphism)

        add(int a , int b){ }


        add(int a , int b, int c){ }



    Method Overriding: (Run Time Polymorphism) 
    
            class A{
                void show(){
                    System.out.println("A");
                }
            }
    
            class B extends A{
                void show(){
                    System.out.println("B");
                }
            }

*/





//Below is the example of DYNAMIC METHOD DISPATCH  , we should have inheritence and method overriding to achieve this (Run time polymorphism)


public class Polymorphism{
    public static void main(String[] args) {
        AAA obj = new AAA();
        obj.shows(); // From A

        obj = new BBB();
        obj.shows(); // From B
        
        
        obj = new CCC();
        obj.shows(); // From C

        // obj = new DDD(); this will throw error because DDD is not a child class of AAA

        //we came to know that which method will be called at runtime only Irrespect of the reference type(ex : A obj) , it will call the method of the object type (ex :  new B() ) so print "From B"
    }
}



class AAA{
    void shows(){
        System.out.println("From A");
    }
}

class BBB extends AAA{
    void shows(){
        System.out.println( "From B");
    }
}

class CCC extends AAA{
    void shows(){
        System.out.println("From C");
    }
}

class DDD{
    void shows(){
        System.out.println("From D");
    }
}
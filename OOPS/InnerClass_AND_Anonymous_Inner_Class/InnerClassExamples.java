/*

Inner class is a class that is nested within another class. 
Inner classes are used to develop more readable and maintainable code because they logically group classes and interfaces in one place only.


Non -static Inner class method Example

public class InnerClassExamples{
    public static void main(String[] args) {

        AAAA a = new AAAA();
        
        AAAA.BBBB obj = a.new BBBB(); // syntax : OuterClass.InnerClass obj = OuterClassObject.new InnerClassObject
               
        obj.showss(); //  OUTPUT : From BBBB : Showed method
     
    }
    
}


class AAAA{

    public void showed(){
        System.out.println(" From AAAA : Showed method");
    }

    public class BBBB{
        public void showss(){
            System.out.println(" From BBBB : Show method");
        }
    }

}


Points to remember in non-static inner class:
- Non-static inner class can access both static and non-static members of outer class.
- Non-static inner class cannot have static members.



Points to remember in static inner class:
- Static inner class can access only static members of outer class.
- Static inner class cannot access non-static (instance) members of outer class.



*/


//This is Static Inner class method Example
public class InnerClassExamples{
    public static void main(String[] args) {

         // Create an instance of the static inner class BBBB
        AAAA.BBBB obj =  new AAAA.BBBB();   
               
        obj.showss(); // From BBBB : Showed method
        


        //What if you like to get output "From AAAA : Showed method" ? see the class B-> shown method 
        AAAA a = new AAAA();
        obj.shown(a);   // From AAAA : Showed method
         
    }
    
}


class AAAA{

    public void showed(){
        System.out.println(" From AAAA : Showed method");
    }

    public static void shows1(){
        System.out.println(" From AAAA : Shows1 method");
    }

    static class BBBB{
        public void showss(){
            System.out.println(" From BBBB : Show method");
            AAAA.shows1();
        }

        public void shown(AAAA a){
            // AAAA a = new AAAA(); you can pass the object of AAAA class to access the method showed(AAAA a)
            a.showed();
        }
    }

}

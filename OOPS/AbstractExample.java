/*
    what is abstract ? 
        ==> Existing as an idea , but not having a physical or concrete existence.(only concepts) 
        
        - Abstract is a non-access modifier in java applicable for classes, methods but not for variables.
        - Abstract classes can have abstract methods and non-abstract methods.
        - Abstract methods are those methods which are declared in the abstract class but not defined.
        - Abstract methods are defined in the subclass.
        - Abstract classes can't be instantiated but can be inherited.
        - Abstract methods can't be private.
        - Abstract methods can't be final.
        - Abstract methods can't be static.
        - Abstract methods can't be synchronized.
        - Abstract class can have constructor and static methods.

           
        Abstract class ?   ==>  A class which is abstract is called abstract class. 

        Abstract method ?  ==>  A method which is declared in the abstract class but not defined is called abstract method.

    
        Concrete class ?   ==>  A class which is not abstract is called concrete class. 
            
            - Concrete class is a class which has implemented all the abstract methods of its parent class or abstract class.
            - Concrete class can be instantiated.
            - Concrete class can have all types of methods like static, non-static, final, non-final, synchronized, non-synchronized etc.

        Abstract class vs Concrete class ?
        


        | Feature                                      | Abstract Class                                 | Concrete Class                                  |
        |----------------------------------------------|------------------------------------------------|-------------------------------------------------|
        | Can have abstract methods                    | Yes                                             | No                                              |
        | Can have non-abstract methods                | Yes                                             | Yes                                             |
        | Can be instantiated                          | No                                              | Yes                                             |
        | Can be inherited                             | Yes                                             | Yes                                             |
        | Can have constructor                         | Yes                                             | Yes                                             |
        | Can have static methods                      | Yes                                             | Yes                                             |
        | Must implement all abstract methods          | N/A                                             | Yes                                             |
        | Can have all types of methods                | Yes                                             | Yes                                             |
        | Example Java keyword (`abstract` / `class`)  | `abstract class`                                |`class`                                         |


  

*/


abstract class Cars{
    public abstract void start();
    public abstract void fly();

    public void stop(){
        System.out.println("Car is stopping"); 
    }
}

abstract class Benz extends Cars{

    public void start(){
        System.out.println("Car is starting");  
    }
    public void fly(){
        System.out.println("Car is flying");
    }
    public void music(){
        System.out.println("Music is playing");
    }

    public abstract int speeddisplay();
}
 
class updatedBenz extends Benz{    // this is updatedBenz is Concrete class
    public int speeddisplay(){
        return 150;
    }
    public void radioOn(){
        System.out.println("Radio is on");
    
    }
}


public class AbstractExample {

    public static void main(String[] args) {

        Benz objCar = new updatedBenz();
        objCar.start();     // Car is starting
        objCar.stop();      // Car is stopping
        objCar.music();     // Music is playing
        objCar.fly();       // Car is flying
        System.out.println(objCar.speeddisplay() + " km/hr"); // 150

        //objCar.radioOn(); => This will give error as radioOn is not present in Benz class  because  (Line 87)  we have benz type reference  which limits to use ->  Benz objCar = new updatedBenz(); to coorect this  updatedBenz objCar = new updatedBenz() now we can use raio()

    }
    
}

/* 

What is Encapsulation?

    Encapsulation is binding the data with the methods , not allowing the data to be accessed from outside the world.
    Encapsulation is a technique used to protect the data from the outside world.
    Encapsulation is a technique used to protect the data in a class by making the variables private and providing public getter and setter methods to access and update the values.


    this Keywords ==> this keyword is used to refer to the current object in a method or constructor. (always points the local variable)
    Getter and Setter Methods ==> Getter and Setter methods are used to get and set the values of private variables.



*/
class Human {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Human obj = new Human();

        obj.setName("Ramana");
        obj.setAge(25);

        System.out.println(obj.getName() + " : " + obj.getAge() ) ;
        
    }
    
}



/* =============================================================================================


In case  you like to use static

class Human {
    private static String name;    <================= static
    private int age;
 
    public static void setName(String name){ <================= static 
        Human.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Human obj = new Human();

        Human.setName("Ramana");
        obj.setAge(25);

        System.out.println(obj.getName() + " : " + obj.getAge() ) ;
        
    }
    
}



*/
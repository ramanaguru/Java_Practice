/* 
    What is Constructor?
    - Constructor is a special type of method which is used to initialize the object.
    - Constructor has the same name as the class name.
    - Constructor doesn't have a return type.
    - Constructor is called when we create an object of a class.
    - By default, Java provides a default constructor, even though we don't write it.
    - We can create multiple constructors in a class.
    - Constructor overloading is possible.
    - Constructor is used to allocate memory for the object.

    Types of Constructors:
    - Default Constructor       ==> No-Arg Constructor
    - Parameterized Constructor ==> With-Arg Constructor
    - Copy Constructor          ==> Constructor which takes the object of the same class as a parameter.
    - Constructor Overloading   ==> Multiple constructors in a class with different parameters.


    Examples code will taken from Encapsulation.java

*/
class Humandetails {
    private String name;
    private int age;

    //Default Constructor
    public Humandetails(){

    }

    //Parameterized Constructor
    public Humandetails(String n, int a){
        name = n;
        age = a; // age = 50  result will be 50 not 25
    }

    //Copy Constructor
    public Humandetails(Humandetails obj){
        name = obj.name;
        age = obj.age;
    }

    // Constructor Overloading
    public Humandetails(String n){
        name = n;
        age = 45;
    }



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


public class Constructor_example {
    public static void main(String[] args) {
        Humandetails obj = new Humandetails(); 
        System.out.println(obj.getName() + " : " + obj.getAge());   // Default Constructor ==> return null :  0

        Humandetails obj1 = new Humandetails("Ramana", 25);
        System.out.println(obj1.getName() + " : " + obj1.getAge()); // Parameterized Constructor ==>  return Ramana : 25

        Humandetails obj2 = new Humandetails(obj1); 
        System.out.println(obj2.getName() + " : " + obj2.getAge()); // copy constructor  ==> return Ramana : 25

        Humandetails obj3 = new Humandetails("Rama");
        System.out.println(obj3.getName() + " : " + obj3.getAge()); // Constructor Overloading ==> return Rama : 45

    }
}

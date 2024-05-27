/*

Static ? 
- Static is a keyword in Java used to create variables and methods that belong to a class rather than to an instance of the class.

- Static variables are shared among all instances of a class. OR Common for all object of a class.

- Static methods are accessed using the class name and don't need an object to be created.

Static methods can accexss only by static variables
ex: 
      
        class A{
            static int a = 10;
            static void show(){
                System.out.println(a);
            }
        }
        


static block ?
- A static block is a block of code inside a Java class that will be executed when a class is first loaded into the JVM. (Class Loader)
class Loader loads the class for the first time, it will execute the static block. and then the objects is istantiated for the number of times.

How to use static block  syntax ?

static{
    sout("Static block");
}

*/



class Mobile{
    static String name;
    int price;
    String brand;

    public void show(){
        System.out.println(brand + " " + name + " "+ price);
    }

    public static void display(){
        System.out.println("Display method");
    }

}

public class staticExample {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.price = 1000;
        obj1.brand = "Apple";
        Mobile.name= "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.price = 800;
        obj2.brand = "Samsung";

        Mobile.name= "phone";

        obj1.show(); // Apple phone 1000 
        obj2.show(); // Samsung phone 800

        Mobile.display(); // Display method
        //obj1.display(); // This will give error as display is static method and can be accessed by class name only

    }
    
}

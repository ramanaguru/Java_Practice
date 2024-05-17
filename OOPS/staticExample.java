/*

Static ? 
- Static is a keyword in Java used to create variables and methods that belong to a class rather than

- Static variables are shared among all instances of a class. OR Common for all object of a class.

- Static methods are accessed using the class name and don't need an object to be created.



*/



class Mobile{
    static String name;
    int price;
    String brand;

    public void show(){
        System.out.println(brand + " " + name + " "+ price);
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


    }
    
}

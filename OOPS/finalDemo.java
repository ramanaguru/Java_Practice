/*
 
Let's  understand the final keyword in java : 

final keyword can be used with variables, methods, and classes


variabe example with final keyword : [Preventing / Stopping modification]

       public static void main(String[] args) {

        final int number = 10;
        
        // number = 20;  This will give error as number is final and can't be changed
        
        System.out.println(number); //10 clear
        
    }

 
method example with final keyword :  [Preventing / Stopping Inheritance]

    final class Cal{
        
        public void add(int a, int b){
            System.out.println(a+b);
        }
        public void print(){
            System.out.println("Printed from Cal class");
        }

    }

    class cal2 extends Cal{       this will give error as Cal class is final and can't be extended ===> Preventing inheritance

    }


class example with final keyword :  [Preventing / Stopping Overriding]

see below example : Line 70 to 75


*/


class Cal{
        
    public final void add(int a, int b){
        System.out.println(a + b  + " added");
    }

    public void print(){
        System.out.println("Printed from Cal class");
    }

    public Cal(){
        System.out.println("Constructor of Cal class");
    
    }
    
}

class cal2 extends Cal{  

    public void print(){
        System.out.println("Printed from cal2 class");
    }

    // public void add(int a, int b){
    //     System.out.println(a + b + 10);     // This will give error as add method is final and can't be overriden
    // }
    
    
}

public class finalDemo{

    public static void main(String[] args) {
        Cal obj = new cal2();
        obj.add(10, 20);
        obj.print();

        /*
        Output : 

            Constructor of Cal class
            30 added
            Printed from cal2 class
            
        */
    }

}




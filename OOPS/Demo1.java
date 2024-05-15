//In this file, you can learn how to call different methods in java


class car{
    public void start(){
        System.out.println("Car is starting");
    }

    public String alertbeep(int speed){
        if(speed > 80){
            return "Go Slow";
        }

        return "You are good to go";
    }
    public void stop(){
        System.out.println("Car is stopping");
    }
    
}



public class Demo1 {
    public static void main(String[] args) {
        //main is the starting point of the java

        car obj = new car(); // car is the class(Basically it is an blueprint or idea) && obj is the object (Behaviour) 

        obj.start(); // return car is starting
        obj.stop(); // return car is stopping

        String str = obj.alertbeep(100);// return  Go Slow

        // String str = obj.alertbeep(50); // return You are good to go
        
        System.out.println(str);

    }
}

class calculator{
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }`
}


public class class_Obj{
    public static void main(String[] args) {
        int num1= 5;
        int num2= 5;

        // System.out.println(num1+num2);
        
        calculator cal = new calculator(); // object of class calculator

        int result = cal.add(num1, num2);
        System.out.println(result);

    }
}
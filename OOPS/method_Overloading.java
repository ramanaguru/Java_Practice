//to understand method overloading see the class_Obj.java file because i am using the same example here


class calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}



public class method_Overloading {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;

        calculator cal = new calculator(); // Object of class calculator

        int result = cal.add(num1, num2);
        int result2 = cal.add(10, 20, 30);
        double result3 = cal.add(10.0, 20, 30);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}

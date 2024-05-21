package Inheritance;



class BaseCalc {
    public int add(int n1 , int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
}


public class Calculator{

    public static void main(String[] args) {

        BaseCalc obj = new BaseCalc();
        double r = obj.add(1, 4);

        System.out.println(r);


        AdvCalc object = new AdvCalc();

        int r1 = object.add(5, 5);
        int r2 = object.sub(6,5);
        int r3 = object.mul(5, 5);
        int r4 = object.div(10, 5);

        System.out.println(r1 + "\n" + r2 + "\n" + r3 + "\n" + r4);
        
    }
    
}


/* 
    
    what is Inheritence ?    
        -Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.
        -JAVA SUPPORTS SINGLE INHERITENCE ONLY.
        -Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

        Let me explain you with an example:
            In 2008 , My dad have an cellphone nokia 1100 , which is very popular at that time.
            In order to contact my schoolfriends , I asked my dad to give me his cellphone.
            this is inheritence, basically nepotism in coding world.
            ===> whatever my parents have and whatever I have , that is inheritence.
            
            THERE ARE 2 TYPES OF INHERITENCE : 
            1. SINGLE INHERITENCE (ABOVE EXAMPLE)
            2. MULTIPLE INHERITENCE




            MULTIPLE INHERITENCE : 
                In multiple inheritance, one class can have more than one parent class. 
                For example, class C extends class A and class B. 
                This is not supported in Java because it leads to the Diamond Problem. 
                The Diamond Problem is a problem of multiple inheritance. 
                If class B and class

                In Java, a class cannot extend more than one class.
                IN CASE YOU DIDN'T UNDERSTAND ABOVE EXPLAINATION  SEE BELOW EXAMPLE:


                - my dad and my mom both have a cellphone , and I asked them to give me their cellphone to call my friend
                - Now I have 2 cellphones , which one should I use to call my friend ?
                - This is the problem of multiple inheritence , which is not supported in java.

        -this above example is called diamond problem in multiple inheritence.(REMOVAL OF AMBIGUIT --> Don't worry about this term , it is just a fancy term   of removing dont know which parent phone  to choose)


           



*/

/*

Abstract class:
    
==> Existing as an idea , but not having a physical or concrete existence.(only concepts) 
==> can use abstract class only by  inheriting it , not by creating object of it



*/
public class Abstract_Anonymous_InnerClass {
    public static void main(String[] args) { 

        // Firstlove subject = new Firstlove(); This is the error , we cant create the object of abstract class  Then how to use it ?

        Firstlove subject = new Firstlove() {
            public void love(){
                System.out.println("Love you but Hate you ");
            }
        };

        subject.love();
    }
    
}


abstract class Firstlove{
    public void love(){};
}

/* 
below code, we are using see the main method 

    class Secondlove extends Firstlove{
        public void love(){
            System.out.println("Love you but Hate you");
        }
    }
*/
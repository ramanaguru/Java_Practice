/* 
 
    AnonymousInnerClass is a class that is declared and instantiated at the same time.
    It is also known as anonymous class.
    It is used to override the method of a class or an interface.
    It is defined and instantiated in a single statement.

     ==> To avoid creating a new class for a small task, we use anonymous inner class.\


     love is method , which basically you give to all your loved one/ones
     in this case , i took your lovers 
    in case you love the world, whole world for example , it wont work  {only possible smaller task i.e girlfriend/boyfriend case but not for whole world }



*/


public class AnonymousInnerClassExample {
    public static void main(String[] args) {

        exone subject = new exone(){
            public void love(){
                System.out.println("Love you but Hate yous");
            }
        };

        subject.love(); 
    }

}

class exone{
    public void love(){
        System.out.println(" EX  : Love you but Hate you");
    }
}


// class extwo extends exone{
       //  to avoid this see the obj declaration in main method
// }

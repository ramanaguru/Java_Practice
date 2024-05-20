
//Understanding - 1 :  What is super() ?  Super is a keyword in Java which is used to call parent class constructor


// class A {
//     public A(){
//         System.out.println("From A"); 
//     }

    
// }
// class B extends A{
//     public B(){
//         System.out.println("From B");
//     }

//     public B(int n){
        
//         System.out.println("From B int");
//     }

// }


// public class thisANDsuper {
//         public static void main(String[] args) {
//             B obj = new B(5);
//         }
// }

/*
 
    Super()  => used to call parent class



  **  Code  ** 


class A {
    public A(){
        System.out.println("From A"); 
    }

    
}
class B extends A{
    public B(){
        System.out.println("From B");
    }

    public B(int n){
        
        System.out.println("From B int");
    }

}


public class thisANDsuper {
        public static void main(String[] args) {
            B obj = new B(5);
        }
}


Output : 

From A
From B int

Why From A ? so confused right , I (Ramana) is here for you  , let me make it simple

first see the code flow :

* B(5)   => it is parameterised constructor , so it will execute B(int)
* from here 
    public B(5){
            super()   ================================> This is will execute From A , let me explain you for every constructor underneath super() will be present which is like in-built (John cena (you can't see me)LOL !!!)

            System.out.println("From B int");
    }


* from super()  it will be execute A

    public A(){
            System.out.println("From A"); 
    }




    So this is the reason "From A" it is printed FIRST then "From B int" SECOND

*/


//Understanding - 2 : what is this()? ===> used to call the current class not the parent {Here I like to execute "FROM A  " , "FROM A int ", "FROM B int"}


class A {
    public A(){
        System.out.println("From A"); 
    }
    public A(int n){
        this();
        System.out.println("From A int");
    }

    
}
class B extends A{
    public B(){
        System.out.println("From B");
    }

    public B(int n){
        super(n);
        System.out.println("From B int");
    }

}


public class thisANDsuper {
        public static void main(String[] args) {
            B obj = new B(5);
        }
}



/*
 
    this()  => used to call current class constructor



  **  Code  ** 

class A {
    public A(){
        System.out.println("From A"); 
    }
    public A(int n){
        this();
        System.out.println("From A int");
    }

    
}
class B extends A{
    public B(){
        System.out.println("From B");
    }

    public B(int n){
        super(n);
        System.out.println("From B int");
    }

}


public class thisANDsuper {
        public static void main(String[] args) {
            B obj = new B(5);
        }
}


Output : 

From A
From A int
From B int

Why From A  , From A int  , From B int? so confused right , I (Ramana) is here for you  , let me make it simple

first see the code flow :
 
* B(5)   => it is parameterised constructor , so it will execute B(int)  ---> Step 1.0 

* calling of step 1.0 execution

public B(5){
    super(n) --->  passing the paramter so it will execute A(int) constructor --->  Step 1.1
    sout(From B int) 

*calling of step 1.1 execution

 public A(5){
    this(); ---> here it will call current class default constructor i.e: A()  -----> Step 1.2          <<<<-----------------this() used
    sout("From A int") 
  }

* calling of step 1.2 execution
    public A(){
        sout(From A)
    }

Output : 

Form A 
From A int 
From B int


*/

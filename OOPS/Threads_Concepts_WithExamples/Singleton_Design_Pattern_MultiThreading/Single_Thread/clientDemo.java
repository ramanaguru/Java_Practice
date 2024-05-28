package Threads_Concepts_WithExamples.Singleton_Design_Pattern_MultiThreading.Single_Thread;

public class clientDemo {
    public static void main(String[] args) {
        /*  If you like to use Step -1 :  see in TvSet.java     ===> This is not optimised

            TvSet tv1 = new TvSet();
            TvSet tv2 = new TvSet();


            System.out.println(tv1);
            System.out.println(tv2);
        */


        TvSet tvSetMember1 = TvSet.getTvInstance();
        TvSet tvSetMember2 = TvSet.getTvInstance();

        System.out.println(tvSetMember1);
        System.out.println(tvSetMember2);
    }
    
}
 
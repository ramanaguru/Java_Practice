package Threads_Concepts_WithExamples.Singleton_Design_Pattern_MultiThreading.Single_Thread;

public class TvSet{

    private static TvSet tvSetInstance = null;
    //boolean isCreated = false;

    private TvSet(){
        System.out.println("TvSet Object Created");
    }

    public static TvSet getTvInstance(){
        /*

        Step - 1 : 
            if(isCreated){
                return tvSetInstance;
            }

            tvSetInstance = new TvSet();
            isCreated = true;

         */

        // Step - 2 : Optimized 

        if(tvSetInstance == null){
            tvSetInstance = new TvSet();
        }


        return tvSetInstance;
    }
    

}

/* 

    OUTPUT :  This is Step -1

            TvSet Object Created
            TvSet Object Created
            TvSet@234dfda9d
            TvSet@55242699f



  OUTPUT :  This is Step -2
    
            TvSet Object Created
            TvSet@7344699f
            TvSet@7344699f




*/
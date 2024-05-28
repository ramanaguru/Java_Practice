
public class TvDemo {

    private static TvDemo tvSetInstance = null;
   

    private TvDemo(){
        System.out.println("TvDemo Object Created");
    }

    public static TvDemo getTvSetInstance() {
        if (tvSetInstance == null) {
            tvSetInstance = new TvDemo();
        }
        return tvSetInstance;
    }
    
    
}

package MultiThreading;

public class singlethread {

    public static void main(String[] args) {
        personalthread thread = new personalthread("thread", 1, 50000);
        
        thread.start();

        long startTime = System.currentTimeMillis();

        try {
            thread.join();  
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        System.out.println(personalthread.getPrimes());
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("TotalTime: "+elapsedTime+" Milliseconds" );

    }
    
}

package MultiThreading;

public class doublethread {

    public static void main(String[] args) {
        personalthread thread1 = new personalthread("thread-1", 1, 25000);
        personalthread thread2 = new personalthread("thread-2", 25001, 50000);
        thread1.start();
        thread2.start();

        long startTime = System.currentTimeMillis();

        try {
            thread1.join();  
            thread2.join();  
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        System.out.println(personalthread.getPrimes());
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("TotalTime: "+elapsedTime+" Milliseconds" );

    }
    
}

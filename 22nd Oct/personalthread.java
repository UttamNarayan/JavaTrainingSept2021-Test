package MultiThreading;
import java.util.ArrayList;
public class personalthread extends Thread {

    private String threadName;
    private int st, ed;
    private static ArrayList<Integer> primes = new ArrayList<>();

    public personalthread(String threadName, int start, int end) {
        super(threadName);
        this.st = start;
        this.ed = end;
        this.threadName = threadName;
    }
    public static ArrayList<Integer> getPrimes() {
        return personalthread.primes;
    }
    public void run() {
        for (int i = this.st; i <= this.ed; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                this.primes.add(i);
            }
        }
    }
}
    


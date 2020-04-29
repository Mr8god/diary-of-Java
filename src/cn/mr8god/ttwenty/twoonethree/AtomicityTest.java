package cn.mr8god.ttwenty.twoonethree;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Mr8god
 * @date 2020/4/29
 * @time 14:44
 */
public class AtomicityTest implements Runnable {
    private int i = 0;
    public int getValue(){ return i;}
    private synchronized void evenIncrement(){ i++; i++;}

    @Override
    public void run() {
        while (true) {
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest at =  new AtomicityTest();
        exec.execute(at);
        while (true) {
            int val = at.getValue();
            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}

package cn.mr8god.kchaptereleven;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author Mr8god
 * @date 2020/4/26
 * @time 0:52
 */
public class QueueDemo {
    public static void printQ(Queue queue){
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++){
            queue.offer(rand.nextInt(i + 10));
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for (char c :
                "Brontosaurus".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}

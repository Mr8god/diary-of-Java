package cn.mr8god.dchapterfour;

import static net.mindview.util.Range.range;

/**
 * @author Mr8god
 * @date 2020/4/13
 * @time 13:05
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // Using foreach:
        for (int i :
                range(100)) {
            if (i == 74){
                break;
            }
            if (i % 9 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
        //An "infinite loop"
        while (true){
            i++;
            int j = i * 27;
            if (j == 1269){
                break;
            }
            if (i % 10 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

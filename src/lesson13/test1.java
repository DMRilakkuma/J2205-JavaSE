package lesson13;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 15:39
 * @Description:
 */

public class test1 {
    public static void main(String[] args) {
        // 创建一个计时器
        Timer timer = new Timer("小闹钟");

        // 创建一个任务
        TimerTask timerTask = new TimerTask() {

            // TimeTask是一个抽象类，要实列这个抽象类,要实例这个抽象1类就必须将抽象类中的抽象方法重写

            /**
             * The action to be performed by this timer task.
             */
            @Override
            public void run() {
                System.out.println("到点了,该导了");
            }
        };

        timer.schedule(timerTask, 5000, 3000);
    }
}
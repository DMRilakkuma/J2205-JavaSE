package lesson4.homework;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 17:16
 * @Description:
 */
public class exer5 {
    public static void main(String[] args) {
        //5、	有500个人围城一个圈，依次报数，每数到3的倍数的人离开圈，
        // 数完一圈后继续从1开始数，直到圈中剩下最后一个人，求剩下的人原来在圈中的位置(约瑟夫环问题)
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 500; i++) {
            list.add(i);
        }

        int index = -1;
        while (list.size() > 1) {

            index = (index + 3) % list.size();
            list.remove(index);
            index--;

        }
        System.out.println(list.get(0));
    }

}
package lesson4.homework;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 18:27
 * @Description:
 */
public class exer6 {
    public static void main(String[] args) {
        // 6、	定义一个元素个数为100的整型数组,使用随机数给它进行赋值,
        // 随机数的范围是20 – 25之间的整数。然后用户输入一个数，统计这个数在数组中出现的次数并计算它出现的概率
        int[] num = new int[100];
        for (int i = 0; i < 100; i++) {
            num[i] = (int) (Math.random() * (25-20+1) + 20) ;
        }
        System.out.println("请输入一个数:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] == n){
                count++;
            }
        }

        System.out.println(count);
    }
}
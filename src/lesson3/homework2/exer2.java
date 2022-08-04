package lesson3.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 18:48
 * @Description:
 */
public class exer2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            boolean isFlag = true;
            Loop1:
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有" + count + "个");
    }
}
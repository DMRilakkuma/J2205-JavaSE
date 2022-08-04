package Exam1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-01 15:44
 * @Description:
 */
public class chicken {
    public static void main(String[] args) {
        int cock = 5;
        int hen = 3;
        int chick = 1;
        int count = 100;
        int num = 0;
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 33; j++) {
                int sum = i * 5 + j * 3;
                if (sum <= 100) {
                    int numberOfChicks = (count - sum) * 3;
                    int total = i + j + numberOfChicks;
                    if (total == 100) {
                        System.out.println("公鸡" + i + " 母鸡" + j + " 小鸡" + numberOfChicks);
                        num++;
                    }
                }
            }
        }
        System.out.println(num);
    }
}
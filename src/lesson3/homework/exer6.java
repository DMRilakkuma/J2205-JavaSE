package lesson3.homework;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 16:49
 * @Description:
 */
public class exer6 {
    public static void main(String[] args) {
        /*6、编写代码实现如下内容：实现考试成绩分等级(分别使用if和switch)。
	[90-100]	A等。

	[80-90) 	B等。
	[70-80) 	C等。
	[60-70) 	D等。
	[0-60)  	E等。
	请根据给定成绩，输出对应的等级。
	说明："["表示包含，")"表示不包含
*/
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score < 60) {
            System.out.println("E");
        } else if (score < 70) {
            System.out.println("D");
        } else if (score < 80) {
            System.out.println("C");
        } else if (score < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }
    }
}
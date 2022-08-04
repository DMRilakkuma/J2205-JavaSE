package lesson3.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 19:20
 * @Description:
 */
public class exer14 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("*****");
        }


        System.out.println("*******************************");

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("********************************");

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

}
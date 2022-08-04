package lesson4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 16:09
 * @Description:
 */
public class test7 {
    public static void main(String[] args) {
        int[][] array2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(array2.length);

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j]);
            }
        }
    }
}
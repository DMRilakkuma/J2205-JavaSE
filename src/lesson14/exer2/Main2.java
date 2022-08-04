package lesson14.exer2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 19:02
 * @Description:
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        int[] array = {1, 3, 5, 4, 6, 8, 5, 8, 0, 1, 2, 3, 4, 5, 6, 7,};
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                throw new Exception("参数不能为0");
            }
        }

        System.out.println(total / array.length);
    }
}
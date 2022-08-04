package lesson10.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-06 18:22
 * @Description:
 */

public class main5 {
    public static void main(String[] args) {
        String s = "test";
        s = revers(1, 2, s);
        System.out.println(s);
    }

    public static String revers(int left, int right, String s) {
        char[] chars = s.toCharArray();
        while (left < right) {
            char c = chars[left];
            chars[left] = chars[right];
            chars[right] = c;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }
}
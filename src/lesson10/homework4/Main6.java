package lesson10.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-06 18:27
 * @Description:
 */

public class Main6 {
    public static void main(String[] args) {
        String s = "teet";
        System.out.println(palin(s));
    }

    public static boolean palin(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
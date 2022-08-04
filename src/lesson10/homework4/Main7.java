package lesson10.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-06 18:29
 * @Description:
 */

public class Main7 {
    public static void main(String[] args) {
        String s = "113@ere qqq yyui";
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (s.charAt(right) >= 'a' && s.charAt(right) <= 'z' || right == s.length() - 1) {
                if (right == s.length() - 1) {
                    s = revers(left, right, s);
                }
                right++;
            } else if (s.charAt(left) >= 'a' && s.charAt(left) <= 'z' ) {
                s = revers(left, right - 1, s);
                left = right;
            } else {
                if(left == right){
                    right++;
                }
                left++;
            }
        }
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
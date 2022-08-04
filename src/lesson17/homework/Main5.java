package lesson17.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-19 18:52
 * @Description:
 */

public class Main5 {
    public static void main(String[] args) {
        String s = "abcccbbbaaedddfff";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
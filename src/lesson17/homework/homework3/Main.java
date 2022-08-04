package lesson17.homework.homework3;

import java.util.*;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-19 18:29
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();
        list.add(new Account(10.00, "1234"));
        list.add(new Account(15.00, "5678"));
        list.add(new Account(0, "1010"));

        Map<Integer, Account> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put((int) list.get(i).getId(), list.get(i));
        }

        Set<Map.Entry<Integer, Account>> entries = map.entrySet();
        for (Map.Entry<Integer, Account> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
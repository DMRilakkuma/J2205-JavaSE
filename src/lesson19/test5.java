package lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 14:15
 * @Description:
 */

public class test5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("jackson");
        list.add("tompason");
        list.add("curry");
        list.add("colleson");
        list.add("wade");
        list.add("kobeson");
        list.add("kole");
        list.add("json");
        list.add("freeyson");
        list.add("drison");

        list.stream().
                filter(u -> u.endsWith("son")).
                skip(2).
                limit(5).
                collect(Collectors.toList()).
                stream().
                sorted().
                forEach(a -> System.out.println(a));

//        List<String> newlist = new ArrayList<String>();
//        for (String s : list) {
//            if (s.endsWith("son") && newlist.size() < 5) {
//                newlist.add(s);
//            }
//        }
//
//        Collections.sort(newlist);
//        for (String s : newlist) {
//            System.out.println(s);
//        }


    }
}
package lesson16;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-18 11:16
 * @Description:
 */

public class test2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i < 11; i++) {
            linkedList.add(i);
        }

        System.out.println(linkedList);
        linkedList.addFirst(0);
        linkedList.addLast(11);
        System.out.println(linkedList.pop()); // 其实就是removeFirst
        linkedList.push(2);

        // 这个地方的index不是下标索引，是当前linkedlist的循环,查找次数
//        System.out.println(linkedList.get(5));
        System.out.println(linkedList);
    }


    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        double start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        double end = System.currentTimeMillis();
        System.out.println(end - start);
        double start2 = System.currentTimeMillis();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 100000000; i++) {
            linkedList.add(i);
        }

        double end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }

    @Test
    public void test2() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(1);
        list.add(1);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        list.removeAll(list2);
        System.out.println(list);

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            iterator.remove();
//        }
//
//        System.out.println(list);

//        for (Object o : list) {
//            // 因为arrayList内的foreach其实就是重写了iterator迭代器的foreach方法
//            // 如果在迭代的时候，集合长度发生了改变,集合长度发生了改变,就会导致
//            // 集合源码中modcont（集合修改次数）与初始时设置的ecpectedmodcount（）异常
//            // 两个编码不一致,然后抛异常
////            list.add(2);
//        }
    }
}
package lesson6.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-29 16:33
 * @Description:
 */
public class MyArrayList {
    int capacity;
    int[] arrayList;
    int count;

    public MyArrayList() {
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        arrayList = new int[capacity];

    }

    // 添加元素
    public void add(int n) {
        arrayList[count++] = n;
        // 扩容
        if (count == arrayList.length) {
            int[] arr = arrayList;
            arrayList = new int[(int) (arrayList.length * 1.5)];
            for (int i = 0; i < arr.length; i++) {
                arrayList[i] = arr[i];
            }
        }
    }

    // 返回数组真实长度的方法
    public int size() {
        return count;
    }

    // 提供一个能够返回指定位置元素的方法
    public int get(int index) {
        return arrayList[index];
    }

    // 显示元素
    public void show() {
        for (int i = 0; i < count; i++) {
            System.out.println(arrayList[i]);
        }
    }



}
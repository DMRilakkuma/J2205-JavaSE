package lesson6.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 13:58
 * @Description:
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(10);
        // 添加
        list.add(10);
        list.add(20);
        list.add(30);
        // 显示真实元素
        list.show();
        //返会指定元素
        System.out.println(list.get(2));
        // 返回真实元数长度
        System.out.println(list.size());
    }

}
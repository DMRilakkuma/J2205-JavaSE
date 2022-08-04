package lesson4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 10:34
 * @Description:
 */
public class test1 {
    public static void main(String[] args) {
//        int[] array1;//该数组数据都是int类型
//        boolean[] array2;
//        char[] array3;//该数组中所有的数据都是char类型
//        String[] array4;

        //静态创建，初始化(在创建时就设置的一些信息和配置，出厂设置)
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 动态创建，动态初始化
        int[] array2 = new int[10];
        //往array2中添加数据
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        int a = array2[9];
        int[] array3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //数组的长度一旦定下来后，就不可以在进行修改
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
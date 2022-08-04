package lesson4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 11:06
 * @Description:
 */
public class test2 {
    public static void main(String[] args) {
        //求数值型数组中的最大值，最小值，平均值，总和
        int[] array1 = {1, 3, 54, 72, 7, 8, 2};

        //最大值
        int max = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println("最大值为:" + max);
        //最小值
        int min = array1[0]; //设置min的初始值为当前数组的第一位
        for (int i = 0; i < array1.length; i++) {
            if (min < array1[i]) {
                min = array1[i];
            }
        }

        //求数组中的平均数
        double total = 0;
        for (int i = 0; i < array1.length; i++) {
            //将当前数组中所有的数据累加到total中
            total = total + array1[i];
        }
        System.out.println("总和为:"+total);
        System.out.println("平均值是" + (total/array1.length));

    }
}
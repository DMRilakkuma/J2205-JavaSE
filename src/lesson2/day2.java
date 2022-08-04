package lesson2;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-23 08:52
 * @Description:
 */
public class day2 {
    //单行注释  注释的主要作用：对代码或者文档做的中文解释，提高代码的可读性
    /*
     * 多行注释
     * 对一段代码进行的文字解释，可以写很多行注释
     * */

    // mian方法:当前Java项目或者文件的主入口
    public static void main(String[] args) {
        //数字类型分为整数和小数

        //在Java中创建最小的单元：变量
        //变量的数据类型 变量名称 = 值

        byte b = 127; // 最小值-128，最大值 127;
        short s = 1;  // 0000 0000 0000 0001;
        int age = 2147483647;
        long l = 1111;

        //小数的数据类型：代码中叫做浮点型
        float f = 0.1f;
        double d = 0.2;
        System.out.println(f + d);

        //字符类型
        char name = '王';

        //字符串 :字符串不是Java的基础数据类型，是引用数据类型
        // 特点 : 是由双引号包裹起来，并且char是不可以直接转化为String
        //字符串其实是由多个char数组组成的
        String studentName = "王兵";

        //使用转义符在控制台打印一个超市的购物小票
        System.out.println("欢迎进入大漂亮超市"); // 这一行代码意思: 在idea控制台打印小括号里面的内容
        System.out.println("1:\t苹果\t15.01");
        System.out.print("\r");
        System.out.println("2:\t香蕉\t16");
        System.out.println("3:\t荔枝\t15");
        System.out.println("4:\t西瓜\t12");
        System.out.println("总价是:\b 58元");

        //当定义文件路径时，因为但斜杠在代码中表示转义符，但是在文件路径中、又表示路径
        //所以为了区分，就需要在路径的\上添加转义符为\\;
        String path = "d:\\test\\a.txt";

        // 布尔只有两种结果：true(真） false(假)
        boolean isFlag1 = true;
        boolean isFlag2 = false;

        //数据类型的转化
        byte b1 = 1;

        //在java中未定义的整数默认为int类型
        //当做加法运算时，结果范围取大范围
        int i2 = b1 + 1;

        //在转化数据类型之前，一定要保证，当前的数据是可以转化的
        //将byte 转化为int类型
        int i1 = b1;

        /*byte b2 = i1
         * 数字类型，只能从小往大的范围转换，不能从大往小的转
         * */
        String s1 = "123456";
        // 不管什么类型的基础数据转String都不能直接转换，因为string是引用数据类型也是一个"类”
        short s2 = 10;
        int s3 = s2 + 10;
        System.out.println(s2);

        int a1 = 1;
        int a2 = 2;
        System.out.println("+法运算:" + (a1 + a2));
        System.out.println("-法运算:" + (a1 - a2));
        System.out.println("*法运算:" + (a1 * a2));
        System.out.println("/法运算:" + (a1 / a2));
        System.out.println("%取余:" + (10 % 3)); // 10除以3，余数为1，所以10%3的结果是:1

        int f1 = 3;
        int f2 = f1++;  //在右边的意思，先运行后取值（先将f2赋值为3），再运行自加（再将f1自加1）
        System.out.println("此时f1是" + f1);
        System.out.println("此时f1是" + f2);

        int f3 = ++f1;// 在左边的意思，先自加后运行(先将f1自加，如何赋值给f3）
        System.out.println("此时的f3是" + f3);
        System.out.println("此时的f1是" + f1);

        //关系运算符会得到一个布尔值
        System.out.println(1 > 2);
        System.out.println(1 < 2);
        System.out.println(2 <= 2);
        System.out.println(3 >= 2);
        //注意：大于或者小于只能用于数学数字的关系判断
        // == 和 ！= 是不局限于数据类型
        System.out.println(3 == 2);
        System.out.println(3 != 2);

        System.out.println(1 == 2 && 1 < 2);
        System.out.println(1 == 2 || 1 < 2);

        //如何让byte类型数字8在最快的时间类变为4;
        int f5 = 8 >> 1;
        System.out.println("位运算结果为:" + f5);

        //三目运算符
        boolean result = 60 > 50 ? true : false;
        int core = 75;
        String res = core < 60 ? "E" :
                core < 70 ? "D" :
                        core < 80 ? "C" :
                                core < 90 ? "B" :
                                        core >= 90 ? "B" : "A";
        System.out.println("你的成绩是：" + res);


        //创建一个类，这个类是一个Java类
//        Scanner scanner = new Scanner(System.in);
//        //在scanner类是可以获取控制台中输入的内容
//        int a  = scanner.nextInt();
//        System.out.println("你输入的内容为"+a);
//        String b2 = scanner.next();
//        System.out.println("你输入的内容为:"+b2);


        System.out.println(Math.random());
        //Math.random() 获取的是一个double类型的数据
        //这个数据的特点是：会生成一个随机数，最小无限接近0到时不会等到0
        // 获取一个0-9的随机数
        int random1 = (int) (Math.random() * 10) + 1;
        System.out.println("你得到的数据是：" + random1);
        Math.round(Math.random());
        //获取一个1-50的随机数


    }


    @Test
    public void test() {
        //随机一个20000到30000之间的整数，输出这个整数对应的字符。
        int n = (int) (Math.random()) * (30000 - 20000) + 20000;
        System.out.println(n);

        // 随机一个200以内的偶数 和一个200以内的奇数，打印这两个数，再打印它们的和 及 差。
        int even = 1;
        int oddNumber = 2;
        while(even % 2 == 0){
            even = (int) Math.random()*200 +1;
        }
        while(oddNumber % 2 == 1){
            oddNumber = (int) Math.random()*200 +1;
        }
        System.out.println(even);
        System.out.println(oddNumber);
        System.out.println(even - oddNumber);
        System.out.println(even+oddNumber);

        // 随机一个5位数的整数，打印这个整数，再将这个5位数的个位与万位调换位置，十位与千位调换位置，打印出新的数。
        int nums =(int)(Math.random() * (99999-10000)) + 10000;
        String s = String.valueOf(nums);
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length-1;
        while(l < r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars [r] = temp;
            l++;
            r--;
        }
        s = String.valueOf(chars);
        int nums2 = Integer.valueOf(s);
        System.out.println(nums);
        System.out.println(nums2);
    }


}
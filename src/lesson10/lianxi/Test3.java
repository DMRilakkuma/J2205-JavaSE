package lesson10.lianxi;

import java.util.Scanner;

/**
 * @author 兰松柏
 * @version 1.0
 * @className Test3
 * @description TODO
 * @data 2022-07-06 18:42
 */
public class Test3 {

    public static void main(String[] args) {
        //分析以下需求，并用代码实现：
        //	(1)从键盘循环录入录入一个字符串,输入"end"表示结束
        //	(2)定义一个方法
        //		public Object[] deleteSubString(String str1,String str2) {
        //		}
        //	(3)方法功能描述:从str1中删除所有的str2,并返回删除后的结果,返回结果为Object[]数组
        //		* 该数组的第一个元素为删除所有的str2后的最终的字符串
        //		* 该数组的第二个元素为删除的str2的个数
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入一串字符串:");
            String str1=scanner.next();
            String str2=scanner.next();
            deleteSubString(str1,str2);
        }

    }

    public static Object[] deleteSubString(String str1,String str2) {
        StringBuffer buffer=new StringBuffer(str1);
        String res="";
        int left=0,right=0;
        int n1=str1.length();
        int n2=str2.length();

        //初始化第一窗口
        right=str2.length();
        res=buffer.substring(left,right);
        if(str2.equals(res)){
            buffer=buffer.delete(left,right);
        }
        //滑动窗口
        while (buffer.length()>=n2 && right<=buffer.length()){
//            if(str1.length()<n2){
//                break;
//            }else
            res=buffer.substring(left,right);
            if(str2.equals(res)){
                buffer=buffer.delete(left,right);
            }else{
                left++;
                right++;

            }
        }
        System.out.println(buffer);

        return new Object[10];

    }

}

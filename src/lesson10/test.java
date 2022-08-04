package lesson10;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-06 14:30
 * @Description:
 */

public class test {
    public static void main(String[] args) {
        // String 是一种不可改变长度的字符串
        // StringBuffer 是一种可以改变长度的字符串
        String string = new String();
        StringBuffer stringBuffer = new StringBuffer();
        // 显示当前初始化值
        System.out.println("开始:" + stringBuffer.hashCode());
        // append() 在StringBuffer后追加/附加内容
        stringBuffer.append("英语成绩是:90").append("语文成绩是:80").append("历史成绩是:95").insert(1, "数学成绩是50");
        // 显示添加内容后的hashcode
        System.out.println("结束：" + stringBuffer.hashCode());

        String s1 = "123";
        System.out.println(s1.hashCode());
        s1 = s1 + "456";
        System.out.println(s1.hashCode());

        char c = stringBuffer.charAt(2);
        // 字符串的逆序
        System.out.println(stringBuffer.reverse());
        System.out.println(String.valueOf(c));

    }

}
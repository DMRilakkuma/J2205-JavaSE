package lesson3.homework;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 16:05
 * @Description:
 */
public class exer2 {
    public static void main(String[] args) {
        //2、	随机两个0到100之间的整数，然后使用较大的一个数减去较小的一个数，再判断这个差的奇偶性。
        int x = (int) Math.round(Math.random() * 100);
        int y = (int) Math.round(Math.random() * 100);
        int num = Math.max(x, y) - Math.min(x, y);
        System.out.println(num);
        if(num % 2 ==1){
            System.out.println("该数字为奇数");
        }else{
            System.out.println("该数为偶数");
        }
    }
}
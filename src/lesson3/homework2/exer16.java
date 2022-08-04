package lesson3.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 19:44
 * @Description:
 */
public class exer16 {
    public static void main(String[] args) {
        //闰年多少天
        int yeardays1 = 366;
        //非闰年的天数
        int yeardays2 = 365;
        int total = 0;
        for (int i = 1900; i <= 2021; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                total+=yeardays1;
            }else{
                total+=yeardays2;
            }
        }
        total+= 3 * 31 + 28 + 30 + 27;
        System.out.println(total);
    }
}
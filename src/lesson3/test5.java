package lesson3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 10:48
 * @Description:
 */
public class test5 {
    public static void main(String[] args) {
        //使用for循环在控制台中使用*打印一个正方形
        for (int i = 1; i <= 9; i++) { //控制循环打印的行
            for (int j = 1; j <=i; j++) { // 控制循环打印的列
                System.out.print(j +"*"+i +" = " + i * j + " " );
            }
            System.out.println();
        }
    }
}
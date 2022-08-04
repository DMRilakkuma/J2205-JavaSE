package lesson3.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 19:01
 * @Description:
 */
public class exer7 {
    public static void main(String[] args) {
        int total = 0;
        int count = 1;
        int amount = 0;
        while(count <= 1000){
            total+=count;
            count++;
            if(total % 8 == 0){
                amount++;
            }
        }
        System.out.println(amount);
    }
}
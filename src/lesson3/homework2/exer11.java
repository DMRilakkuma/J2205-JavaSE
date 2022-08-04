package lesson3.homework2;

import org.testng.reporters.jq.Main;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 19:09
 * @Description:
 */
public class exer11 {
    public static void main(String[] args) {
        char c1= (char) ((char) (Math.random() * 26 + 1) + 97);
        char c2= (char) ((char) (Math.random() * 26 + 1) + 97);
        char c3= (char) ((char) (Math.random() * 26 + 1) + 97);
        char c4= (char) ((char) (Math.random() * 26 + 1) + 97);
        System.out.println(c1 +""+ c2 +""+ c3 +""+ c4);
    }
}
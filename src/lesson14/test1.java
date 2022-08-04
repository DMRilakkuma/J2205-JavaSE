package lesson14;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 10:48
 * @Description:
 */

public class test1 {
    public static int getNumber() throws Exception {

        StringBuilder sb = new StringBuilder("a");
        try {
            sb.append("b");
            System.out.println(1 / 0);
            return sb.hashCode();
        } catch (Exception e) {
            sb.append("c");
            return sb.hashCode();
        } finally {
            sb.append("d");
            System.out.println("finally" + sb.hashCode());
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getNumber());
    }
}
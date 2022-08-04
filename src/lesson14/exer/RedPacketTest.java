package lesson14.exer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 17:12
 * @Description:
 */

public class RedPacketTest {
    public static void main(String[] args) throws RedPackException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入红包的总金额:");
        String s = scanner.next();
        System.out.println("请输入红包个数:");
        int i = scanner.nextInt();
        RedEnvelope redEnvelope = new RedEnvelope();
        ArrayList<BigDecimal> list = redEnvelope.genRedPacket(s, i);
        System.out.println(list.toString());
    }
}
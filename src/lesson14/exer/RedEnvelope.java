package lesson14.exer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 16:48
 * @Description:
 */

public class RedEnvelope {
    ArrayList<BigDecimal> list = new ArrayList<>();

    public ArrayList<BigDecimal> genRedPacket(String total, int count) throws RedPackException {
        BigDecimal bigDecimal = new BigDecimal(total);
        BigDecimal b = bigDecimal;
        if (bigDecimal.doubleValue() / count <= -0.01) {
            throw new RedPackException();
        }

        Random rand = new Random();
        double total1 = 0;
        double[] arr = new double[count];
        int index = 0;
        for (int i = 0; i < count; i++) {
            double i1 = Math.random();
            arr[i] = i1;
            total1 += arr[i];
        }

        while (count > 0) {
            double v;
            try {
                if (count == 1) {
                    v = bigDecimal.doubleValue();
                } else {
                    double v1 = arr[count - 1] / total1;
                    v = b.doubleValue() * (v1);
                }
                if (v < 0.01) {
                    throw new Exception();
                }
                count--;
            } catch (Exception e) {
                throw new RuntimeException("金额不能少于0.01");
            }
            BigDecimal sum = new BigDecimal(String.format("%.2f", v));
            list.add(sum);

            bigDecimal = bigDecimal.subtract(sum);
        }
        return list;
    }
}
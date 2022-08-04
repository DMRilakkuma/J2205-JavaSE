package lesson14.exer;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-15 15:04
 * @Description:
 */

public class RedPackException extends Exception {


    public RedPackException() {
        
    }

    @Override
    public String toString() {
        return "每个红包余额不能少于0.01";
    }
}
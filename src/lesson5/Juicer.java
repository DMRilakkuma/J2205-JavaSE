package lesson5;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-28 13:41
 * @Description: 榨汁机对象
 */
public class Juicer {
    // 对象的基本属性
    String name = "美的鲜榨机器";
    String factory = "美的集团"; //生产厂家
    String color = "red";
    int capacity = 2000; // 容量
    int maxSpeed = 1000;  //最大转速
    double price = 100.02; // 价格

    // 无参
    public Juicer() {

    }

    // 有参
    public Juicer(String Jname) {
        name = Jname;

    }

    //创建对象的基本方法或者功能

    // 第一个方法:
    // void:翻译叫空的,意思表示当前方式不需要返回值
    /*
      1：没有返回值
      2 ： 没有参数
     */
    public void start() {
        System.out.println("欢迎使用" + name);
    }

    // 第二个方法:
    /*
    1:没有返回值
    2:有参数，在参数列表中的参数:叫做形参(形式参数)
     */
    public void fruits(String fruitsName) {
        System.out.println("你放入的水果是:" + fruitsName);

    }

    //第三个方法
    /*
        1 : 有返回值,返回值可以是int，boolean这种基础数据，还可以是String ，Person
        2:有参数
        3:方法中可以有0个或者多个参数，但是只能有一个返回值
        4 : 有多个返回值?
     */
    public String getJuice(Object... args) {
        String result = "";
        // 榨汁机有百分之5的失败率
        // 写一个1-100的随机数生成器，来生成当次榨汁机的成功和失败的概率
        int probability = (int) (Math.random() * (100 - 1 + 1) + 1);
        if (probability > 95) {
            // 大于95 说明榨汁失败
            result = "抱歉,这次榨汁没成功,你水果爆掉了！";
        } else {
            result = "恭喜你获得由";
            for (int i = 0; i < args.length; i++) {
                result += args[i] + " ";
            }
            result += "榨成的水果汁";
        }
        return result;
    }

}
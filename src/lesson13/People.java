package lesson13;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 10:42
 * @Description:
 */

public class People {
    int i = 10;

    public static class myCache {
        final static int height = 100;
        final static int low = -100;

        static {
            System.out.println("最大缓存100M,最小缓存是20M");
        }

    }

    public void speak(String color) {
        // 局部内部类:这个类更多的时候只是当前这个方法提供的比较私有，隐蔽性的算法

        class Toke {

            // 局部内部类：是不可以直接拿来实例化调用，因为只有当前该方法被调用，局部类才会被使用
            String name = "张三";

            public void speak(String color) {
                switch (color) {
                    case "黄色":
                        System.out.println("亚洲人!");
                        break;
                    case "白色":
                        System.out.println("欧洲人");
                        break;
                    case "黑色":
                        System.out.println("非洲人");
                        break;
                    case "蓝色":
                        System.out.println("外星人!");
                        break;

                    default:
                        System.out.println("野人");
                }

            }
        }
        Toke toke = new Toke();
        toke.speak(color);
        // 如果内部类被private修饰，那么这个内部类就只能在当前类使用
    }

    public class Person { //被static修饰的对象会在创建时保存在内存中
        //在内部类里面可以多添加一些内部的属性,提高了这些类的隐藏性
        String password = "123456";

        public Person() {
        }

        public void print() {
            // 在1.8之后内部类可以直接使用,不可以直接修改
            // 在jdk1.8之前内部类都不可以直接使用people类的成员变量
            System.out.println("当前的成员变量是" + i);
        }

        public void speak() {
            System.out.println("我还会说家乡话");
        }
    }
}

class Human {
    public void speak() {
        System.out.println("我会说人话");
    }
}
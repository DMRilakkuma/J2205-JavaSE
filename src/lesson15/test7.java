package lesson15;

import java.io.File;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-15 14:25
 * @Description:
 */

public class test7 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        getName(file);

    }

    public static void getName(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                //如果是目录,就继续在这个目录下查找文件
                getName(f);
            } else {
                System.out.println(f.getName());
            }
        }
    }
}
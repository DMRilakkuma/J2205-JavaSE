package lesson15;

import java.io.File;
import java.io.IOException;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-15 10:51
 * @Description:
 */

public class test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        file.createNewFile();
        File file2 = new File("src/lesson15/test4.java");
        boolean newFile = file2.createNewFile();

        // 绝对路径
        File file1 = new File("D:\\IDEA workspace\\J2205\\src\\lesson15\\test4.java");
        

        System.out.println(file2.exists());

        System.out.println(file1.exists());

        System.out.println(File.separator);

        System.out.println(file2.getAbsolutePath());// 绝对路径
        System.out.println(file2.getPath()); // 相对路径
    }
}
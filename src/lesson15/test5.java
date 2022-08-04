package lesson15;

import java.io.File;
import java.io.IOException;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-15 11:28
 * @Description:
 */

public class test5 {
    public static void main(String[] args) throws IOException {
//        File file = new File("src/lesson15/test/demo");
//        file.mkdirs();

//        File file = new File("src/lesson15/test/demo");
//        file.mkdirs();
//
//        File file1 = new File("src/lesson15/demo");
//        System.out.println(file1.exists());
//
//        File file2 = new File("src/lesson/mydemo", "test.java");
//        file2.createNewFile();

        // 在你当前项目制定路径下创建一个demo.txt
        File file3 = new File("src/lesson15/demo.txt");
        file3.createNewFile();
    }

}
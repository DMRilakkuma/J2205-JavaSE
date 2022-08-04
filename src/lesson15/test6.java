package lesson15;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileFilter;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-15 13:51
 * @Description:
 */

public class test6 {
    public static void main(String[] args) {
        // 需要过滤的文本路径
        File file = new File("D:\\OneDrive\\图片\\Saved Pictures");
        FileFilter filter = new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".jpg");
            }
        };

        File[] files = file.listFiles(filter);
        for (File f : files) {
            System.out.println(f.getName());
        }
    }

    @Test
    public void test() {
        File file = new File("D:\\OneDrive\\图片\\Saved Pictures");
        MyFileFileter myFileFileter = new MyFileFileter();
        File[] files = file.listFiles(myFileFileter);
        for (File f : files) {
            System.out.println(f.getName());
        }


    }
}
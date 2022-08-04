package lesson15.homework;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-15 18:21
 * @Description:
 */

public class Main6 {
    public static void main(String[] args) {
        File file = new File("D:\\IDEA workspace\\J2205\\src\\Exam1");
        File[] files = file.listFiles();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println("文件名/目录名\t\t\t修改时间\t\t\t文件类型\t\t\t大小（只有标准文件显示）");
        for (File f : files) {
            String[] split = f.getName().split("\\.");
            System.out.print(f.getName() + "\t\t\t");
            System.out.print(simpleDateFormat.format(f.lastModified()) + "\t\t\t");
            System.out.print(split[split.length - 1] + "\t\t\t");
            System.out.print(f.length());

            System.out.println();
        }


    }

}
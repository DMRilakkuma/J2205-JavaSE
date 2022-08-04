package lesson17.homework;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-19 17:04
 * @Description:
 */

public class Main1 {
    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名字 : ");
        String path = scanner.next();
        File file = new File(path);
        File file2 = new File("D:\\QQMusic\\Music\\VipSongsDownload");
        recursion(file2);
        Map<String, String> map2 = new HashMap<>();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            if (entry.getValue().contains(path)) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }

        Set<Map.Entry<String, String>> entries1 = map2.entrySet();
        for (Map.Entry<String, String> entry : entries1) {
            System.out.println("文件名字为: " + entry.getValue() + "\t文件路径为: " + entry.getKey());
        }

    }

    public static void recursion(File file) {
        if (file.exists()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    recursion(f);
                } else {
                    map.put(f.getPath(), f.getName());
                }
            }
        }
    }
}
package lesson15;

import java.io.File;
import java.io.FileFilter;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-15 14:16
 * @Description:
 */

public class MyFileFileter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        boolean result = false;
        if (pathname.getName().startsWith("王") && pathname.getName().endsWith(".map3")) {
            result = true;
        }
        return result;
    }
}
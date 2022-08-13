package com.ljw4dakeai.jinjieban.chapter09.test01file.testpackage01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ZJH
 */
public class Test06TestFileMix {
    public static void main(String[] args) {
        File file = new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09/test01file/testpackage01");
        File[] files = file.listFiles();

        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.lastModified() - o2.lastModified() > 0 ? 1 : (o1.lastModified() - o2.lastModified() == 0 ? 0 : -1);
            }
        });

        for (File f : files) {
            System.out.println(f.getName() + " : " +
                    new SimpleDateFormat("yyyy-MM-dd HH::mm:ss:SSS").format(f.lastModified()));
        }
    }
}

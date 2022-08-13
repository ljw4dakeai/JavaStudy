package com.ljw4dakeai.jinjieban.chapter10.test02conventio;

import java.io.*;

/**
 * @author ZJH
 */
public class Test04TestFileConvent {
    public static void main(String[] args) throws IOException {
        fileConvent(new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test02conventio/utf-8.txt"), "utf-8",
                new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test02conventio/GBK.txt"), "GBK"
        );
    }

    public static void fileConvent(File copyFile, String copyFileCharSet, File toFile, String toFileCharset) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(copyFile), copyFileCharSet));

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(toFile), toFileCharset));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

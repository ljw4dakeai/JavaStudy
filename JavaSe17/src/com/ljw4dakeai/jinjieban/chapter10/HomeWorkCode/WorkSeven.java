package com.ljw4dakeai.jinjieban.chapter10.HomeWorkCode;

import java.io.*;

/**
 * @author ZJH
 * @info - 手动在模块目录下创建一个GBK.txt文件（不需要用代码创建），修改它的编码格式为GBK编码
 * - 编写代码，使用InputStreamReader指定GBK编码读取GBK.txt文件中的内容，并使用UTF-8编码将读取到的内容，写入到UTF-8.txt文件中
 */
public class WorkSeven {
    public static void main(String[] args) throws IOException {
        copyFile(new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkCode/GBK.txt"), "GBK",
                new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkCode/UTF-8.txt"), "utf-8");
    }

    public static void copyFile(File copyFile, String copyFileCharset, File toFile, String toFileCharset) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(copyFile), copyFileCharset));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(toFile), toFileCharset));

        String line;
        while((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

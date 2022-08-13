### File

- 构造方法

```java
class File {
    public File(String filePath) {
        //完整路径    
    }

    /**
     * @param parent 父文件夹路径
     * @param child 文件名
     */
    public File(String parent, String child) {

    }

    /**
     * @param parentName 父文件夹文件对象
     * @param child 文件名
     */
    public File(File parentName, String child) {

    }


}

```

- 成员方法

```java
class File {
    /**
     * 判断是否是一个文件夹
     * @return 是还是不是
     */
    public boolean isDirectory() {
    }

    /**
     * 判断是否是一个文件
     * @return 是还是不是
     */
    public boolean isFile() {
    }

    /**
     * 判断是否存在
     * @return 是还是不是
     */
    public boolean exists() {
    }

    /**
     * @return 返回文件的绝对路径
     */
    public boolean getAbsolutePath() {
    }

    /**
     * @return 返回文件的构造路径
     */
    public boolean getPath() {
    }

    /**
     * @return 返回文件, 文件夹名
     */
    public String getName() {
    }

    /**
     * @return 返回当前文件夹下的第一级文件数组
     */
    public File[] listFiles() {
    }

    /**
     * @return 返回文件最后修改的时间的时间戳
     */
    public long lastModified() {
    }
}
```

- 文件的查找

```java
import java.util.Arrays;

class Test {
    public static void fileSearch(File file, String searchName) {
        Arrays.stream(Objects.requireNonNull(file.listFiles())).forEach(
                val -> {
                    if (val.isFile()) {
                        if (val.contains(searchName)) {
                            System.out.println(val);
                        }
                    } else {
                        fileSearch(val, searchName);
                    }
                }
        );
    }
}

```

- 删除的递归

```java
import java.io.File;
import java.util.Arrays;

class Test {
    public static void fileDelete(File directory) {
        Arrays.stream(Objects.requireNonNull(directory.listFiles())).forEach(
                val -> {
                    if (val.isFile()) {
                        directory.delete();
                    } else {
                        fileDelete(val);
                    }
                }
        );
        directory.delete();
    }
}
```

### CharSet

- ASCII

````
包含英文字母, 数字, 标点符号 , 一个字符占用一个字节
````

- GBK

```
向下包含ASCII, 支持中文...
ASII 占用 一个自己
中文字符占用两个字节
```

- Unicode

```
支持所有字符
字符集有UFT-8,UFT-16,UFT-32(UFT-8使用最多)
英文字符占一个自己, 中文字符占三个字节
```

- 字符转化为字节

### IO

#### 字节流

- 一次读取一个字节
  ```java
   import java.io.FileInputStream;
   class Test{
    public static void main(String[] args){
        FileInputStream fileInputStream = new FileInputStream("文件的路径");
        int read;
        while ((read = fileInputStream.read()) != -1) {
            System.out.println(read);
            System.out.println((char) read);
        }
        //关闭流
        fileInputStream.close();
        //不关闭会被程序一直使用
    }
  }
   ```
- 一次读取多个字节
  ````java
   import java.io.FileInputStream;
   class Test{
    public static void main(String[] args){
        FileInputStream fileInputStream = new FileInputStream("文件的路径");
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        //关闭流
        fileInputStream.close();
        //不关闭会被程序一直使用
    }
  }
  ````

- 一次读取全部字节
  ```java
   import java.io.FileInputStream;
   class Test{
    public static void main(String[] args){
        FileInputStream fileInputStream = new FileInputStream("文件的路径");
        System.out.println(new String(fileInputStream.readAllBytes()));
        fileInputStream.close();
        //不关闭会被程序一直使用
    }
  }
  ```
- 字节流的写入
  ```java
  import java.io.FileOutputStream;import java.nio.charset.StandardCharsets;   class Test{
   public static void main(String[] args){
        FileOutputStream fileOutputStream = new FileOutputStream("文件路径");
        fileOutputStream.write("写入内容".getBytes(StandardCharsets.UTF_8));
        //换行写入
        fileOutputStream.write("\n\r".getBytes(StandardCharsets.UTF_8));
        //关闭流
        fileOutputStream.close();
   } 
  }
  ```
- 文件的复制
  ```java
  import java.io.FileInputStream;import java.io.FileOutputStream;   
  class Test{
    public static void main(String[] args){
        try(
                FileInputStream fileInputStream=new FileInputStream("被复制文件路径");
                FileOutputStream fileOutputStream=new FileOutputStream("复制文件路径")
         ){
            int len;
             byte[] bytes = new byte[1024];
             while ((len = fileInputStream.read(bytes)) != -1){
                        fileOutputStream.write(bytes, 0, len);
                }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
  }
  ```

#### 字符流

- 读取数据
   ```java
   import java.io.FileReader;
 
   class Test {
     public static void main(String[] args) {
       FileReader fileReader = new FileReader("文件名");
       int len;
       char[] chars = new char[1024];
       while((len = fileReader.read(chars)) != -1){
         System.out.println(new String(chars, 0, len));
       }
       fileReader.close();
     }
   }
   ```

- 写入数据
   ```java
   import java.io.FileWriter;
   
   class Test {
     public static void main(String[] args) {
       FileWriter fileWriter = new FileWriter("文件地址");
       fileWriter.write("写入数据");
       fileWriter.close();
     }
   }
   ```


- 赋值文本文件

  ```java
  import java.io.FileReader;
  import java.io.FileWriter;
  
  class Test {
    public static void copyFile(File copyFile, File toFile) {
      FileReader fileReader = new FileReader(copyFile);
      FileWriter fileWriter = new FileWriter(toFile);
      int len;
      char[] chars = new char[1024];
      while ((len = fileReader.read(chars)) != -1){
          fileWriter.write(new String(chars, 0, len));
      }
      
      fileReader.close();
      fileWriter.close();
    }
  }
  ```

### 缓冲流

- 复制文件
  ```java
  import java.io.*;
  
  class Test {
    //字节缓冲流
    public static void copyFileStream(File copyFile, File toFile) {
      BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(copyFile));
      BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(toFile));
  
      int len;
      byte[] bytes = new byte[1024];
      while ((len = bufferedInputStream.read(bytes)) != -1) {
        bufferedOutputStream.write(bytes, 0, len);
      }
  
      bufferedInputStream.close();
      bufferedOutputStream.close();
    }
  
    //字符缓冲流原始方法
    public static void copyFileEr(File copyFile, File toFile) {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(copyFile));
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toFile));
  
      int len;
      char[] chars = new char[1024];
      while ((len = bufferedReader.read(chars)) != -1) {
        bufferedWriter.write(chars, 0, len);
      }
  
      bufferedReader.close();
      bufferedWriter.close();
    }
  
      //字符缓冲流特有方法
      public static void copyFileErWithLine(File copyFile, File toFile) {
          BufferedReader bufferedReader = new BufferedReader(new FileReader(copyFile));
          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toFile));
  
  
          String line;
          while ((line = bufferedReader.readLine()) != null) {
              bufferedWriter.write(line);
              bufferedWriter.newLine();
          }
  
          bufferedReader.close();
          bufferedWriter.close();
      }
    
  }
  
  ```

### 转换流

- 文件复制

   ```java
   import java.io.*;
   class Test {
       public static void copyFile(File copyFile, String copyFileCharset, File toFile, String toFileCharset) {
           BufferedInputStream bufferedInputStream = new BufferedInputStream(new InputStreamReader(new FileReader(copyFile), copyFileCharset));
           BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new OutputStreamWriter(new FileWriter(toFile), toFileCharset));
           
           
           int len;
           byte[] bytes = new byte[1024];
           while ((len = bufferedInputStream.read(bytes)) != -1){
               bufferedOutputStream.write(bytes, 0 , len);
           }
           
           bufferedInputStream.close();
           bufferedOutputStream.close();
           
       }
   }
   ```

### IO流体系结构

```

---字节流
    --字节输入流(InputStream)
        --FileInputStream : 读取文件中的字节数据
        --BufferedInputStream : 对InputStream子类对象进行封装, 提高读取效率
    ---字节输出流(OutputStream)
        --FileOutputStream : 往文件中写字节数据
        --BufferOutPutStream : 对OutputStream子类对象进行封装, 提高写入效率
        
--字符流(只能读取文本文件, 非文本文件不可读取!)
    --字符输入流(Reader)
        --FileReader : 读取文件中的字符数据
        --BufferedReader : 对 Reader子类对象进行封装, 提高字符读取效率
    --字符输出流(Writer)
        --FileWriter : 往文件中写字符数据
        --BufferedWriter : 对Writer子类对象进行封装, 提高字符写入效率
        
---缓冲流(对数据进行封装, 提高读, 写数据效率)
    --字节流
        --BufferedInputStream
        --BufferOutPutStream
    字符流
        --BufferedReader
        --BufferedWriter
          
---转换流(按照指定的编码格式, 将字节流转换为字符流, 不会出现乱码)
    --InputStreamReader : 把InputStream 按照指定编码转化为 Reader
    --OutputStreamWriter : 把OutputStream 按照指定编码转化为 Writer
    
---对象流(通过序列号化, 将对象写入文件, 或者反序列化读取文件中的对象)
    --ObjectInputStream : 把对象通过反序列化在通过FileInputStream读入内存中
    --ObjectOutputStream : 把对象通过序列化再通过FIleOutputStream写入文件

---输出流
    --PrintStream
    --PrintWriter

```
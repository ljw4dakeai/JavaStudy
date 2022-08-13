###LogBack

- 什么是日志门面
```properties
解释 : 各个日志系统底层都不同, 学习成本很高, 为简化开发, 实现一套\
  统一的日志接口, 所有日志系统都对日志门面进行接口实现, \
  只需要记住日志门面的方法就可以开发, 简化开发
```

- 日志文件系统的集成
```
 -- 日志门面
    -- slf4j
        -- log4j
        -- logback
        -- java.logging
        -- slf4j-simple
```


- 日志文件配置文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <!--
        CONSOLE ：表示当前的日志信息是可以输出到控制台的。
    -->
    <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
        <!--输出流对象 默认 System.out 改为 System.err-->
        <target>System.out</target>
        <encoder>
            <!--格式化输出：%d表示日期，%thread表示线程名，%-5level：级别从左显示5个字符宽度
                %msg：日志消息，%n是换行符-->
            <pattern> %highlight([%-5level]) -> %green(%d{yy/MM/dd HH:mm:ss}) ** [%t] %red(%L) %cyan( %c{1}): %m%n</pattern>
<!--           [%-5level] -> %d{yy/MM/dd HH:mm:ss} ** [%t] %c{1}: %m%n-->
<!--           %d{yyyy-MM-dd HH:mm:ss.SSS} [%-5level]  %c [%thread]: %msg%n -->
        </encoder>
    </appender>

    <!-- File是输出的方向通向文件的 -->
    <appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <encoder>
            <pattern>[%-5level] -> %d{yy/MM/dd HH:mm:ss} ** [%t]  %L %c{1}: %m%n</pattern>
            <charset>utf-8</charset>
        </encoder>
        <!--日志输出路径-->
        <file>C:/software/code/java/JavaStudy/JavaSe17/src/com/ljw4dakeai/jinjieban/chapter08/test01logback/log/data.log</file>
        <!--指定日志文件拆分和压缩规则-->
        <rollingPolicy
                class="ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy">
            <!--通过指定压缩文件名称，来确定分割文件方式-->
            <fileNamePattern>C:/software/code/java/JavaStudy/JavaSe17/src/com/ljw4dakeai/jinjieban/chapter08/test01logback/log/dataTime-%d{yyyy-MM-dd}.log%i.gz</fileNamePattern>
            <!--文件拆分大小-->
            <maxFileSize>1MB</maxFileSize>
        </rollingPolicy>
    </appender>

    <!--
    level:用来设置打印级别，大小写无关：TRACE, DEBUG, INFO, WARN, ERROR, ALL 和 OFF
   ， 默认debug
    <root>可以包含零个或多个<appender-ref>元素，标识这个输出位置将会被本日志级别控制。
    -->
    <root level="ALL">
        <appender-ref ref="CONSOLE"/>
        <appender-ref ref="FILE" />
    </root>
</configuration>

```
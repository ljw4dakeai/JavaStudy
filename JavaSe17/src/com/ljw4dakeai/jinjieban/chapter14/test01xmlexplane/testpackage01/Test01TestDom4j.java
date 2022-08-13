package com.ljw4dakeai.jinjieban.chapter14.test01xmlexplane.testpackage01;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * @author ZJH
 */
public class Test01TestDom4j {

    public void parseXml() throws Exception {
        //解析器对象
        SAXReader saxReader = new SAXReader();

        //获取配置文件输入流(通过字节码加载进来)
        InputStream resourceInputStream = Test01TestDom4j.class.getResourceAsStream("/Contacts.xml");
//        FileReader resourceInputStream = new FileReader("resource/Contacts.xml");




        //加载配置文件
        Document document = saxReader.read(resourceInputStream);

        //获取根标签
        Element rootElement = document.getRootElement();
        System.out.println(rootElement);

        //获取所有跟标签的一级只标签
        rootElement.elements().forEach(System.out::println);


        System.out.println("----------------------------------------------------");
        //获取跟标签的第一个标签
        Element elementOne = rootElement.elements().get(0);
        System.out.println(elementOne);
        //获取第一个标签的数据
        // 方式1 :
        // String name= elementOne.element("name").getText().trim();
        //方式2
        // String name = elementOne.element("name").getTextTrim();
        //方式3
        String name = elementOne.elementTextTrim("name");
        System.out.println(name);


        System.out.println("----------------------------------------------------");

        //获取标签属性数据
        //方式1 :
        //String id = elementOne.attribute("id").getValue();
        //方式2
        String id = elementOne.attributeValue("id");
        System.out.println(id);

        //获取标签属性名
        String qName = elementOne.attribute("id").getName();
        System.out.println(qName);
    }


    @Test
    public void parseXmlList() throws Exception {
        //解析器对象
        SAXReader saxReader = new SAXReader();

        //获取配置文件输入流(通过字节码加载进来)
        InputStream resourceInputStream = Test01TestDom4j.class.getResourceAsStream("/Contacts.xml");
//        FileReader resourceInputStream = new FileReader("resource/Contacts.xml");

        //加载配置文件
        Document document = saxReader.read(resourceInputStream);

        ArrayList<Contacts> contacts = new ArrayList<Contacts>();

        document.getRootElement().elements().forEach(element -> {
            contacts.add(new Contacts(
                    element.attributeValue("id"),
                    Boolean.parseBoolean(element.attributeValue("vip")),
                    element.elementTextTrim("name"),
                    element.elementTextTrim("gender"),
                    element.elementTextTrim("email")
            ));
        });

        contacts.forEach(System.out::println);
    }


}

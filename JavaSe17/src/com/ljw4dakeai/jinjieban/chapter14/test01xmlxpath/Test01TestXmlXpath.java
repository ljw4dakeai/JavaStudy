package com.ljw4dakeai.jinjieban.chapter14.test01xmlxpath;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @author ZJH
 */
public class Test01TestXmlXpath {
    public static void main(String[] args) throws Exception{
        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read(Test01TestXmlXpath.class.getResourceAsStream("/Contacts2.xml"));

        List<Node> nodes = document.selectNodes("/contactList/contact/name");
    }
}

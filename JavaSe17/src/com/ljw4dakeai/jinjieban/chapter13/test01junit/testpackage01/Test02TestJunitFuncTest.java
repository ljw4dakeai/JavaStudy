package com.ljw4dakeai.jinjieban.chapter13.test01junit.testpackage01;

import org.junit.*;

/**
 * @author ZJH
 * @info
 * 点击方法前面的按钮测试方法
 * 点击类前面的按钮测试类
 */
public class Test02TestJunitFuncTest {
//    @Test
//    public void testUserLogin(){
//        boolean result = Test01TestJunitTest.Longin("admin", "123456");
//        Assert.assertTrue(result);
//    }
//
//    @Test
//    public void testRun(){
//        Test01TestJunitTest test01TestJunitTest = new Test01TestJunitTest();
//        test01TestJunitTest.run();
//    }

    @Test
    public void test(){
        System.out.println("test");
    }

    /**
     * 可以用来释放资源对象
     */
    @After
    public void after(){
        System.out.println("after");
    }

    /**
     * 可以用来初始化对象
     */
    @Before
    public void before(){
        System.out.println("before");
    }

    @AfterClass
    public static  void afterClass(){
        System.out.println("afterClass");
    }

    @BeforeClass
    public static void beforeClass (){
        System.out.println("beforeClass");
    }
}

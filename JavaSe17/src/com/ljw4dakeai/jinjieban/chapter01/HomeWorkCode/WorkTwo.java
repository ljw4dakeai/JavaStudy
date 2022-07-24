package com.ljw4dakeai.jinjieban.chapter01.HomeWorkCode;

/**
 * @author ZJH
 * @info
 * - 1. 定义动物类，要求如下
 *   - 属性：
 *   	年龄，颜色
 *   - 行为:
 *   	eat(String something)方法(无具体行为,something表示吃的东西)
 *   - 生成空参有参构造，set和get方法
 * - 2. 定义狗类继承动物类，要求如下
 *   行为:
 *   	eat(String something)方法(有具体行为)
 *   	lookHome方法(无参数)方法
 * - 3. 定义猫类继承动物类
 *   行为:
 *   	eat(String something)方法(有具体行为)
 *   	catchMouse方法(无参数)方法
 * - 4. 定义Person类
 *   属性：
 *   	姓名，年龄
 *
 *   行为：
 *   	keepPet(Dog dog,String something)方法
 *   	功能：喂养宠物狗，something表示喂养的东西
 *   	该方法调用后打印结果为：颜色为黑色的2岁的狗，在吃骨头
 *
 *   	keepPet(Cat cat,String something)方法
 *   	功能：喂养宠物猫，something表示喂养的东西
 *   	该方法调用后打印结果为：颜色为白色的2岁的猫，在吃小鱼干
 */
public class WorkTwo {
    public static void main(String[] args) {
        Dog dog = new Dog(2, "黑色");
        Cat cat = new Cat(2, "白色");

        Person person = new Person();
        person.keepPet(dog, "骨头");
        person.keepPet(cat, "小鱼干");

    }
}

class Animal {
    /**
     * - 属性：
     * 年龄，颜色
     * - 行为:
     * eat(String something)方法(无具体行为,something表示吃的东西)
     * - 生成空参有参构造，set和get方法
     */
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public String eat(String something) {
        return "动物正在吃" + something;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Dog extends Animal {

    /**
     * 行为:
     * eat(String something)方法(有具体行为)
     * lookHome方法(无参数)方法
     */


    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public String eat(String something) {
        return "小狗正在吃" + something;
    }

    public void lookHome() {
        System.out.println("小狗会看家");
    }
}

class Cat extends Animal {
    /**
     * 行为:
     * eat(String something)方法(有具体行为)
     * catchMouse方法(无参数)方法
     */

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }


    @Override
    public String eat(String something) {
        return "小猫正在吃" + something;
    }

    private void catchMouse() {
        System.out.println("小猫可以抓老鼠");
    }
}

class Person {
    /**
     * 属性：
     * 姓名，年龄
     * <p>
     * 行为：
     * keepPet(Dog dog,String something)方法
     * 功能：喂养宠物狗，something表示喂养的东西
     * 该方法调用后打印结果为：颜色为黑色的2岁的狗，在吃骨头
     * <p>
     * keepPet(Cat cat,String something)方法
     * 功能：喂养宠物猫，something表示喂养的东西
     * 该方法调用后打印结果为：颜色为白色的2岁的猫，在吃小鱼干
     */

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Dog dog, String something) {
        //颜色为黑色的2岁的狗，在吃骨头
        System.out.println("颜色为" + dog.getColor() + "的" + dog.getAge() + "岁" + dog.eat(something));
    }

    public void keepPet(Cat cat, String something) {
        //颜色为黑色的2岁的狗，在吃骨头
        System.out.println("颜色为" + cat.getColor() + "的" + cat.getAge() + "岁" + cat.eat(something));
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



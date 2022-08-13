package com.ljw4dakeai;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author ZJH
 */
public class UserApp {
    static final String USER_STRINGS =
            "10001:张三:男:1990-01-01" +
                    "#10002:李四:女:1989-01-09" +
                    "#10003:王五:男:1999-09-09" +
                    "#10004:刘备:男:1899-01-01" +
                    "#10005:孙悟空:男:1900-01-01" +
                    "#10006:张三:女:1999-01-01" +
                    "#10007:刘备:女:1999-01-01" +
                    "#10008:张三:女:2003-07-01" +
                    "#10009:猪八戒:男:1900-01-01";


    public static void main(String[] args) throws ParseException {
        methodOne()
                .forEach(System.out::println);


        methodTwo(methodOne())
                .entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .forEach(System.out::println);
    }


    private static ArrayList<User> methodOne() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<User> users = new ArrayList<>();


        String[] strings = USER_STRINGS.split("#");
        for (String string : strings) {
            String[] args = string.split(":");
            users.add(
                    new User(
                            Long.parseLong(args[0]),
                            args[1],
                            args[2],
                            simpleDateFormat.parse(args[3])
                    )
            );
        }
        return users;

//        Arrays.stream(strings).forEach(
//                value -> {
//                    String[] args = value.split(":");
//                    try {
//                        users.add(
//                                new User(
//                                        Long.parseLong(args[0]),
//                                        args[1],
//                                        args[2],
//                                        simpleDateFormat.parse(args[3])
//                                )
//                        );
//                    } catch (ParseException e) {
//                        e.printStackTrace();
//                    }
//                }
//        );
//        return users;
    }

    private static HashMap<String, Integer> methodTwo(ArrayList<User> users) {
        List<String> strings = users.stream().map(User::getUsername).toList();
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>(10);
        for (String string : strings) {
            if (!stringIntegerHashMap.containsKey(string)) {
                stringIntegerHashMap.put(string, 1);
            } else {
                stringIntegerHashMap.put(string, stringIntegerHashMap.get(string) + 1);
            }
        }
        return stringIntegerHashMap;
    }
}
package com.example.newfeature.features;

import com.example.newfeature.service.impl.NineTestImpl;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;



public class Features9 {



    public static void main(String[] args) {
        nineTest();
    }


    public  static void nineTest() {
        //集合工厂
        Set<String> set = Set.of("A", "B", "C");
        System.out.println(set);
        List<String> list = List.of("A", "B", "C");
        System.out.println(list);
        Map<String, String> map = Map.of("A","Apple","B","Boy","C","Cat");
        System.out.println(map);

        Map<String, String> map1 = Map.ofEntries (
                new AbstractMap.SimpleEntry<>("A","Apple"),
                new AbstractMap.SimpleEntry<>("B","Boy"),
                new AbstractMap.SimpleEntry<>("C","Cat"));
        System.out.println(map1);

        //私有接口方法
        new NineTestImpl().sayHello();

        //改进的stream
        List<String> testList = List.of("a", "", "b", "c");
        //1.takeWhile
        testList.stream().takeWhile(data->!data.isEmpty()).forEach(System.out::println);
        //2.dropWhile
        testList.stream().dropWhile(data->!data.isEmpty()).forEach(System.out::println);
        //iterate方法
        IntStream.iterate(3, x -> x < 10, x -> x+ 3).forEach(System.out::println);



    }



}

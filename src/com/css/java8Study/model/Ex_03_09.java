package com.css.java8Study.model;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.css.java8Study.model.SampleData.membersOfTheBeatles;

/**
 * Created by 46597 on 2018/5/2.
 */
public class Ex_03_09 {


    public static void main(String[] args) {

        Integer count = Stream.of(1, 2, 3, 4).reduce(0, (x, y) -> x + y);
        System.out.println(count);


        Integer count2 = Stream.of(1, 2, 3, 4).reduce((x, y) -> x + y).get();
        System.out.println(count2);

        Stream stream = Stream.of(1, 2, 3, 4);
        Integer count3 = addUp(stream);
        System.out.println(count3);

    }

    private static Integer addUp(Stream<Integer> stream) {
        return stream.reduce((x, y) -> x + y).get();
    }


    @Test
    public void test01() {


        List<String> collect = membersOfTheBeatles.stream().map(x -> x.getName() + " - " + x.getNationality()).collect(Collectors.toList());
        System.out.println(collect);

    }


}

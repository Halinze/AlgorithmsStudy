package com.css.java8Study;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Assert;
import org.junit.Test;

import javax.sound.midi.Track;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * Created by 46597 on 2018/4/23.
 */
public class Ex_2_01 {


    public static void main(String[] args) {


        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        });
        button.addActionListener(event -> System.out.println("button clicked"));


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        Thread thread1 = new Thread(() -> System.out.println("Hello world"));


        ActionListener oneArgument = (ActionEvent event) -> System.out.println("Hello world");


        Runnable multiStatement = () -> {
            System.out.println("Hello");
            System.out.println("World");
        };


        BinaryOperator<Long> add = (x, y) -> x + y;

        BinaryOperator<Long> binaryOperator = new BinaryOperator<Long>() {

            @Override
            public Long apply(Long x, Long y) {
                return x + y;
            }

            @Override
            public <V> BiFunction<Long, Long, V> andThen(Function<? super Long, ? extends V> after) {
                return null;
            }
        };


        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;

        //这个错误该如何解决
        // A css = (a,b) -> System.out.println("css");


        Predicate<Integer> atLeastFive = x -> x > 5 ;


        Predicate<Integer> atLeast5 = new Predicate<Integer>()
        {


            @Override
            public boolean test(Integer integer) {
                return false;
            }

            @Override
            public Predicate<Integer> and(Predicate<? super Integer> other) {
                return null;
            }

            @Override
            public Predicate<Integer> negate() {
                return null;
            }

            @Override
            public Predicate<Integer> or(Predicate<? super Integer> other) {
                return null;
            }
        };

        A css = a -> System.out.println("css");


        Function<String,String>  function = new Function<String,String>() {

            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };





    }

    @Test
    public void test(){

        java.util.List<String> collected = Stream.of("a", "b", "c")
                .collect(Collectors.toList());
        assertEquals(Arrays.asList("a","b","c"),collected);

    }

    @Test
    public void test01(){
        List<String> collected = Stream.of("a", "b", "hello")
                .map(String -> String.toUpperCase())
                .collect(Collectors.toList());
        assertEquals(Arrays.asList("A","B","HELLE"),collected);
    }

    @Test
    public void test02(){

        List<String> collected = Stream.of("a", "b", "c")
                //过过滤出
                .filter(String -> !String.startsWith("a"))
                .collect(Collectors.toList());
        Assert.assertEquals(Arrays.asList("b","c"),collected);

        new Predicate(){
            @Override
            public boolean test(Object o) {
                return false;
            }
        };
    }


    @Test
    public void test03(){
        List<Integer> collect = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());

        Assert.assertEquals(Arrays.asList(1,2,3),collect);

    }

    @Test
    public void test04() {

        List<Track> tracks = Arrays.asList(new Track("Bakai", 2)
                , new Track("Violets for Your Furs", 1)
                , new Track("Time Was", 3));
       // Track track = tracks.stream().min(
       //        ((o1, o2) -> o1.getName().length()-o2.getName().length())).get();

        Track shortTrack = tracks.stream()
                .min(Comparator.comparing(track -> track.getName().length())).get();
        System.out.println(shortTrack);
    }

    @Test
    public void test05(){

        int reduce = Stream.of(1, 2, 3).reduce(1, (x, y) -> x * y);

        Assert.assertEquals(1,reduce);

        BinaryOperator<Integer>  accumlator = (acc ,element) -> acc + element;

        int result = accumlator.apply(
                accumlator.apply(
                        accumlator.apply(0, 1),
                        2
                ),
             3
        );

        Assert.assertEquals(6,result);
    }


    class  Track{

        private   String name ;
        private   int number;

        public Track(String name, int number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Track{" +
                    "name='" + name + '\'' +
                    ", number=" + number +
                    '}';
        }
    }

    private interface A {
        void a(int a);

       //C    void b(int a, int b);
    }

    private class B implements  Comparable<String>,Comparator<String>{

        @Override
        public int compareTo(String o) {
            return 0;
        }

        @Override
        public int compare(String o1, String o2) {
            return 0;
        }
    }




}


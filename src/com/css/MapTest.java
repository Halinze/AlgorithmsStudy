package com.css;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 46597 on 2018/3/10.
 */
public class MapTest {


    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put(null , null);
        map.get(null);
        map.put("2",null);
        System.out.println(map.get("2"));
        System.out.println(map.get(null));
        System.out.println(map);


    }
}

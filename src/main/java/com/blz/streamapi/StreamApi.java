package com.blz.streamapi;

import java.util.ArrayList;

public class StreamApi {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(12);
        list.add(68);
        list.add(1);
        list.add(5);
        // creating stream  and Iterate the Each item to show each element of stream
        list.stream().forEach(value -> System.out.println(value));
    }
}




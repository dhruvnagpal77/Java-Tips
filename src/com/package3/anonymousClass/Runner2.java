package com.package3.anonymousClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner2 {
    public static void main(String[] args) {
        // Let's assume we want to sort the list of string based on their length.
        List<String> list = new ArrayList<>(List.of("Elephant","Zebra", "Cat", "Ball"));

        // Here instead of creating a new class & implementing Comparator interface methods in there & using instance of that new class as Comparator.
        // We are directly implementing comparator interface in here, so we are directly writing the code for Comparator in here
        // & directly creating an instance of it. This way of creating a class is called Anonymous class coz class does not have a name.
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return Integer.compare(str1.length(), str2.length());
            }
        });
        System.out.println(list);
    }
}

//Lambda expressions in Functional Programming are nothing but implementation of functional interface
// & they don't have names as well. So they can be thought of as Anonymous classes as well.
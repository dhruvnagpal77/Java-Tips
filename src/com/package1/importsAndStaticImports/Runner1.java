package com.package1.importsAndStaticImports;

import static java.lang.System.out; // Static import

public class Runner1 {
    public static void main(String[] args) {
        // We don't have to import System class since it's in java.lang package &
        // everything in java.lang package is imported by default.
        System.out.println("Normal import");

        // Static import, if we have to use System.out.println() large number of times in our code,
        // we can use static import to import the static variable out & using it directly.
        out.println("Static import");
    }
}
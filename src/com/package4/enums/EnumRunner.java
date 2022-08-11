package com.package4.enums;

import java.lang.reflect.Array;
import java.util.Arrays;

enum Season {
    SUMMER,
    WINTER,
    FALL,
    SPRING;
}

public class EnumRunner {
    public static void main(String[] args) {
        // If u use String or List<String> to store season then u cannot restrict, somebody can come & store eg: "garbage".
        // How can u pose restriction in terms of what are the values which a specific thing can contain? That's where enums comes into picture.
        String season = "Summer";

        //Season season2 = Season.valueOf("Garbage"); Will throw java.lang.IllegalArgumentException since there is no enum constant called "Garbage"
        // defined in the enum Season.

        //Season season4 =  Season.fall; Won't compile since there is no enum constant called "fall" defined in the enum Season.

        Season season3 = Season.valueOf("WINTER"); // Will not throw java.lang.IllegalArgumentException

        System.out.println(season3); // Prints WINTER

        System.out.println(season3.ordinal()); // Return position of that specific enum constant in the enum declaration, initial position is 0.
        // Storing Enums in DB using ordinal method is not a good practice
        // since ordinal value can change depending on the position of enum constant in the enum declaration.

        System.out.println(Arrays.toString(Season.values())); // Prints all the enum constants in enum Season.
        // Season.values() can also be used to loop through enum Season.

    }
}
package com.package4.enums;

// How to store enum in DB

enum Season2 {
    SUMMER(2), // Writing SUMMER is like creating an instance of enum using default constructor(aka no arguments),
    // writing SUMMER(1) is like creating an instance of enum using parameterized constructor & passing value 3 as an argument in the parameterized constructor,
    // thus we had to make a variable * a parameterized constructor.
    WINTER(3),
    FALL(0),
    SPRING(1);

    private int value; // U can use this value to store enums in DB. This value won't change even if u change the position of enum constant.

    Season2(int value) { // In enums all constructor are private by default, so we don't have to use private keyword.
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class EnumRunner2 {
    public static void main(String[] args) {
        Season2 season = Season2.SUMMER;
        System.out.println(season.ordinal()); // prints 0
        System.out.println(season.getValue()); // prints 2
    }
}
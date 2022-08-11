package com.package2.nestedClass;

public class NestedClassRunner {
    int i; // non-static member

    class InnerClass { // non-static member
        public void method() {
            i = 5; // works coz can non-static nested class access all members of the outer class, including private.
        }
    }

    static class StaticNestedClass { // static member
        public void method() {
            //i = 5; won't compile coz static nested class access only static members of the outer class, including private.
        }
    }

    public static void main(String[] args) {
        //InnerClass innerClass = new InnerClass(); won't compile since we cannot create an instance of non-static nested class(non-static member)
        // without creating instance of NestedClassRunner first inside a static method.
        NestedClassRunner nestedClassRunner = new NestedClassRunner();
        InnerClass innerClass = nestedClassRunner.new InnerClass();// This will compile.
        StaticNestedClass staticNestedClass = new StaticNestedClass(); // This will compile coz it's a static nested class(static member) thus, we can use it directly
        // inside a static method without using needing to create an instance of NestedClassRunner.
    }
}
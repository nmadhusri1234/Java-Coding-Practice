package com.operators;

public class PostIncrement {

    public static void main(String[] args) {

        // Declare and initialize variable a with value 5
        int a = 5;

        // Post-increment:
        // First assigns the current value of a to b,
        // then increments a by 1
        int b = a++;

        // Prints the updated value of a (6)
        System.out.println(a);

        // Prints the value stored in b (5)
        System.out.println(b);

        // b is not modified, so it still prints 5
        System.out.println(b);

        // Again prints 5 because b remains unchanged
        System.out.println(b);
    }
}
package com.swift.academy.convertion;

public class ConvertDemo {

    public static void main(String[] args) {
        //
        //Implicit casting.
        byte b = 100;
        short s = b;
        int i = s;
        long l = i;

        // From integer to float
        float f = i;
        // From integer to double
        double d = i;
        d = f;

        // From long to float
        float f1 = 123L;

        // From long to double
        double d2 = 123L;

        //
        // Explicit casting
        long l1 = 123L;
        int i1 = (int) l1;
        short s1 = (short) i1;
        byte b1 = (byte) s1;

        double d1 = 12.5;
        float f2 = (float) d1;

        int i2 = (int) f1;

        // From double to long
        long l2 = (long) 12.5;
        // From float to long
        long l3 = (long) 12.5f;

//        What is the data type of x * y ?
//        int x = 1;
//        long y = 33;

//        What is the data type of x + y ?
//        double x = 39.21;
//        float y = 2.1;

//        What is the data type of x / y ?
//        short x = 10;
//        short y = 3;

//        What is the data type of x * y / z ?
//        short x = 14;
//        float y = 13;
//        double z = 30;

    }

}

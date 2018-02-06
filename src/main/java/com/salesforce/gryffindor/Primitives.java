package com.salesforce.gryffindor;

/**
 * Hello world!
 */
public class Primitives {
    public static void main(String[] args) {
        //Primitives
        System.out.println("Hello, World");
        byte b = 102; //8 bits
        byte maxByte = 127;
        byte minByte = -128;

        short maxShort = 32767 ; // 2^(n-1) -1
        short minShort = -32768; //16 bit

        int i = 30394;
        long lng = 491292383;
        long lng2 = 491292383L;

        float f = 3292.9948F;
        double d = 6456439.65D;

        boolean te = true;
        boolean fs = false;

        char c = 'd';
        char funnyEWithUpsideHat = '\u0114';
        
        System.out.println(i == 30394);  //equality
        System.out.println(i == f);
        System.out.println(i != f);
        System.out.print(c + 3); //OK


        System.out.println(10 % 3); //1
        System.out.println(d/0.0);
    }
}

package by.epam.nanos;

import java.util.Random;

public class Task2 {
    private static final int k = 10;

    Task2(){
        System.out.println("\nTask 2");
        Fraction fraction[] = new Fraction[k];

        Random rand = new Random();
        for (int i=0; i<k; i++) {
            fraction[i] = new Fraction(rand.nextInt(), rand.nextInt());
        }

        System.out.print("Array: {");
        for (int i=0; i<k; i++) {
            fraction[i].print();
            System.out.print(", ");
        }
        System.out.println("}");
    }
}

class Fraction{
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void print(){
        System.out.print(numerator + "/" + denominator);
    }
}


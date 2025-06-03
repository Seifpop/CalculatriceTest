package com.formation;

public class Calculatrice {

    public int additionner(int a, int b) {
        return a + b;
    }
    public int sousstraire(int a, int b) {
        return a - b;
    }

    public double divisionner(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }


}

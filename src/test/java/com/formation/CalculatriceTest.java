package com.formation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatriceTest {

    @Test
    public void testAdditionner() {
        Calculatrice calculatrice = new Calculatrice();
        Assertions.assertEquals(5, calculatrice.additionner(2, 3));
    }

    @ParameterizedTest
    @CsvSource({
        "8,5,3",
        "3,5,-2",
    })
    public void testSoustraire(int a, int b, int expected) {
        Calculatrice calculatrice = new Calculatrice();
        Assertions.assertEquals(expected, calculatrice.sousstraire(a, b));

    }

    @Test
    public void testDivisionner() {
        Calculatrice calculatrice = new Calculatrice();
        Assertions.assertEquals(2.0, calculatrice.divisionner(10, 5));

    }

    @Test
    public void testDivisionneurParZero() {
        Calculatrice calculatrice = new Calculatrice();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculatrice.divisionner(10, 0);
        });
    }
}
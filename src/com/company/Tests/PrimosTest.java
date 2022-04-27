package com.company.Tests;

import com.company.Primos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {

    int[] vacio = new int[0];
    int[] uno = {2};
    int[] cien = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    @Test
    void generarPrimos_100() {
        Primos primosClase = new Primos(100);
        assertArrayEquals(cien, primosClase.generarPrimos());
    }

    @Test
    void generarPrimos_vacio_1() {
        Primos primosClase = new Primos(1);
        assertArrayEquals(vacio, primosClase.generarPrimos());
    }
    @Test
    void generarPrimos_vacio_0() {
        Primos primosClase = new Primos(0);
        assertArrayEquals(vacio, primosClase.generarPrimos());
    }
    @Test
    void generarPrimos_1() {
        Primos primosClase = new Primos(2);
        assertArrayEquals(uno, primosClase.generarPrimos());
    }
}

package com.company.Tests;

import com.company.Primos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {

    @Test
    void generarPrimos() {
        int numeroMaximo = 40;
        Primos primosClase = new Primos(numeroMaximo);
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
        int[] primosMetodo = primosClase.generarPrimos();

        assertArrayEquals(primos, primosMetodo);
    }
}
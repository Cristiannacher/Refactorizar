package com.company;

public class Primos {

    private int max;

    public Primos(int max) {
        this.max = max;
    }

    public boolean[] iniciaArray(int dim) {
        boolean[] esPrimo = new boolean[dim];
        for (int i = 0; i < dim; i++) {
            esPrimo[i] = true;
        }
        return esPrimo;
    }

    public boolean[] comprovarPrimos(int dim, boolean[] esPrimo) {
        for (int i = 2; i < Math.sqrt(dim) + 1; i++) {
            if (esPrimo[i]) {
                for (int j = 2 * i; j < dim; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
        return esPrimo;
    }

    public int cuentaPrimos(int dim, boolean[] esPrimo) {
        int cuenta = 0;
        for (int i = 0; i < dim; i++) {
            if (esPrimo[i]) {
                cuenta++;
            }
        }
        return cuenta;
    }

    public int[] rellenaVectorDePrimos(int dim, int numPrimos, boolean[] esPrimo){
        int[] primos= new int[numPrimos];
        for (int i = 0, j = 0; i < dim; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }
        return primos;
    }

    public int[] generarPrimos() {
        if (max >= 2) {
            int dim = max + 1;
            boolean[] esPrimo = iniciaArray(dim);
            esPrimo[0] = esPrimo[1] = false;
            esPrimo = comprovarPrimos(dim, esPrimo);
            return rellenaVectorDePrimos(dim,cuentaPrimos(dim,esPrimo),esPrimo);
        } else {
            return new int[0];
        }
    }
}
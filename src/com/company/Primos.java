package com.company;

/**
 * Esta clase sirve para generar todods los numeros primos
 * hasta un numero maximo que tu elejiges
 * @Autor Cristian Nacher Collado
 * @Version Documentada
 */

public class Primos {

    private int max;

    public Primos(int max) {
        this.max = max;
    }

    /**
     * El metodo rellena un array booleana
     * @param dim nos dice el tamaño del array
     * @return nos devulve la array booleana llena
     */
    public boolean[] iniciaArray(int dim) {
        boolean[] esPrimo = new boolean[dim];
        for (int i = 0; i < dim; i++) {
            esPrimo[i] = true;
        }
        return esPrimo;
    }

    /**
     * El metodo nos comprueba los numeros primos hasta el numero que le pasemos
     * y nos devulve una array booleana con las posiciones marcadas con un true si
     * son primos.
     * @param dim nos marcha el numero maximo hasta el que tenemos que comprovar los primos
     * @param esPrimo es una array booleana para marcar los numeros primos
     * @return nos devuelve la array booleana con los primos marcados
     */
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

    /**
     * El metodo nos cuenta el numero de primos que tenemos
     * @param dim nos sirve para saber quando parar el bucle en el metodo
     * @param esPrimo es la array donde tenemos los primos marcados
     * @return nos devuelve un int con el numero de primos
     */
    public int cuentaPrimos(int dim, boolean[] esPrimo) {
        int cuenta = 0;
        for (int i = 0; i < dim; i++) {
            if (esPrimo[i]) {
                cuenta++;
            }
        }
        return cuenta;
    }

    /**
     * El metodo nos crea una array de ints con los primos que hay hasta el numero
     * maximo que le pasamos
     * @param dim nos marca el numero maximo para saber cuando parar el bucle
     * @param numPrimos nos sirver para saber el tamaño del array que rellenaremos de
     *                  primos (lo hemos sacado en el metodo anterior)
     * @param esPrimo es el array de booleanos que nos marca los numero primos
     * @return nos devuelve una array de ints con los numeros primos
     */
    public int[] rellenaVectorDePrimos(int dim, int numPrimos, boolean[] esPrimo){
        int[] primos= new int[numPrimos];
        for (int i = 0, j = 0; i < dim; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }
        return primos;
    }

    /**
     * Este metodo basicamente junta todos los metodos anteriores para que dado el numero
     * maximo nos devuelva una array con los numeros primos
     * @return nos devuelve una array con los numeros primos.
     */

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
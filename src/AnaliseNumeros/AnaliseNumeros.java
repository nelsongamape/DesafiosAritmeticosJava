package AnaliseNumeros;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int contNegativos = 0;
        int contPositivos = 0;
        int contPares = 0;
        int contImpares = 0;

        for (int i = 0; i < 5; i++) {
            int valor = leitor.nextInt();

            if (valor < 0) {
                contNegativos++;
            } else {
                contPositivos++;
            }

            if (valor % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
            if (valor == 0) {
                contPositivos--;
            }
        }

        System.out.println(contPares + " par(es)");
        System.out.println(contImpares + " impar(es)");
        System.out.println(contPositivos + " positivo(s)");
        System.out.println(contNegativos + " negativo(s)");
    }
}
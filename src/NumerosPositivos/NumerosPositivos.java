package NumerosPositivos;

import java.util.Scanner;

public class NumerosPositivos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int contador = 0;

        for (int i=0; i!=6; i++) {
            double valor = input.nextDouble();
            if (valor > 0) {
                contador++;
            }
        }
        System.out.println(contador + " valores positivos");
    }
}
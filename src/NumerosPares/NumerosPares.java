package NumerosPares;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorInteiro = input.nextInt();

        for (int par = 2; par <= valorInteiro; par += 2) {
            System.out.println(par);
        }
    }
}

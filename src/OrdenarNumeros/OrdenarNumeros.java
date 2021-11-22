package OrdenarNumeros;

import java.util.*;
import java.util.stream.Stream;

public class OrdenarNumeros {

    public static void main(String[] args) {

        System.out.println("Insira a qtde de valores a serem analisados: ");

        Scanner input = new Scanner(System.in);
        int qtde = input.nextInt();

        System.out.println("Insira os valores: ");

        List<Integer> valores = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        int i;
        for (i = 0; i < qtde; i++) {
            valores.add(input.nextInt());
        }
        input.close();

        Collections.sort(valores);

        for (i = 0; i < valores.size(); i++) {
            if (valores.get(i) % 2 == 0) {
                pares.add(valores.get(i));
            } else
                impares.add(valores.get(i));
        }

        for (int par : pares) {
            System.out.println(par);
        }

        Collections.reverse(impares);
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}

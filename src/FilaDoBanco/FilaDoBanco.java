package FilaDoBanco;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FilaDoBanco {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroDeClientes = input.nextInt();

        for (int i = 0; i < numeroDeClientes; i++) {
            int senhaSMS = input.nextInt();
            int contarMudanca = 0;
            int[] senhas = new int[senhaSMS];

            for (int j = 0; j < senhaSMS; j++) {
                int ordemChegada = input.nextInt();
                senhas[j] = ordemChegada;
            }

            int[] senhasordenadas = Arrays.stream(senhas).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

            for (int k = 0; k < senhasordenadas.length; k++) {
                if (senhasordenadas[k] == senhas[k]) contarMudanca++;
            }
            System.out.println(contarMudanca);

        }
    }
}
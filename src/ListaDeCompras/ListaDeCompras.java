package ListaDeCompras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class ListaDeCompras {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int linhas = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> lista = new LinkedHashSet<>();

        for (int i = 0; i < linhas; i++) {
            LinkedHashSet<String> set = new LinkedHashSet<>(List.of(br.readLine().split(" ")));
            var linha = set.stream().sorted().collect(Collectors.joining(" "));
            lista.add(linha);
        }
        lista.forEach(System.out::println);
    }
}
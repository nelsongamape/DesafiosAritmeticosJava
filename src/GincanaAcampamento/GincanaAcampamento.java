package GincanaAcampamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GincanaAcampamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        List<Jogador> jogadores = new ArrayList<>();
        var numJogadores = 0;

        while (!((numJogadores = input.nextInt()) == 0)) {

            jogadores.clear();
            int ficha;

            for (int i = 0; i < numJogadores; i++) {
                String[] entrada = input.next().split(" ");
                jogadores.add(new Jogador(entrada[0], Integer.parseInt(entrada[1])));
            }
            var jogadorCorrente = 0;
            ficha = jogadores.get(jogadorCorrente).getNumero();
            do {
                int resto = ficha % jogadores.size();
                int serahEliminado;

                if (ficha % 2 != 0) {
                    serahEliminado = jogadorCorrente + resto;
                    if (serahEliminado >= jogadores.size()) {
                        serahEliminado = serahEliminado - jogadores.size();
                    }
                } else {
                    serahEliminado = jogadorCorrente - resto;
                    if (serahEliminado < 0) {
                        serahEliminado = serahEliminado + jogadores.size();
                    }
                }

                ficha = jogadores.get(serahEliminado).getNumero();
                jogadores.remove(serahEliminado);
                /*
                Se eu removo o jogador da lista, o corrente, quando no sentido crescente
                deve ser um a menos
                 */
                if (ficha % 2 != 0) jogadorCorrente = serahEliminado - 1;
                else jogadorCorrente = serahEliminado;

                if (jogadorCorrente < 0) jogadorCorrente = jogadores.size() - 1;
                if (jogadorCorrente >= jogadores.size()) jogadorCorrente = 0;

            } while (jogadores.size() > 1);

            System.out.println("Vencedor(a): " + jogadores.get(0).getNome());
        }
    }
}

class Jogador {
    private final String nome;
    private Integer numero;

    Jogador(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }
}
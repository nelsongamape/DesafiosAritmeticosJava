package ListaDeUniformes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;


public class ListaDeUniformes {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String linha;
        Tshirt[] tshirts = new Tshirt[0];
        int N = 0;
        int index = 0;
        boolean firstCase = true;

        while (!(linha = read()).equals("0")) {

            if (firstCase) {
                N = toInt(linha);
                tshirts = new Tshirt[N];
                firstCase = false;
            } else {
                if(linha.contains("branco") || linha.contains("vermelho"))
                {
                    var colorsize = linha.split(" ");
                    tshirts[index].setColor(colorsize[0]);
                    tshirts[index].setSize(colorsize[1]);
                    index++;
                }
                else
                {
                    tshirts[index] = new Tshirt(null, null, linha);
                }
            }
        }

        Comparator<Tshirt> byAge = Comparator.comparing(Tshirt::getColor);
        Comparator<Tshirt> bySize = Comparator.comparing(Tshirt::getSize).reversed();
        Comparator<Tshirt> byName = Comparator.comparing(Tshirt::getOwner);

        Arrays.sort(tshirts, byAge.thenComparing(bySize).thenComparing(byName));

        for (int i = 0; i < N; i++) {
            out.println(tshirts[i].toString());
        }

        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}

class Tshirt {

    private String size;
    private String color;
    private final String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}
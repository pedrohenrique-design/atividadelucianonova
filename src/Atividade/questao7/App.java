package Atividade.questao7;

import java.util.HashSet;

public class App {
    static void main() {

        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(40);

        System.out.println("conjunto: " + numeros);
        System.out.println("numeros: " + numeros.size());
        System.out.println("Retorno do add(10): " + numeros.add(10));
    }
}

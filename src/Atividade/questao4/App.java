package Atividade.questao4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    static void main() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(42);
        numeros.add(7);
        numeros.add(19);
        numeros.add(3);
        numeros.add(25);

        Collections.sort(numeros);
        System.out.println("Crecentes" + numeros);
        Collections.sort(numeros , Collections.reverseOrder());
        System.out.println("decresentes" + numeros);
    }
}

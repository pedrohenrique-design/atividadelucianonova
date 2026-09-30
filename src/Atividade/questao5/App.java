package Atividade.questao5;

import java.util.LinkedList;

public class App {
    static void main() {
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        numeros.addFirst(0);
        numeros.addLast(6);

        System.out.println("lista: " + numeros);
        System.out.println("primeiro: " + numeros.getFirst());
        System.out.println("ultimo                             : " + numeros.getLast());
    }
}

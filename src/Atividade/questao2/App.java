package Atividade.questao2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    static void main() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        Iterator<Integer> iterador = numeros.iterator();
        while (iterador.hasNext()){
            Integer numero = iterador.next();

            if (numero == 30){
                iterador.remove();
            }
        }
    }
}

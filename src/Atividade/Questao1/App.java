package Atividade.Questao1;

import java.util.ArrayList;
import java.util.List;

public class App {
    static void main() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        for (Integer numero : numeros){
            System.out.println(numero);
        }

    }
}

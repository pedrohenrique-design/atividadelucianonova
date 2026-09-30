package Atividade.questao3;

import java.util.ArrayList;
import java.util.List;

public class App {
    static void main() {
        List<String> frutas = new ArrayList<>();
        frutas.add("maca");
        frutas.add("banana");
        frutas.add("morango");
        frutas.add("abacaxi");
        for (String fruta : frutas){
            if (fruta.equalsIgnoreCase("banana")){
                System.out.println("achei a banana");

            if (fruta.equalsIgnoreCase("uva")){
                System.out.println("nao achei a uva");
            }
            }
        }
    }
}

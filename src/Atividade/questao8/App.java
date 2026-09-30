package Atividade.questao8;

import java.util.HashSet;
import java.util.Iterator;

public class App {
    static void main() {
        HashSet<String> cidades = new HashSet<>();

        cidades.add("Recife");
        cidades.add("Natal");
        cidades.add("Salvador");
        cidades.add("Fortaleza");
        cidades.add("São Luís");

        for (String cidade : cidades){
            System.out.println("cidade: " + cidade);
        }

        Iterator<String> iterator = cidades.iterator();

        while (iterator.hasNext()) {
            String cidade = iterator.next();

            if (cidade.startsWith("S")) {
                iterator.remove();
            }
        }

        System.out.println("Restantes: " + cidades);



    }
}

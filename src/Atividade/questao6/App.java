package Atividade.questao6;

import Atividade.pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    static void main() {
        List<pessoa> pessoas = new ArrayList<>();
        pessoas.add(new pessoa("pedro" , "534" , 23));
        pessoas.add(new pessoa("joao" , "536" , 43));
        pessoas.add(new pessoa("maria" , "531" , 13));
        pessoas.add(new pessoa("carlos" , "541" , 73));

        pessoas.sort(Comparator.comparingInt(pessoa::getIdade));
        System.out.println("por idade: ");
        System.out.println(pessoas);

        pessoas.sort(Comparator.comparing(pessoa::getNome));

        System.out.println("por nome: ");
        System.out.println(pessoas);
    }
}

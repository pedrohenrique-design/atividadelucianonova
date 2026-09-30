package Atividade.questao14;

import Atividade.pessoa;

import java.util.HashMap;


public class App {

    public static void main(String[] args) {

        HashMap<String, pessoa> pessoas = new HashMap<>();

        pessoa ana = new pessoa("Ana", "111.111.111-11", 25);
        pessoa bruno = new pessoa("Bruno", "222.222.222-22", 19);
        pessoa carla = new pessoa("Carla", "333.333.333-33", 30);

        pessoas.put(ana.cpf, ana);
        pessoas.put(bruno.cpf, bruno);
        pessoas.put(carla.cpf, carla);


        for (var entrada : pessoas.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

        pessoa pessoa = pessoas.get("222.222.222-22");
        System.out.println("Busca: " + pessoa);


        pessoa bruna = new pessoa("Bruna", "222.222.222-22", 20);

        pessoa anterior = pessoas.put(bruna.cpf, bruna);

        System.out.println("Put retornou: " + anterior);
        System.out.println("Tamanho do mapa: " + pessoas.size());

    }
}

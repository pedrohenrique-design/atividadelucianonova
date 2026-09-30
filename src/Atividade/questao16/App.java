package Atividade.questao16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class App {

    List<String> nomes = Arrays.asList("Ana", "Bruno", "Ana", "Carla", "Bruno", "Diego");
    List<String> resultado = new ArrayList<>(new LinkedHashSet<>(nomes));
}

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args)  {
        //Dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6], faça:
        System.out.println("Crie um conjunto e adicione as notas:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas);

        System.out.println("Confira se a nota5 está no conjunto: " + notas.contains(5.0));
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.print("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + soma/notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);

        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next < 7.0) iterator2.remove();
        }
        System.out.println(notas);
        
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        //Set<Double> notas2 = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        
        System.out.println(notas2);

        System.out.println("Exiba todas as notas nas ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto:");
        notas.clear();
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        
    }
}

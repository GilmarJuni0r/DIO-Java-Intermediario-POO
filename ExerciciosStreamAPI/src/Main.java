import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> numerosAleatorios = 
            Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

            System.out.println("Imprima todos os elementos dessa lista de String:");
            numerosAleatorios.forEach(System.out::println);
            /*numerosAleatorios.stream().forEach(new Consumer<String>() {

                @Override
                public void accept(String t) {
                    System.out.print(t+" ");
                }                
            });;*/

            System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set:");
            /*numerosAleatorios.stream().limit(5).collect(Collectors.toSet())
            .forEach(System.out::println);;*/

            System.out.println("\nTransforme esta lista de Strings em uma lista de números inteiros:");
            //numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList())
            //.forEach(System.out::println);

            /*numerosAleatorios.stream()
            .map(new Function<String,Object>() {

                @Override
                public Object apply(String t) {
                    // TODO Auto-generated method stub
                    return Integer.parseInt(t);
                }
                
            });*/

            System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista:");
            List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .filter(i -> (i %2 == 0 && i > 2))/* .filter(new Predicate<Integer>() {

                @Override
                public boolean test(Integer t) {
                    if(t %2 == 0 && t > 2) return true;

                    return false;
                }})*/
            .collect(Collectors.toList());
            System.out.println(listParesMaioresQue2);
            
            System.out.println("\nMostre a média dos números:");
            numerosAleatorios.stream()
            .mapToInt(Integer::parseInt)
            .average().ifPresent(System.out::println);
            
            System.out.println("\nRemova os valores impares:");
            List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt)
            .collect(Collectors.toList());
            numerosAleatoriosInteger.removeIf(i -> (i %2 != 0));
            System.out.println(numerosAleatoriosInteger);
                


    }
}

import java.util.Arrays;
import java.util.Scanner;

public class DiferencaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

        // TODO: Retorne a diferença entre o produto e a soma dos dígitos.
        int produto = ints[0];
        int soma = ints[0];
        for (int i = 1; i != ints.length; i++) {
            produto *= ints[i];
            soma += ints[i];
        }
        System.out.println(produto - soma);
    }
}
/*
 * Desafio
 * O desafio consiste em um número inteiro n, onde será necessário
 * calcular a diferença entre o produto e a soma dos seus digitos.
 * 
 * Entrada
 * • Para encontrar o produto do valor, os dígitos deverão ser multiplicados.
 * 
 * • A soma, basta realizar uma adição entre os dígitos.
 * 
 * • A diferença, é necessário substrair o resultado final dos dois valores.
 * 
 * Saída
 * A saída deverá retornar o valor final da diferença
 * entre o produto e a soma dos digitos.
 */
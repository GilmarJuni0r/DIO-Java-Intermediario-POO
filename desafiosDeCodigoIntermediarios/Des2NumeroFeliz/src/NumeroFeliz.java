import java.util.*;

public class NumeroFeliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // TODO: Desenvolva um algoritmo que retorne se o número é feliz ou não
        int soma = 0;
        int aux = n;

        while (aux > 9) {
            while (aux > 0) {
                int mod = aux % 10;
                soma += (int) Math.pow(mod, 2);
                aux = aux / 10;
            }
            aux = soma;
            soma = 0;
        }
        if (aux == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
/*Desafio
Um número feliz é um número definido pelo seguinte processo:

• Começando com qualquer número inteiro positivo, substitua o 
número pela soma dos quadrados de seus dígitos.
• Repita o processo até que o número seja igual a 1 (onde ficará),
 ou faça um loop infinito em um ciclo que não inclua 1.
• Aqueles números para os quais esse processo termina em 1 são felizes.
• Retorna true se n for um número feliz e false se não for.

Escreva um algoritmo para determinar se o número n é feliz.

Entrada
A entrada será feita por um número inteiro, correpondente ao valor de 
entrada para verificar se  o número é feliz ou não.

Saída
Retorne true, caso o número seja feliz, e retorne false, 
caso o número não seja feliz. */
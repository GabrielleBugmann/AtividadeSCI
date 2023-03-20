import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UmJava {
    public static void main(String[] args) {
        //solicitar a inserção de 5 números, ao final, imprimir os números pares, números ímpares e a média geral desses números

        Scanner scan = new Scanner(System.in);

        int numero;
        List<Integer> numeroPar = new ArrayList<>();
        List<Integer> numeroImpar = new ArrayList<>();
        double media;
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma = numero + soma;

            if (numero %2== 0) {
                numeroPar.add(numero);
            } else {
                numeroImpar.add(numero);
            }
        }
        media = soma / 5;

        System.out.println("Números pares: " + numeroPar);
        System.out.println("Números ímpares: " + numeroImpar);
        System.out.println("Média: " + media);

    }
}
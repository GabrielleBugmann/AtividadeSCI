import java.util.Scanner;

public class QuatroJava {
    public static void main(String[] args) {
        //criar um vetor de 5 posições, solicitar 5 números e ao fim, imprimir o valor apresentado na posição 3.

        Scanner scan = new Scanner(System.in);

        int numero[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            numero[i] = scan.nextInt();


        }
        System.out.println("Terceira posição do vetor: " + numero[2]);

    }
}

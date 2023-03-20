import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoisJava {
    public static void main(String[] args) {
        //Solicitar 5 números, ao fim, imprimir o número maior e o número menor

        Scanner scan = new Scanner(System.in);

        int numero;
        int numeroMaior = 0;
        int numeroMenor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (i == 0) {
                numeroMaior = numero;
                numeroMenor = numero;
            }

            if (numero > numeroMaior) {
                numeroMaior = numero;
            }

            if (numero < numeroMenor) {
                numeroMenor = numero;
            }

        }

        System.out.println("Número Maior: " + numeroMaior);
        System.out.println("Número Menor: " + numeroMenor);
    }
}

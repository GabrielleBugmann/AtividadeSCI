import java.util.Scanner;

public class CincoJava {
    public static void main(String[] args) {
        // Crie uma matriz bidimensional. Deverá ser solicitado três nomes de alunos e quatro notas, após solicitação
        // dos nomes e das notas deverá ser impresso os nomes acompanhados da média geral de cada aluno, deverá ser
        // impresso também o nome do aluno que obteve a maior média e o nome do aluno que obteve a menor média.

        Scanner scan = new Scanner(System.in);

        String nomes[] = new String[3];
        double notas[] = new double[4];
        double media1 = 0;
        double media2 = 0;
        double media3 = 0;

        double maior = 0;
        double menor = 0;

        for (int i =0; i< 3; i++) {
            System.out.println("Digite nome do aluno");
            nomes[i] = scan.next();
            for (int j = 0; j< 4; j++) {
                System.out.println("Digite a nota do aluno");
                notas[j] = scan.nextInt();
            }
                if (i == 0) {
                    double soma = notas[0] + notas[1] + notas[2] + notas[3];
                    media1 = soma / 4;
                    maior = media1;
                    menor = media1;
                    if (media1 > maior) {
                        maior = media1;
                    }
                    if (media1 < menor) {
                        menor = media1;
                    }
                }
                if (i == 1) {
                    double soma = notas[0] + notas[1] + notas[2] + notas[3];
                    media2 = soma / 4;
                    if (media2 > maior) {
                        maior = media2;
                    }
                    if (media2 < menor) {
                        menor = media2;
                    }
                }
                if (i == 2) {
                    double soma = notas[0] + notas[1] + notas[2] + notas[3];
                    media3 = soma / 4;
                    if (media3 > maior) {
                        maior = media3;
                    }
                    if (media3 < menor) {
                        menor = media3;
                    }
                }

        }

        System.out.println("Aluno " + nomes[0]);
        System.out.println("Média " + media1);

        System.out.println("Aluno " + nomes[1]);
        System.out.println("Média " + media2);

        System.out.println("Aluno " + nomes[2]);
        System.out.println("Média " + media3);

        if (media1 == maior) {
            System.out.println("Aluno com maior média é " + nomes[0]);
        }
        if (media2 == maior) {
            System.out.println("Aluno com maior média é " + nomes[1]);
        }
        if (media3 == maior) {
            System.out.println("Aluno com maior média é " + nomes[2]);
        }

        if (media1 == menor) {
            System.out.println("Aluno com menor média é " + nomes[0]);
        }
        if (media2 == menor) {
            System.out.println("Aluno com menor média é " + nomes[1]);
        }
        if (media3 == menor) {
            System.out.println("Aluno com menor média é " + nomes[2]);
        }
    }
}

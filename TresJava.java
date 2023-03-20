import java.sql.SQLOutput;
import java.util.Scanner;

public class TresJava {
    public static void main(String[] args) {
        //Elabore um programa de computador que realize o cálculo de notas. Este programa deverá solicitar o nome do
        // aluno e quatro notas, todo este conjunto deverá estar contido em um laço que confirme se deseja encerrar o
        // programa ou continuar solicitando outros nomes e notas. Ao final da solicitação do nome e das notas deverá
        // ser impresso o nome do aluno e sua média, se a nota for menor que 6 imprimir Reprovado, senão, se a nota for
        // igual ou maior que 6, imprimir Aprovado

        Scanner scan = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;

        double media;
        String nome = "";

        int count = 0;

        while (count != 5) {
            System.out.println("-----Opções-----");
            System.out.println("1 - Digitar Nome");
            System.out.println("2 - Digitar Notas");
            System.out.println("3 - Solicitar Média");
            System.out.println("4 - Continuar");
            System.out.println("5 - Sair");
            count = scan.nextInt();


            if (count == 1) {
                if (nome.equals("")) {
                    System.out.println("Digitar nome do aluno");
                    nome = scan.next();
                } else {
                    System.out.println("Já existe um nome informado");
                }
            }
            if (count == 2) {
                System.out.println("Digitar nota 1: ");
                nota1 = scan.nextDouble();
                System.out.println("Digitar nota 2: ");
                nota2 = scan.nextDouble();
                System.out.println("Digitar nota 3: ");
                nota3 = scan.nextDouble();
                System.out.println("Digitar nota 4: ");
                nota4 = scan.nextDouble();
            }
            if (count == 3) {
                if (!nome.equals("")) {
                    double soma = nota1 + nota2 + nota3 + nota4;
                    media = soma / 4;

                    if (media >= 6) {
                        System.out.println("Nome do Aluno: " + nome);
                        System.out.println("Média do Aluno: " + media);
                        System.out.println("Situação do Aluno: Aprovado");
                    } else {
                        System.out.println("Nome do Aluno: " + nome);
                        System.out.println("Média do Aluno: " + media);
                        System.out.println("Situação do Aluno: Reprovado");
                    }
                } else {
                    System.out.println("Informar notas e/ou nome do aluno");
                }

            }

            if (count == 4) {
                System.out.println("Limpando dados...");
                nome = "";
                nota1 = 0;
                nota2 = 0;
                nota3 = 0;
                nota4 = 0;
                media = 0;
            }

            //salvar nota 1 a 4
            //salvar nome
            // solicitar média + aprovado/reprovado
            //continuar
            //cancelar
        }

    }
}

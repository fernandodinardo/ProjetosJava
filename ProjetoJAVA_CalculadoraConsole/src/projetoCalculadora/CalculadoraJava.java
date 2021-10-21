package projetoCalculadora;

import java.util.Scanner;

/**
 *
 * @author fdinardo
 */
public class CalculadoraJava {

    //metodo 1 == Somar
    public int realizarSoma(int num1, int num2) {
        return num1 + num2;
    }

    //metodo 2 == Subtratir
    public int realizarSubtracao(int num1, int num2) {
        return num1 - num2;
    }

    //metodo 3 == Dividir
    public int realizarDivisao(int num1, int num2) {
        return num1 / num2;
    }

    //metodo 4 == Multiplicar
    public int realizarMultiplica(int num1, int num2) {
        return num1 * num2;
    }

    //metodo 5 == Numero elevado ao quadrado
    public int realizarElevaQuadrado(int num1) {
        return num1 * num1;
    }

    public static void main(String args[]) {

        //criando um objeto a partir do metodo Calculadora_Java
        CalculadoraJava obj = new CalculadoraJava();

        //declarando as varíaveis
        int opcao;
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        System.out.println("---Escolha uma opção---");
        System.out.println("1- Soma");
        System.out.println("2- Subtracao");
        System.out.println("3- Divisao");
        System.out.println("4- Multiplicacao");
        System.out.println("5- Elevar o Numero ao Quadrado");
        System.out.println("0- Encerrar e Sair");
        System.out.println("");
        System.out.print("Digite a Operação: ");

        opcao = input.nextInt();

        while (opcao != 0) {

            if (opcao == 1) {

                Scanner input1 = new Scanner(System.in);

                System.out.println("Informe o primeiro numero: ");
                num1 = input1.nextInt();
                System.out.println("Informe o segundo numero: ");
                num2 = input1.nextInt();

                int operacao = obj.realizarSoma(num1, num2);
                System.out.println(operacao);

                break;
            } else if (opcao == 2) {

                Scanner input1 = new Scanner(System.in);

                System.out.println("Informe o primeiro numero: ");
                num1 = input1.nextInt();
                System.out.println("Informe o segundo numero: ");
                num2 = input1.nextInt();

                int operacao = obj.realizarSubtracao(num1, num2);
                System.out.println(operacao);

                break;
            } else if (opcao == 3) {

                Scanner input1 = new Scanner(System.in);

                System.out.println("Informe o primeiro numero: ");
                num1 = input1.nextInt();
                System.out.println("Informe o segundo numero: ");
                num2 = input1.nextInt();

                int operacao = obj.realizarDivisao(num1, num2);
                System.out.println(operacao);

                break;
            } else if (opcao == 4) {

                Scanner input1 = new Scanner(System.in);

                System.out.println("Informe o primeiro numero: ");
                num1 = input1.nextInt();
                System.out.println("Informe o segundo numero: ");
                num2 = input1.nextInt();

                int operacao = obj.realizarMultiplica(num1, num2);
                System.out.println(operacao);

                break;
            } else if (opcao == 5) {

                Scanner input1 = new Scanner(System.in);

                System.out.println("Informe um numero: ");
                num1 = input1.nextInt();

                int operacao = obj.realizarElevaQuadrado(num1);
                System.out.println(operacao);

                break;

            } else {

                System.out.println("Encerrar");
                break;
            }
        }
    }
}

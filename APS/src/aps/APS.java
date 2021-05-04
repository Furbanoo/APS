package aps;

import java.util.Scanner;

public class APS {

    public static void continuar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPressione uma tecla para continuar...");
        scanner.nextLine();
    }

    public static void main(String args[]) {

        int arvore = 0, veiculo = -1, kmMes, kmTotal = -1, viagem;
        Scanner scanner = new Scanner(System.in);

        while (arvore <= 0) {

            System.out.println("Faça uma simulação e veja os benefício de plantar árvores!");
            System.out.print("Quantas árvores você deseja plantar? ");
            arvore = scanner.nextInt();

            if (arvore <= 0) {
                System.out.println("Não é possível plantar " + arvore + " árvores. Tente novamente");
            } else {
                Oxigenio.Calcular(arvore);
                continuar();
            }
        }

        while (veiculo < 0 || veiculo > 4) {

            System.out.println("Faça uma simulação e veja o quanto de gás carbônico é liberado por mês através do veículo!");
            System.out.println("Qual é a categoria do seu veículo?");
            System.out.println("0 - Não utilizo veículo\n"
                    + "1 - Pequeno (até 1.4)\n"
                    + "2 - Médio (de 1.5 até 2.0)\n"
                    + "3 - Grande (maior que 2.0)\n"
                    + "4 - Motocicleta\n");
            System.out.print("Resposta: ");
            veiculo = scanner.nextInt();
            if (veiculo < 0 || veiculo > 4) {
                System.out.println(veiculo + " não é uma opção válida. Tente novamente");
            } else if (veiculo == 0) {
                System.out.println("Ok, você não utiliza veículo.");
                continuar();
            } else {
                System.out.print("Quantos KM você anda com o seu veículo por mês? ");
                kmMes = scanner.nextInt();
                Veiculo.Calcular(veiculo, kmMes, arvore);
                continuar();
            }
        }

        while (kmTotal < 0) {

            System.out.println("Digamos que você irá viajar utilizando o transporte aéreo.");
            System.out.println("É uma viagem nacional ou internacional?\n"
                    + "1 - Nacional\n"
                    + "2 - Internacional");
            System.out.print("Resposta: ");
            viagem = scanner.nextInt();
            if (viagem == 1 | viagem == 2) {
                System.out.print("Quantos KM será necessário para realizar a viagem? (ida e volta) :");
                kmTotal = scanner.nextInt();
                if (kmTotal <= 0) {
                    System.out.println(kmTotal + " não é uma opção válida. Tente novamente");
                } else {
                    Viagem.Calcular(viagem, kmTotal, arvore);
                    continuar();
                }

            } else {
                System.out.println("Opção inválida, tente novamente");
            }

        }

        Arvore.Mensagem(arvore);

        System.out.println("\nTodos os cálculos foram realizado com base em fontes confiáveis");
        System.out.println("Fim do Programa!");

    }
}

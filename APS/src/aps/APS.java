package aps;

import java.util.Scanner;

public class APS {

    public static void main(String args[]) {
        
        int arvore;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Faça uma simulação e veja os benefício de plantar árvores!");
        System.out.print("Quantas árvores você deseja plantar? ");
        arvore = scanner.nextInt();

        if (arvore <= 0) {
            System.out.println("Não é possível plantar " + arvore + " árvores. Tente novamente");
        } else {
            Oxigenio.Calcular(arvore);
            System.out.println("\nPressione uma tecla para continuar...");
            scanner.nextLine();
            Energia.Calcular(arvore);
        }

    }

}

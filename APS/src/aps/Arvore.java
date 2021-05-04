package aps;

public class Arvore {

    public static void Mensagem(int arvore) {
        System.out.println("É impossível de se calcular a quantidade de animais que irá se usufruir dos benefícios de uma árvore.");
        System.out.println("Os passáros que irão fazer os seus ninhos, insetos irão retirar o seu alimento da árvore, animais terrestre poderão se alimentar dos frutos das árvores.");
        System.out.println("\nUma curiosidade interessante:");
        System.out.println("Por meio de ONGs especializadas, é possível plantar uma árvore com cerca de R$20.00!");
        Calcular(arvore);
        System.out.println("Para plantar as " + arvore + " árvores do início da simulação, será necessário R$" + getValorReal());
    }

    private static void Calcular(int arvore) {

        setValorReal(arvore * 20);

    }

    public static int getValorReal() {
        return valorReal;
    }

    public static void setValorReal(int aValorReal) {
        valorReal = aValorReal;
    }

    private static int valorReal;

}

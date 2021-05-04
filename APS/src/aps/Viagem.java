package aps;

public class Viagem {

    public static void Calcular(int viagem, int kmTotal, int arvore) {
        if (viagem == 1) {
            setNomeViagem("Viagem Nacional");
            setEmissaoCarbono(0.100188);
        } else {
            setNomeViagem("Viagem Internacional");
            setEmissaoCarbono(0.112465);
        }

        setTotalEmissao(kmTotal * getEmissaoCarbono());
        setEmissaoTonelada(getTotalEmissao() / 1000);
        setArvoresNecessarias((int) Math.ceil(getEmissaoTonelada() * 7.14));

        Mensagem(arvore, kmTotal);

    }

    private static void Mensagem(int arvore, int kmTotal) {
        System.out.println("Ao realizar uma " + getNomeViagem() + " e viajar por " + kmTotal + "km");
        System.out.println("É emitido um total de " + getEmissaoTonelada() + " t de gás carbônico(CO²)");
        System.out.println("Para compensar isso é necessário plantar " + getArvoresNecessarias() + " árvores");
        if (getArvoresNecessarias() > arvore) {
            System.out.println("Parece que as " + arvore + " árvores plantadas anteriormente não será suficiente para compensar essa emissão de CO2.");
        } else {
            System.out.println("Com as " + arvore + " árvores plantadas anteriormente será suficiente para compensar essa emissão de CO2.");
        }
    }

    public static String getNomeViagem() {
        return nomeViagem;
    }

    public static void setNomeViagem(String aNomeViagem) {
        nomeViagem = aNomeViagem;
    }

    public static double getEmissaoCarbono() {
        return emissaoCarbono;
    }

    public static void setEmissaoCarbono(double aEmissaoCarbono) {
        emissaoCarbono = aEmissaoCarbono;
    }

    public static double getTotalEmissao() {
        return totalEmissao;
    }

    public static void setTotalEmissao(double aTotalEmissao) {
        totalEmissao = aTotalEmissao;
    }

    public static double getEmissaoTonelada() {
        return emissaoTonelada;
    }

    public static void setEmissaoTonelada(double aEmissaoTonelada) {
        emissaoTonelada = aEmissaoTonelada;
    }

    public static double getArvoresNecessarias() {
        return arvoresNecessarias;
    }

    public static void setArvoresNecessarias(double aArvoresNecessarias) {
        arvoresNecessarias = aArvoresNecessarias;
    }

    private static String nomeViagem;
    private static double emissaoCarbono;
    private static double totalEmissao;
    private static double emissaoTonelada;
    private static double arvoresNecessarias;

}

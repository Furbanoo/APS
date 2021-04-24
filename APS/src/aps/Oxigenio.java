package aps;

public class Oxigenio {

    public static void Calcular(int arvore) {
        setOxigenioDia((float) (arvore * 0.325)); // uma árvore produz cerca de 0,32kg de oxigenio por dia.
        setOxigenioMes(getOxigenioDia() * 30); // quantidade de dias em um mês.
        setOxigenioAno(getOxigenioMes() * 12); // quantidade de meses em um ano.
        setQtdePessoa((int) Math.ceil(getOxigenioAno() / 11.7)); // 11,7kg é a quantidade de oxigenio consumido por 1 pessoa no ano.
        setGasCarbonico(arvore * 22); //uma árvore absorve 22kg de dióxido de carbono (gás carbônico).
        Mensagem(arvore);
    }

    public static void Mensagem(int arvore) {

        System.out.println("Ao plantar " + arvore + " árvores."
                + "\nIrá se produzir aproximadamente " + getOxigenioDia() + "kg de oxigênio por dia,"
                + "\n" + getOxigenioMes() + "kg de oxigênio por mês,"
                + "\n" + getOxigenioAno() + "kg de oxigênio por ano.");
        System.out.println("Isso equivale a oxigênio suficiente para " + getQtdePessoa() + " pessoas no ano.");
        System.out.println(arvore + " árvores é capaz de absorver " + getGasCarbonico() + "kg de dióxido de carbono");

    }

    public static float getGasCarbonico() {
        return gasCarbonico;
    }

    public static void setGasCarbonico(float aGasCarbonico) {
        gasCarbonico = aGasCarbonico;
    }

    public static int getQtdePessoa() {
        return qtdePessoa;
    }

    public static void setQtdePessoa(int aQtdePessoa) {
        qtdePessoa = aQtdePessoa;
    }

    public static float getOxigenioDia() {
        return oxigenioDia;
    }

    public static void setOxigenioDia(float aOxigenioDia) {
        oxigenioDia = aOxigenioDia;
    }

    public static float getOxigenioMes() {
        return oxigenioMes;
    }

    public static void setOxigenioMes(float aOxigenioMes) {
        oxigenioMes = aOxigenioMes;
    }

    public static float getOxigenioAno() {
        return oxigenioAno;
    }

    public static void setOxigenioAno(float aOxigenioAno) {
        oxigenioAno = aOxigenioAno;
    }

    private static float oxigenioDia;
    private static float oxigenioMes;
    private static float oxigenioAno;
    private static int qtdePessoa;
    private static float gasCarbonico;

}

package aps;

public class Veiculo {

    public static void Calcular(int veiculo, int kmMes, int arvore) {
        switch (veiculo) {
            case 1:
                setCategoriaVeiculo("Veículo Pequeno");
                setEmissaoCarbono(2184); // Emissão de carbono por km/mês de um veículo pequeno.
                break;
            case 2:
                setCategoriaVeiculo("Veículo Médio");
                setEmissaoCarbono(2579); // Emissão de carbono por km/mês de um veículo médio.
                break;
            case 3:
                setCategoriaVeiculo("Veículo Grande");
                setEmissaoCarbono(3571); // Emissão de carbono por km/mês de um veículo grande.
                break;
            default:
                setCategoriaVeiculo("Motocicleta");
                setEmissaoCarbono(1268); // Emissão de carbono por km/mês de uma motocicleta.
                break;
        }

        setTotalEmissao(kmMes * getEmissaoCarbono());
        setEmissaoTonelada(getTotalEmissao() / 1000000); //Transforma o total de emissão de CO2 obtido em toneladas.
        setArvoresNecessarias((int) Math.ceil(getEmissaoTonelada() * 7.14));

        Mensagem(arvore, kmMes);

    }

    private static void Mensagem(int arvore, int kmMes) {

        System.out.println("Ao utilizar um " + getCategoriaVeiculo() + " e andar " + kmMes + "km durante um mês");
        System.out.println("É emitido um total de " + getEmissaoTonelada() + "t de gás carbônico(CO²)");
        System.out.println("Para compensar isso é necessário plantar " + getArvoresNecessarias() + " árvores");
        if (getArvoresNecessarias() > arvore) {
            System.out.println("Parece que as " + arvore + " árvores plantadas anteriormente não será suficiente para compensar essa emissão de CO2.");
        } else {
            System.out.println("Com as " + arvore + " árvores plantadas anteriormente será suficiente para compensar essa emissão de CO2.");
        }
    }

    public static String getCategoriaVeiculo() {
        return categoriaVeiculo;
    }

    public static void setCategoriaVeiculo(String aCategoriaVeiculo) {
        categoriaVeiculo = aCategoriaVeiculo;
    }

    public static int getEmissaoCarbono() {
        return emissaoCarbono;
    }

    public static void setEmissaoCarbono(int aEmissaoCarbono) {
        emissaoCarbono = aEmissaoCarbono;
    }

    public static float getTotalEmissao() {
        return totalEmissao;
    }

    public static void setTotalEmissao(float aTotalEmissao) {
        totalEmissao = aTotalEmissao;
    }

    public static float getEmissaoTonelada() {
        return emissaoTonelada;
    }

    public static void setEmissaoTonelada(float aEmissaoTonelada) {
        emissaoTonelada = aEmissaoTonelada;
    }

    public static int getArvoresNecessarias() {
        return arvoresNecessarias;
    }

    public static void setArvoresNecessarias(int aArvoresNecessarias) {
        arvoresNecessarias = aArvoresNecessarias;
    }

    private static String categoriaVeiculo;
    private static int emissaoCarbono;
    private static float totalEmissao;
    private static float emissaoTonelada;
    private static int arvoresNecessarias;

}

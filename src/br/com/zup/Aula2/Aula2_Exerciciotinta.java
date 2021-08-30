package br.com.zup.Aula2;

public class Aula2_Exerciciotinta {
    public static void main(String[] args) {
        double tamanhoEmMetros = 500;
        double coberturaTintaPorLitro =  6;
        double lataTintaLitro = 18;
        double galaoTintaLitro = 3.6;
        double valorLataTinta = 80;
        double valorGalaoTinta = 25;
        double quantaTintaComprar;
        double quantidadeDeLatas;
        double quantidadeDeGalao;
        double folgaTinta = 0.1;
        double quantidadeDeTintaAComprasMaisFolga;
        double quantidadeComFolga;
        double valorEmGalão;
        double valorEmLata;
        double valorLitroLata;
        double valorLitroGalao;

        quantaTintaComprar = tamanhoEmMetros / coberturaTintaPorLitro;
        System.out.println("A quantidade de tinta a se comprar para " + tamanhoEmMetros + " metro é " + quantaTintaComprar + " Litros");

        quantidadeDeLatas = quantaTintaComprar / lataTintaLitro;
        System.out.println("A quantidade de latas de tinta de 18L necessarias sem 10% de folga são ");
        System.out.print (Math.ceil(quantidadeDeLatas));
        System.out.println("Latas");

        quantidadeDeGalao = quantaTintaComprar / galaoTintaLitro;
        System.out.println("A quantidade de galão de tinta de 3,6 litros necessários sem 10% de folga são ");
        System.out.print(Math.ceil(quantidadeDeGalao));
        System.out.println(" Galões");

        //Adicionando 10% na quantidade de tinta necessaria

        quantidadeDeTintaAComprasMaisFolga = ( tamanhoEmMetros / coberturaTintaPorLitro) * folgaTinta;
        System.out.println("Quantidade de tinta necessaria +10% é " + quantidadeDeTintaAComprasMaisFolga);

        quantidadeComFolga = quantidadeDeTintaAComprasMaisFolga + quantaTintaComprar;
        System.out.println("Quantidade de tinta a compra mais 10% é " + quantidadeComFolga);


        quantidadeDeLatas = quantidadeComFolga / lataTintaLitro;
        System.out.println("A quantidade de latas de tinta de 18L necessarias são ");
        System.out.print (Math.ceil(quantidadeDeLatas));
        System.out.println("Latas");

        quantidadeDeGalao = quantidadeComFolga / galaoTintaLitro;
        System.out.println("A quantidade de galão de tinta de 3,6 litros necessários são ");
        System.out.print(Math.ceil(quantidadeDeGalao));
        System.out.println(" Galões");


        //Valor em dinheiro de galão com 10%

        valorEmGalão = quantidadeDeGalao *  valorGalaoTinta;
        System.out.println("Você vai pagar " + valorEmGalão + "reais nos galões necessario com 10% de folga");
        //Valor em dinheiro lata com 10%

        valorEmLata = quantidadeDeLatas * valorLataTinta;
        System.out.println( "Você vai pagar" + valorEmLata + " reais nas latas necessarias com 10% de folga");

        //valor do Litro da lata

        valorLitroGalao = valorLataTinta/lataTintaLitro;
        System.out.println("O valor do litro da lata de 18L é" + valorLitroGalao);

        // valor do Litro Galão
        valorLitroGalao = valorGalaoTinta / galaoTintaLitro;
        System.out.println("O valor do litro do galão de 3,6 L é" + valorLitroGalao);


























}
}
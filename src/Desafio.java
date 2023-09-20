//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): criar um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        //Lê os valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        //Atribuição das alíquotas mediante o salário:
        float valorImposto;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario; //5%

        } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario; //10%

        } else {
            valorImposto = 0.15F * valorSalario; //15%
        }

        //Calcula e imprime a Saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.printf("%.2f%n", saida);
    }
}
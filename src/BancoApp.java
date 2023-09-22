import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class BancoApp {

    public static String formatarMoeda(double valorFinal) {
        Locale ptbr;
        ptbr = new Locale("pt", "BR");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(ptbr);

        return currencyFormat.format(valorFinal);
    }
    public static void main(String[] args) {

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial;

        //Interar, baseado no período em anos, para calculo do valorFinal com os juros.

        for (int i = 0; i < periodo; i++) {
            valorFinal += valorFinal * taxaJuros;
        }

        String returMessage = "Valor final do investimento: " + formatarMoeda(valorFinal);

        System.out.println(returMessage.replace(".", ""));

        scanner.close();
    }
}
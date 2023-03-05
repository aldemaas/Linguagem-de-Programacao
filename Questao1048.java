import java.util.Locale;
import java.util.Scanner;

public class Questao1048 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario;
        double reajuste;
        double porcentagem;
        int percent;


        salario = sc.nextDouble();
        reajuste = 0;
        percent = 0;

        if (salario >= 0 && salario <= 400){
            porcentagem = 0.15;
            reajuste = salario * porcentagem;
            salario = salario + salario * porcentagem;
            percent = 15;

        }
        else if (salario >= 400.01 && salario <= 800) {
            porcentagem = 0.12;
            reajuste = salario * porcentagem;
            salario = salario + salario * porcentagem;
            percent = 12;
        }
        else if (salario >= 800.01 && salario <= 1200) {
            porcentagem = 0.10;
            reajuste = salario * porcentagem;
            salario = salario + salario * porcentagem;
            percent = 10;
        }
        else if (salario >= 1200.01 && salario <= 2000) {
            porcentagem = 0.07;
            reajuste = salario * porcentagem;
            salario = salario + salario * porcentagem;
            percent = 7;
        }
        else if (salario >= 2000) {
            porcentagem = 0.04;
            reajuste = salario * porcentagem;
            salario = salario + salario * porcentagem;
            percent = 4;
        }

        System.out.printf("%s %2.2f\n", "Novo salario:", salario);
        System.out.printf("%s %2.2f\n", "Reajuste ganho:", reajuste);
        System.out.printf("%s %d %s\n", "Em percentual:", percent, "%");

        sc.close();
    }
}


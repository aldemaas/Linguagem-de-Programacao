import java.util.Locale;
import java.util.Scanner;

public class Quest1008 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valor, total;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valor = sc.nextDouble();

        total = horas * valor;

        System.out.printf("%s %d\n", "NUMBER =", numero);
        System.out.printf("%s %.2f\n", "SALARY = U$", total);
    }
}

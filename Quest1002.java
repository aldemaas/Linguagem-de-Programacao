import java.util.Locale;
import java.util.Scanner;

public class Quest1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double area, n, raio;

        n = 3.14159;
        raio = sc.nextDouble();
        area = (raio * raio) * n;

        System.out.printf("A=" + "%2.4f\n" , area);

    }
}

import java.util.Locale;
import java.util.Scanner;

public class Questao1003 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C;

        A = sc.nextDouble() * 2;
        B = sc.nextDouble() * 3;
        C = sc.nextDouble() * 5;

        System.out.println("MEDIA = "+ (A+ B+ C) / 10);


        sc.close();
    }
}

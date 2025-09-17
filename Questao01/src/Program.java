import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();

        System.out.println("escreva a altura e largura do retangulo:");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();

        System.out.printf("area = %.2f%n", retangulo.area());
        System.out.printf("perimetro = %.2f%n", retangulo.perimetro());
        System.out.printf("diagonal = %.2f%n", retangulo.diagonal());
        sc.close();



    }
}

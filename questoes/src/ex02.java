import java.util.Locale;
import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double raio, pi = 3.14159, area;
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		sc.close();
		area = pi*Math.pow(raio, 2);
		System.out.printf("A = %.4f%n",area);
	}
}

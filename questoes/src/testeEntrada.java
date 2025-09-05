import java.util.Scanner;

public class testeEntrada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		double t;
		int y;

		x = sc.next();
		y = sc.nextInt();
		t = sc.nextDouble();
		System.out.printf("você digitou: %s%n %d%n %.1f%n",x, y, t);
		
		
		sc.close();
	}
}


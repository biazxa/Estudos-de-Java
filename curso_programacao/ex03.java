package curso_programacao;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		int a,b,c,d,diferenca;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		diferenca = (a*b - c*d);
		System.out.println("DIFERENCA = " + diferenca);
	}
}

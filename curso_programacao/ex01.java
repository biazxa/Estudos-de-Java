package curso_programacao;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		int x,y,soma;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		soma = x + y;
		System.out.println("soma = " + soma);
		
	}

}

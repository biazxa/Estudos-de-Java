package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo,pi = 3.14159;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		sc.close();
		triangulo = a*c/2;
		circulo = pi*c*c;
		trapezio = (a+b)*c/2;
		quadrado = b*b;
		retangulo = a*b;
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",triangulo,circulo,trapezio,quadrado,retangulo);
	}
}

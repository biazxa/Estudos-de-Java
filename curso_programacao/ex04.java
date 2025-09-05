package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		int number, hours;
		double value,salary;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		hours= sc.nextInt();
		value = sc.nextDouble();
		sc.close();
		salary = hours*value;
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n",number,salary);

	}
}

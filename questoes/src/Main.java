import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 25;
		String nome = "bia";
		int idade = 20;
		double altura = 1.5589;
		double x = 10.89555;
		System.out.printf("o meu nome é %s, tenho %d anos e %.2f metros%n", nome,idade,altura);
		System.out.println(x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n",x);
		System.out.println(y);
		System.out.println("olá mundo");
		System.out.println("bem vindo");
		
		
	}

}

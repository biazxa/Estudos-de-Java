import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale .setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario f = new Funcionario();
        System.out.println("Nome: ");
        f.nome = sc.nextLine();
        System.out.println("Salario: ");
        f.salarioBruto = sc.nextDouble();
        System.out.println("imposto: ");
        f.imposto = sc.nextDouble();
        System.out.println("dados: " + f.nome + ", $ " + f.salarioLiquido());
        System.out.println("porcentagem: ");
        f.salarioAtualizado(sc.nextDouble());
        System.out.println("atualizado: " + f.nome + ", $ " + f.salarioLiquido());
        sc.close();
    }
}

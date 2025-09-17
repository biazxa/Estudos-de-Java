import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.println("digite o número da conta");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("digite o seu nome");
        String nomeTitular = sc.nextLine();
        System.out.println("quer realizar um deposito? (y/n)");
        char option = sc.next().charAt(0);
        if (option =='y') {
            System.out.println("Digite o valor da deposito");
            double saldo = sc.nextDouble();
            account = new Account(number, nomeTitular, saldo);
        }else{
            account = new Account(number, nomeTitular);
        }

        System.out.println("dados:");
        System.out.println(account);

        System.out.println("Digite o valor do deposito");
        double valor = sc.nextDouble();
        account.depositar(valor);
        System.out.println("dados atualizados:");
        System.out.println(account);

        System.out.println("Digite o valor do saque");
        valor = sc.nextDouble();
        account.sacar(valor);
        System.out.println(account);

        sc.close();
        }
    }


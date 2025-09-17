import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudantes[] vect = new Estudantes[10];
        System.out.println("quantidade de estudantes:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("estudante" + n);
            System.out.println("nome:");
            String nome = sc.next();
            System.out.println("email");
            String email = sc.next();
            System.out.println("quarto");
            int quarto = sc.nextInt();
            vect[quarto] = new Estudantes(nome, email);
        }
        System.out.println("quartos ocupados:");
        for(int i = 0; i < 10; i++){
            if(vect[i] != null){
                System.out.println(i + ":" + vect[i]);
            }
        }


    }
}

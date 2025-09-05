import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        int inicio, fim, duracao;
        Scanner sc = new Scanner(System.in);
        inicio = sc.nextInt();
        fim = sc.nextInt();
        sc.close();
        if (inicio == fim) {
            System.out.println("o jogo durou 24 horas");
        }else if (inicio >= 12) {
            duracao = (24 - inicio) + fim;
            System.out.println("o jogo durou" + duracao + "horas");
        } else if (inicio < 12) {
            duracao = fim - inicio;
            System.out.println("o jogo durou" + duracao + "horas");
        }
    }
}
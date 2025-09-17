import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.println("segunda nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.println("terceira nota: ");
        aluno.nota3 = sc.nextDouble();
        System.out.printf("media: %.2f%n",aluno.notaFinal());
        if (aluno.notaFinal() >= 60) {
            System.out.println("passou");
        }else{
            System.out.println("não passou");
            System.out.printf("falta %.2f%n pontos",aluno.faltaPontos());
        }
    }
}

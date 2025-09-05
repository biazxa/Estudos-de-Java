import java.util.Scanner;
public class ex07  {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        if(num < 0){
            System.out.println("Negativo");
        }else{
            System.out.println("não negativo");
        }
    }
}
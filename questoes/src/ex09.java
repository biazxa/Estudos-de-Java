import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
        int numA, numB;
        Scanner sc = new Scanner(System.in);
        numA = sc.nextInt();
        numB = sc.nextInt();
        sc.close();
        if(numA % numB == 0 || numB % numA == 0){
            System.out.println("sao multiplos");
        }else{
            System.out.println("nao sao multiplos");
        }
    }
}

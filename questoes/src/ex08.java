import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        if(num%2==0){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }
    }
}

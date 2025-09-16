import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("dados do produto:");
        System.out.println("Nome do produto:");
        String name = sc.nextLine();
        System.out.println("Preco do produto:");
        double price = sc.nextDouble();
        System.out.println("Quantidade do produto:");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        product.setName("computer");
        System.out.println("Nome do produto:"+product.getName());
        product.setPrice(500.00);
        System.out.println("Preco do produto:"+product.getPrice());

        System.out.println("dados do produto:" + product);
        System.out.println("numero de produtos para add no estoque ");
        quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println("dados do produto atualizado:" + product);
        System.out.println("numero de produtos para remover no estoque ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        System.out.println("dados do produto atualizado:" + product);




        sc.close();
    }
}

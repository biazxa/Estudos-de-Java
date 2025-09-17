import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
        System.out.println("Pedido: " + pedido);

        OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
        System.out.println("OrderStatus: " + os2);
    }
}

public class Program {

    public static void main(String[] args) {
        Account acc = new Account(1001, "bia", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "maria",  0.0 , 500.0);
        //upcasting
        Account acc1 = bacc;
        // to atribuindo um obj da subclasse para a superclasse

        //downcasting


}}

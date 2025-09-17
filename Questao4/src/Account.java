public class Account {

    private int number;
    private String nomeTitular;
    private double saldo;

    public Account(int number, String nomeTitular) {
        this.number = number;
        this.nomeTitular = nomeTitular;
    }

    public Account(int number, String nomeTitular,  double saldo) {
        this.number = number;
        this.nomeTitular = nomeTitular;
        depositar(saldo);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor + 5.0;
    }

    @Override
    public String toString() {
        return "Account "
                + number
                + ", titular: "
                + nomeTitular
                + ", saldo: $ "
                + String.format("%.2f", saldo);
    }
}

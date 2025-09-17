public class Funcionario {
    public String nome;
    public Double salarioBruto;
    public Double imposto;


    public double salarioLiquido(){
        return salarioBruto - imposto;
    }
    public void salarioAtualizado(double porcentagem){
        salarioBruto += salarioBruto *porcentagem/100;
    }
}

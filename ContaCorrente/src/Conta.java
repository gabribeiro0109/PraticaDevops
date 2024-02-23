
public class Conta {
    private String nome;
    private double saldo;
    private double retirarsaldo;
    private double dinheiro;

// ALTERAÇÃO i

    public void setNome(String nome) {
        this.nome = nome;
    }//Fecha método setNome
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setRetirarsaldoaldo(double retirarsaldo) {
        this.retirarsaldo = retirarsaldo;
    }
    public String getNome(){
      return nome;
    }//Fecha método getNome


    public double getSaldo(){
        return saldo;
    }

    public double getRetirarsaldo(){
        return retirarsaldo;
    }
}//Fecha classe

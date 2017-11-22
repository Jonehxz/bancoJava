package Negocios;

public class Conta {
    private int numero;
    private String nometitular;
    private double saldo;
    
    //CONSTRUTORES
    public Conta(int numero, String nomeTitular){
        this.numero = numero;
        this.nometitular = nomeTitular;        
    }
    
    public Conta(int numero, String nomeTitular, double saldo){
        this.numero = numero;
        this.nometitular = nomeTitular;
        this.saldo = saldo;       
    }

    //NUMERO
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //NOME TITULAR
    public String getNometitular() {
        return nometitular;
    }

    public void setNometitular(String nometitular) {
        this.nometitular = nometitular;
    }
    
    //SALDO
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void imprimirTipoConta()
    {
        System.out.println("Conta comum");
    }
    
    
}

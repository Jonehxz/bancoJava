package Negocios;

public class ContaEspecial extends Conta{
    private double limite;
    
    public ContaEspecial(int numero, String nomeTitular) {
        super(numero, nomeTitular);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void imprimirTipoConta() {
        System.out.println("Conta especial");
    }

    
}

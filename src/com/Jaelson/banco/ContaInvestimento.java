package com.Jaelson.banco;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimento;

    public ContaInvestimento(Titular titular, int agencia, int numero){
        super(titular, agencia, numero);
    }

    public double getValorTotalRendimento(){
        return valorTotalRendimento;
    }

    public void creditarRendimentos(double percentualJuros){
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimento += valorRendimentos;
        depositar(valorRendimentos);
    }

    @Override
    public String toString() {
        return "ContaInvestimento{" +
                "titular=" + getTitular() +
                ", agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ", valorTotalRendimentos=" + valorTotalRendimento +
                '}';
    }
}

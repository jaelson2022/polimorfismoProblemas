package com.Jaelson.banco;

public class ContaEspecial extends ContaInvestimento{

   private double tarifaMensal;
   private double limiteChequeEspercial;

   public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal){
      super(titular, agencia, numero);
      this.tarifaMensal = tarifaMensal;
   }

   public double getTarifaMensal() {
      return tarifaMensal;
   }

   public void setTarifaMensal(double tarifaMensal) {
      this.tarifaMensal = tarifaMensal;
   }

   public double getLimiteChequeEspercial() {
      return limiteChequeEspercial;
   }

   public void setLimiteChequeEspercial(double limiteChequeEspercial) {
      this.limiteChequeEspercial = limiteChequeEspercial;
   }

   public  double getSaldoDisponivel(){
      return getSaldo() + getLimiteChequeEspercial();
   }

   public final void imprimirDemostrativo(){
      super.imprimirDemostrativo();
      System.out.printf("Saldo disponivel: %.2f%n", getSaldoDisponivel());
   }

   protected final void validarSaldoParaSaque(double valorSaque){
      if (getSaldoDisponivel() < valorSaque) {
         throw new RuntimeException("saldo insuficiente para saque");
      }
   }

   public void debitarTarifaMensal(){
      sacar(getTarifaMensal());
   }

   @Override
   public String toString() {
      return "ContaEspecial{" +
              "titular=" + getTitular() +
              ", agencia=" + getAgencia() +
              ", numero=" + getNumero() +
              ", valorTotalRendimentos=" + getValorTotalRendimento() +
              ", tarifaMensal=" + tarifaMensal +
              ", limiteChequeEspecial=" + limiteChequeEspercial +
              '}';
   }
}

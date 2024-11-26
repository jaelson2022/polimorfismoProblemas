package com.Jaelson.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARITA_IMPRESSAO_DEMOSTRATIVO = 5;


    public void transferir(Conta contaOrigem, Conta contaDestino,
                           double valorTransferencia){
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d%d%n",
                valorTransferencia, contaOrigem.getAgencia(), contaDestino.getNumero(),
                contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }

    public void imprimirDemonstrativo(Conta conta){
        ContaInvestimento contaInvestimento = (ContaInvestimento) conta;

        if (contaInvestimento.getValorTotalRendimento() > 0){
            System.out.println("Impressão do demonstrativo é gratuita");
        } else {
            System.out.printf("Custo da impressão: R$%.2f%n", TARITA_IMPRESSAO_DEMOSTRATIVO);
            conta.sacar(TARITA_IMPRESSAO_DEMOSTRATIVO);
        }
        conta.imprimirDemostrativo();
    }
}

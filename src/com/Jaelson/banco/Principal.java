package com.Jaelson.banco;
import com.Jaelson.banco.Conta;
import com.Jaelson.banco.ContaEspecial;
import com.Jaelson.banco.Titular;

public class Principal {

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "12369875632"),
                1234, 999999,90);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("João da Silva", "12369875632"),
                1234, 999999);
        conta2.depositar(100);
        conta2.creditarRendimentos(10);


        caixaEletronico.imprimirDemonstrativo(conta2);
    }
}

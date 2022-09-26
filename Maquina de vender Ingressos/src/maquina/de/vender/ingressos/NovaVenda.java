
package maquina.de.vender.ingressos;

import java.io.IOException;


public class NovaVenda{
    int quantidade;
    double valorInserido;
    IngressosEsgotados ing = new IngressosEsgotados();
    
    public void venda(MaquinaDeVenderIngressos maquina) throws IOException{ 
        if(maquina.getQtdIngressos() == 0){
            ing.ingressosEsgotados(maquina);
        }
        System.out.println("");
        System.out.println(""); 
        System.out.println("===============================================");
        System.out.println("Preco Unitario Ingressos: " + maquina.getPreco());
        System.out.println("Ingressos Disponiveis: " + maquina.getQtdIngressos());
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("");
        System.out.println("Insira quantos ingressos deseja comprar:");
        quantidade = maquina.ler.nextInt();
        System.out.println("");
        System.out.println("");
        if(maquina.getQtdIngressos()<quantidade){
            System.out.println("Quantidade de ingressos INDISPONIVEL.");
            System.out.println("");
            System.out.println("");
            System.out.println("PRESSIONE QUALQUER TECLA PARA RETORNAR AO MENU DE COMPRA");
            int aux = System.in.read();
            System.out.println("Abrindo Menu...");
            venda(maquina);    
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Total a Pagar: " + maquina.valorPagar(quantidade, maquina.getPreco()));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("");
        System.out.println("");
        System.out.println("Insira o valor a ser depositado na maquina");
        valorInserido = maquina.ler.nextDouble();
        System.out.println("");
        System.out.println("");
        
        double troco = maquina.valorTroco(valorInserido, quantidade, maquina.getPreco());
        if(troco >= 0){
            System.out.println("##############################################");
            System.out.println("Compra realizada com sucesso!!!");
            System.out.println("Seu troco eh :" + troco);
            System.out.println("##############################################");
            System.out.println("");
            System.out.println("");
            System.out.println("PRESSIONE QUALQUER TECLA PARA RETORNAR AO MENU DE COMPRA");
            int aux = System.in.read();
            System.out.println("Abrindo Menu...");
            maquina.qtdIngressos -= quantidade;
            maquina.qtdVendidos += quantidade;
            maquina.valorTotalRecebido += maquina.valorPagar(quantidade, maquina.getPreco());
            venda(maquina);
        }else{
            System.out.println("O valor inserido eh INVÁLIDO");
            System.out.println("");
            System.out.println("");
            System.out.println("PRESSIONE QUALQUER TECLA PARA RETORNAR AO MENU DE COMPRA");
            int aux = System.in.read();
            System.out.println("Abrindo Menu...");
            venda(maquina);
        }
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
}

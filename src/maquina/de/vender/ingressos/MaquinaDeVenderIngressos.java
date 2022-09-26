
package maquina.de.vender.ingressos;
import java.util.Scanner;


public class MaquinaDeVenderIngressos{
    
    Scanner ler = new Scanner(System.in);
    private double preco;
    public double valorTotalRecebido;
    public int qtdIngressos;
    public int qtdVendidos;
    
    public MaquinaDeVenderIngressos(){
        
        System.out.println("Insira o Preco de Venda dos Ingressos:");
        this.preco = ler.nextDouble();
        System.out.println("Insira a Quantidade de Ingressos Disponiveis:");
        this.qtdIngressos = ler.nextInt();
        this.valorTotalRecebido = 0;
        this.qtdVendidos = 0;

    }
    
    public double valorPagar(double x, double y){
        return x * y;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public double getValorTotalRecebido(){
        return valorTotalRecebido;
    }
    
    public double getQtdVendidos(){
        return qtdVendidos;
    }
    
    
    public int getQtdIngressos(){
        return qtdIngressos;
    }
    
    public double valorTroco(double x, double y, double z){
        return x - valorPagar(y,z);
    }
       
}


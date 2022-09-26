
package maquina.de.vender.ingressos;

import java.io.IOException;


public class Main {
    
    public static void main(String[]args) throws IOException{
        MaquinaDeVenderIngressos maquina = new MaquinaDeVenderIngressos();
        NovaVenda venda = new NovaVenda();
        
        venda.venda(maquina);      
    }   
}

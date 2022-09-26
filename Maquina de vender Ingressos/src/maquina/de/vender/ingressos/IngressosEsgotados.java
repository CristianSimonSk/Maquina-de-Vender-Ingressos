
package maquina.de.vender.ingressos;

public class IngressosEsgotados {
    
    public void ingressosEsgotados(MaquinaDeVenderIngressos maquina){
        
        System.out.println("");
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("        INGRESSOS ESGOTADOS        ");
        System.out.println("===============================================");
        System.out.println("Insira a senha de administrador para encerrar:");
        int senha = maquina.ler.nextInt();
        if(senha == 1324){
            System.out.println("===============================================");
            System.out.println("Total de Ingressos Vendidos: " + maquina.getQtdVendidos());
            System.out.println("Total de Valor Recebido: " + maquina.getValorTotalRecebido());
            System.out.println("===============================================");  
            System.exit(0);
        }else ingressosEsgotados(maquina);
    }
}

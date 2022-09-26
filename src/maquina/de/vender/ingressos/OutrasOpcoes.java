
package maquina.de.vender.ingressos;


public class OutrasOpcoes {
    
    public int outrasOpcoes(MaquinaDeVenderIngressos maquina, NovaVenda vender){
        
        double valorInserido;
        
        System.out.println("===============================================");
        System.out.println("Escolha uma opçao: ");
        System.out.println("1- Inserir valor novamente.");
        System.out.println("2- Desistir da Compra.");
        System.out.println("===============================================");
        int opc = maquina.ler.nextInt();
        
        switch(opc){
            
            case 1 -> {
                valorInserido = maquina.ler.nextDouble();
                double aux = maquina.valorTroco(valorInserido,maquina.getPreco(),vender.getQuantidade());
                if(aux >= 0){
                    System.out.println("##############################################");
                    System.out.println("Compra realizada com sucesso!!!");
                    System.out.println("Seu troco eh :" + aux);
                    System.out.println("##############################################");
                    maquina.qtdIngressos -= vender.getQuantidade();
                    maquina.qtdVendidos += vender.getQuantidade();
                    maquina.valorTotalRecebido += maquina.valorPagar(vender.getQuantidade(),maquina.getPreco());  
                    return 1;
                }else{
                    System.out.println("O valor Inserido eh INVÁLIDO");
                    return 1;
                }  
            }
                
            case 2 -> { 
                return 1;
            }
            
            default -> {
                return 0;
            }
                
        }
    }
}

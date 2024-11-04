package model;

public class OrdenacaoBolhaOtimizada<T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    
    @Override
    public void ordenar() {
        int tamanho = super.getInfo().length;
        boolean trocou;
        
        for (int i = 1; i <= (tamanho - 1); i++) {
            trocou = false;
            for (int j = 0; j < (tamanho - i); j++) {
                if(super.getInfo()[j].compareTo(super.getInfo()[j + 1]) > 0){
                    super.trocar(j, j + 1);
                    trocou = true;
                }
            }
            
            if(!trocou){
                break;
            }
        }
    }
    
}

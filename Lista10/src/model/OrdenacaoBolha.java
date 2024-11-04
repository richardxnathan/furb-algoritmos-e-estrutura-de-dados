package model;

public class OrdenacaoBolha <T extends Comparable<T>> extends OrdenacaoAbstract<T>{

    @Override
    public void ordenar() {
        int tamanho = super.getInfo().length;
        
        for (int i = 1; i <= (tamanho - 1); i++) {
            for (int j = 0; j < (tamanho - i); j++) {
                if(super.getInfo()[j].compareTo(super.getInfo()[j + 1]) > 0){
                    super.trocar(j, j + 1);
                }
            }
        }
    }
    
}

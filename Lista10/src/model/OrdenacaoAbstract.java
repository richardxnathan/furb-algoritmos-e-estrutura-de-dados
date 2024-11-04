package model;

public abstract class OrdenacaoAbstract<T extends Comparable<T>> {
    
    private T[] info;

    public T[] getInfo() {
        return info;
    }

    public void setInfo(T[] info) {
        this.info = info;
    }
    
    public void trocar(int a, int b){
        T auxiliar = info[a];
        this.info[a] = info[b];
        this.info[b] = auxiliar;
    }
    
    public abstract void ordenar();

    @Override
    public String toString() {
        String resultado = "[";
        
        for(int i = 0; i < (this.info.length - 1); i++) {
            resultado += this.info[i] + ",";
        }
        
        resultado += this.info[this.info.length - 1] + "]"; 
        
        return resultado;
    }
    
    

}

package model;

public class ListaEstatica <T> {
    
    private Object[] info;
    private int tamanho;

    public ListaEstatica() {
        this.info = new Object[10];
        this.tamanho = 0;
    }
    
    private void redimensionar(){
        Object[] novo = new Object[this.info.length + 10];
        
        int posicao = 0;
        for(Object o : this.info){
            novo[posicao] = this.info[posicao];
            posicao++;
        }
        
        this.info = novo;
    }
    
    public void inserir(Object objeto){
        if(this.info.length == this.tamanho){
            this.redimensionar();
        }
        
        this.info[tamanho] = objeto;
        this.tamanho++;
    }
    
    public void exibir(){
        for(Object o : this.info){
            System.out.println(o);
        }
    }
    
    public int buscar(T t){
        int numeroEncontrado = -1;
        
        for (int i = 0; i < this.tamanho; i++) {
            if(this.info[i].equals(t)){
                numeroEncontrado = i;
                
                return numeroEncontrado;
            }
        }
        
        return numeroEncontrado;
    }
    
    public void retirar(T t){
        
        int posicao = this.buscar(t);
        
        if(posicao != -1){
            for (int i = posicao; i < this.tamanho; i++) {
                this.info[i] = this.info[i + 1];
            }
            
            this.tamanho--;
            this.info[tamanho] = null;
        }
    }
    
    public void liberar(){
        this.info = new Object[10];
        this.tamanho = 0;
    }
    
    public T obterElemento(int valor){
        if(valor >= this.tamanho){
            throw new IndexOutOfBoundsException();
        } else {
            return (T) this.info[valor];
        }   
    }
    
    public boolean estaVazia(){
        if(this.tamanho == 0){
            return true;
        } else {
            return false;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String resultado = "[";
        
        for (int i = 0; i < this.tamanho-1; i++) {
            resultado += this.info[i];
            resultado += ", ";
        }
        
        resultado += this.info[tamanho - 1];
        
        resultado += "]";
        
        return resultado;
    }

}

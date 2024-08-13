package model;

public class ListaEstatica {
    
    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        this.info = new int[10];
        this.tamanho = 0;
    }
    
    private void redimensionar(){
        int[] novo = new int[this.info.length + 10];
        
        int posicao = 0;
        for(int i : this.info){
            novo[posicao] = this.info[posicao];
            posicao++;
        }
        
        this.info = novo;
    }
    
    public void inserir(int valor){
        if(this.info.length == this.tamanho){
            this.redimensionar();
        }
        
        this.info[tamanho] = valor;
        this.tamanho++;
    }
    
    public void exibir(){
        for(int i : this.info){
            System.out.println(i);
        }
    }
    
    public int buscar(int valor){
        int numeroEncontrado = -1;
        
        for (int i = 0; i < this.tamanho; i++) {
            if(this.info[i] == valor){
                numeroEncontrado = i;
                
                return numeroEncontrado;
            }
        }
        
        return numeroEncontrado;
    }
    
    public void retirar(int valor){
        
        int posicao = this.buscar(valor);
        
        if(posicao != -1){
            for (int i = posicao; i < this.tamanho; i++) {
                this.info[i] = this.info[i + 1];
            }
            
            this.tamanho--;
            this.info[tamanho] = 0;
        }
    }
    
    public void liberar(){
        this.info = new int[10];
        this.tamanho = 0;
    }
    
    public int obterElemento(int valor){
        if(valor >= this.tamanho){
            throw new IndexOutOfBoundsException();
        } else {
            return this.info[valor];
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

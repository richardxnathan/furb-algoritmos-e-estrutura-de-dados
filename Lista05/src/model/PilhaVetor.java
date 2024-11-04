package model;

import exception.PilhaCheiaException;
import exception.PilhaVaziaException;

public class PilhaVetor<T> implements Pilha<T> {

    private Object info[];
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.info = new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }
    
    @Override
    public void push(Object info) {
        if(this.tamanho == this.limite){
            throw new PilhaCheiaException();
        }
        
        this.info[tamanho] = info;
        tamanho++;
    }

    @Override
    public T pop() {
        T auxiliar = this.peek();
        this.info[this.tamanho - 1] = null;
        this.tamanho--;
        
        return (T) auxiliar;
    }

    @Override
    public T peek() {
        if(this.tamanho == 0){
            throw new PilhaVaziaException();
        }
        
        return (T) info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        this.info = new Object[limite];
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        if(this.estaVazia()){
            return "";
        }
        
        
        String resultado = "";
        
        for (int i = tamanho - 1; i > 0; i--) {
            resultado += this.info[i] + ",";
        }
        
        resultado += this.info[0];
        
        return resultado;
    }
    
    public void concatenar(PilhaVetor<T> p){
        if((this.tamanho + p.tamanho) > this.limite){
            throw new RuntimeException("Não há espaço suficiente para armazenar.");
        }
        
        for (int i = 0; i < p.tamanho; i++) {
            push(p.info[i]);
        }
    }

}

package model;

import exception.PilhaVaziaException;

public class PilhaLista<T> implements Pilha<T> {
    
    private ListaEncadeada lista;
    private int tamanho;

    public PilhaLista() {
        this.lista = new ListaEncadeada();
        this.tamanho = 0;
    }
    
    @Override
    public void push(Object info) {
        this.lista.inserir(info);
        this.tamanho++;
    }

    @Override
    public T pop() {
        if(this.tamanho == 0){
            throw new PilhaVaziaException();
        }
        
        T auxiliar = (T) this.lista.getPrimeiro().getInfo();
        this.lista.retirar(auxiliar);
        this.tamanho--;
        
        return auxiliar;
    }

    @Override
    public T peek() {
        if(this.tamanho == 0){
            throw new PilhaVaziaException();
        }
        
        return (T) lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        this.lista = new ListaEncadeada();
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        if(this.estaVazia()){
            return "";
        }
        
        return this.lista.toString();
    }   
    
}

package model.encadeada;

import exception.FilaVaziaException;
import model.Fila;

public class FilaLista<T> implements Fila<T>{

    private ListaEncadeada<T> lista;

    public FilaLista() {
        this.lista = new ListaEncadeada<>();
    }

    @Override
    public void inserir(T valor) {
        lista.inserirNoFinal(valor);
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public T peek() {
        if(estaVazia()){
            throw new FilaVaziaException();
        }
        
        return lista.getPrimeiro().getInfo();
    }

    @Override
    public T retirar() {
        T no = lista.obterNo(0).getInfo();
        
        lista.retirar(no);
        
        return no;
    }

    @Override
    public void liberar() {
        this.lista = new ListaEncadeada<>(); 
    }
    
}

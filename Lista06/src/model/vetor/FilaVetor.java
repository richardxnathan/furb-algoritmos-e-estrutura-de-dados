package model.vetor;

import exception.FilaCheiaException;
import exception.FilaVaziaException;
import model.Fila;

public class FilaVetor<T> implements Fila<T> {

    private Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        this.info = new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(T valor) {
        if (this.tamanho == this.limite) {
            throw new FilaCheiaException();
        }

        this.info[(inicio + tamanho) % limite] = valor;
        this.tamanho++;
    }

    @Override
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    @Override
    public T peek() {
        if (this.tamanho == 0) {
            throw new FilaVaziaException();
        }

        return (T) this.info[this.inicio];
    }

    @Override
    public T retirar() {
        if (this.tamanho == 0) {
            throw new FilaVaziaException();
        }

        T auxiliar = (T) this.info[this.inicio];
        this.info[this.inicio] = null;
        this.inicio = (inicio + 1) % limite;
        this.tamanho--;

        return auxiliar;
    }

    @Override
    public void liberar() {
        this.info = new Object[limite];
        tamanho = 0;
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.limite);

        if (!this.estaVazia()) {
            for (int i = 0; i < tamanho; i++) {
                f3.inserir((T) this.info[(inicio + i) % limite]);
            }
        }

        if (!f2.estaVazia()) {
            for (int i = 0; i < f2.tamanho; i++) {
                f3.inserir((T) f2.info[(inicio + i) % f2.limite]);
            }
        }

        return f3;
    }

    @Override
    public String toString() {
        String resultado = "";

        if (!this.estaVazia()) {
            for (int i = 0; i < this.tamanho - 1; i++) {
                resultado += this.info[((inicio + i) % limite)] + ",";
            }

            resultado += this.info[((inicio + tamanho - 1) % limite)];
        }

        return resultado;
    }

    public int getLimite() {
        return limite;
    }

    public void encolher() {
        FilaVetor<T> fila = new FilaVetor<>(this.tamanho);

        for (int i = 0; i < this.tamanho; i++) {
            fila.info[i] = (T) this.info[(this.inicio + i) % this.limite];
        }
        
        this.inicio = 0;
        this.limite = this.tamanho;
        
        this.info = fila.info;
    }

}

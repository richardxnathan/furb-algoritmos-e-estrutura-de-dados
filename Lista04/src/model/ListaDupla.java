package model;

public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        this.primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoListaDupla novoNo = new NoListaDupla();

        novoNo.setInfo(valor);
        novoNo.setProximo(this.primeiro);
        novoNo.setAnterior(null);

        if (this.primeiro != null) {
            this.primeiro.setAnterior(novoNo);
        }

        this.primeiro = novoNo;
    }

    public NoListaDupla buscar(T valor) {
        NoListaDupla no = this.primeiro;

        while (no != null) {
            if (no.getInfo().equals(valor)) {
                return no;
            }

            no = no.getProximo();
        }

        return null;
    }

    public void retirar(T valor) {
        NoListaDupla noRetirar = buscar(valor);

        if (noRetirar != null) {
            if (noRetirar.getAnterior() == null) {
                this.primeiro = noRetirar.getProximo();
                this.primeiro.setAnterior(null);
            } else if (noRetirar.getProximo() == null) {
                noRetirar.getAnterior().setProximo(null);
            } else {
                noRetirar.getAnterior().setProximo(noRetirar.getProximo());
                noRetirar.getProximo().setAnterior(noRetirar.getAnterior());
            }
        }
    }

    public void exibirOrdemInversa() {
        String resultado = "";
        NoListaDupla noAtual = this.primeiro;

        if (this.primeiro != null) {
            while (noAtual.getProximo() != null) {
                noAtual = noAtual.getProximo();
            }

            resultado = resultado.concat(noAtual.getInfo().toString());

            while (noAtual.getAnterior() != null) {
                resultado = ", " + noAtual.getAnterior().getInfo();
                noAtual = noAtual.getAnterior();
            }

            resultado = ", " + noAtual.getInfo();

            System.out.println(resultado);
        }
    }

    public void liberar() {
        NoListaDupla noAtual = this.primeiro;
        NoListaDupla noAuxiliar;

        if (this.primeiro != null) {
            while (noAtual.getProximo() != null) {
                noAuxiliar = noAtual.getProximo();

                noAtual.setAnterior(null);
                noAtual.setProximo(null);

                noAtual = noAuxiliar;
            }

            noAtual.setAnterior(null);
            this.primeiro = null;
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        NoListaDupla noAtual = this.primeiro;

        if (noAtual != null) {
            while (noAtual.getProximo() != null) {
                resultado += noAtual.getInfo() + ", ";

                noAtual = noAtual.getProximo();
            }

            resultado += noAtual.getInfo();
        }

        return resultado;
    }

}

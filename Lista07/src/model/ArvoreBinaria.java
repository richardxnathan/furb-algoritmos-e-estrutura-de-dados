package model;

public class ArvoreBinaria<T> {

    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        return this.raiz == null;
    }

    public boolean pertence(T info) {
        if (this.estaVazia()) {
            return false;
        } else if (this.raiz.getInfo().equals(info)) {
            return true;
        } else {
            return pertence(this.raiz, info);
        }
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info) {
        boolean bool = false;

        if (no.getEsquerda() != null) {
            if (no.getEsquerda().getInfo().equals(info)) {
                return true;
            } else {
                bool = pertence(no.getEsquerda(), info);
                if (bool) {
                    return true;
                }
            }
        }

        if (no.getDireita() != null) {
            if (no.getDireita().getInfo().equals(info)) {
                return true;
            } else {
                bool = pertence(no.getDireita(), info);
                if (bool) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        if (this.estaVazia()) {
            return "";
        }

        String resultado = "<" + this.raiz.getInfo();

        return (resultado + this.arvorePre(this.raiz) + ">");
    }

    private String arvorePre(NoArvoreBinaria<T> no) {
        String resultado = "<";

        if (no.getEsquerda() != null) {
            resultado += no.getEsquerda().getInfo();

            resultado += arvorePre(no.getEsquerda());
        }

        resultado += "><";

        if (no.getDireita() != null) {
            resultado += no.getDireita().getInfo();

            resultado += arvorePre(no.getDireita());
        }

        resultado += ">";

        return resultado;
    }

    public int contarNos() {
        if (this.estaVazia()) {
            return 0;
        } else {
            int quantidade = 1;

            quantidade += this.contarNos(raiz);

            return quantidade;
        }
    }

    private int contarNos(NoArvoreBinaria no) {
        int quantidade = 0;

        if (no.getEsquerda() != null) {
            quantidade++;

            quantidade += contarNos(no.getEsquerda());
        }

        if (no.getDireita() != null) {
            quantidade++;

            quantidade += contarNos(no.getDireita());
        }

        return quantidade;
    }

    public int contarNosX(NoArvoreBinaria no) {
        if (no.getInfo() == null) {
            return 0;
        } else {
            int quantidade = 1;

            quantidade += this.contarNos(raiz);

            return quantidade;
        }
    }

    public boolean isDegenerada() {
        if (this.raiz == null || this.contarNos() == 1) {
            return false;
        } else {
            return this.isDegenerada(this.raiz);
        }
    }

    private boolean isDegenerada(NoArvoreBinaria<T> no) {
        if (no.getEsquerda() != null && no.getDireita() != null) {
            return false;
        }
        
        if (no.getEsquerda() != null) {
            if (isDegenerada(no.getEsquerda())) {
                return true;
            }
        }

        if (no.getDireita() != null) {
            if (isDegenerada(no.getDireita())) {
                return true;
            }
        }

        return true;
    }

}

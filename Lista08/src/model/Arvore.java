package model;

public class Arvore<T> {

    private NoArvore<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    @Override
    public String toString() {
        if (this.getRaiz() == null) {
            return "";
        } else {
            String resultado = "<" + this.raiz.getInfo();

            resultado += this.obterRepresentacaoTextual(this.raiz);

            return resultado;
        }
    }

    private String obterRepresentacaoTextual(NoArvore<T> no) {
        String resultado = "";

        if (no.getPrimeiro() != null) {
            resultado += "<" + no.getPrimeiro().getInfo();

            resultado += obterRepresentacaoTextual(no.getPrimeiro()) + ">";
        } else {
            resultado += ">";
        }

        if (no.getProximo() != null) {
            resultado += "<" + no.getProximo().getInfo();
            resultado += obterRepresentacaoTextual(no.getProximo());
        }

        return resultado;
    }

    public boolean pertence(T info) {
        if (this.raiz == null) {
            return false;
        } else {
            return pertence(this.raiz, info);
        }
    }

    private boolean pertence(NoArvore<T> no, T info) {
        if (no.getInfo().equals(info)) {
            return true;
        } else {
            NoArvore<T> auxiliar;
            auxiliar = no.getPrimeiro();
            while (auxiliar != null) {
                if (pertence(auxiliar, info)) {
                    return true;
                }

                auxiliar = auxiliar.getProximo();
            }

            return false;
        }
    }

    public int contarNos() {
        if (this.getRaiz() == null) {
            return 0;
        } else {
            return this.contarNos(this.raiz);
        }
    }

    private int contarNos(NoArvore<T> no) {
        int quantidade = 1;

        if (no.getPrimeiro() != null) {
            quantidade += contarNos(no.getPrimeiro());
        }

        if (no.getProximo() != null) {
            quantidade += contarNos(no.getProximo());
        }

        return quantidade;
    }

    public int contarNosX(NoArvore<T> no) {
        int quantidade = 1;

        if (no.getPrimeiro() != null) {
            quantidade += contarNos(no.getPrimeiro());
        }

        if (no.getProximo() != null) {
            quantidade += contarNos(no.getProximo());
        }

        return quantidade;
    }

    public int contarFolhas() {
        if (this.raiz == null) {
            return 0;
        } else if (this.raiz.getPrimeiro() == null) {
            return 1;
        } else {
            return contarFolhas(this.raiz);
        }
    }

    private int contarFolhas(NoArvore<T> no) {
        int quantidade = 0;
        
        if(no.getPrimeiro() != null){
            quantidade += contarFolhas(no.getPrimeiro());
        } else {
            quantidade++;
        }
        
        if (no.getProximo() != null) {
                quantidade += contarFolhas(no.getProximo());
        }
        
        return quantidade;
    }

}

/*
        if (no.getPrimeiro() == null) {
            quantidade++;
            if (no.getProximo() != null) {
                quantidade += contarFolhas(no.getProximo());
            }
        } else {
            quantidade += contarFolhas(no.getPrimeiro());
        }
        */
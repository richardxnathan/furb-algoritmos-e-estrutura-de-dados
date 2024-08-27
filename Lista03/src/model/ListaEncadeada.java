package model;

public class ListaEncadeada <T> {

    private NoLista<T> primeiro;

    public ListaEncadeada() {
        this.primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }
    
    public void inserir(T valor){
         NoLista<T> noLista = new NoLista<>();
         noLista.setInfo(valor);
         noLista.setProximo(primeiro);
         this.primeiro = noLista;
    }
    
    public boolean estaVazia(){
        return this.primeiro == null;
    }
    
    public NoLista<T> buscar(T valor){
        
        NoLista noLista = this.primeiro;
        
        while(noLista != null){
            if(noLista.getInfo().equals(valor)){
                return noLista;
            }
            
            noLista = noLista.getProximo();
        }
        
        return null;
    }
    
    public void retirar(T valor){
        
        NoLista noAntecessor = null;
        NoLista noAtual = this.primeiro;
        
        while(noAtual != null){
            if(noAtual.getInfo() == valor){
                if(noAntecessor == null){
                    this.primeiro = noAtual.getProximo();
                    break;
                } else {
                    noAntecessor.setProximo(noAtual.getProximo());
                    break;
                }
            }
            
            noAtual = noAtual.getProximo();
        }
    }
    
    public int obterComprimento(){
        int quantidade = 0;
        NoLista noAtual = this.primeiro;
        
        while(noAtual != null){
            quantidade++;
            noAtual = noAtual.getProximo();
        }
        
        return quantidade;
    }
    
    public NoLista<T> obterNo(int idx){
        int quantidade = 0;
        NoLista noAtual = this.primeiro;
        
        while(quantidade != idx && noAtual != null){
            quantidade++;
            noAtual = noAtual.getProximo();
        }
        
        if(idx == quantidade){
            return noAtual;
        } else if (idx > quantidade || idx < 0){
            throw new IndexOutOfBoundsException();
        }
        
        return null;
    }
    
    @Override
    public String toString() {
        String resultado = "";
        NoLista noAtual = this.primeiro;
        
        while(noAtual != null){
            resultado += noAtual.getInfo() + ", ";
     
            noAtual = noAtual.getProximo();
        }
        
        return resultado;
    }
    
    public ListaEncadeada<T> criarInvertida(){
        ListaEncadeada lista = new ListaEncadeada<T>();
        
        NoLista noAtual = this.primeiro;
        
        while(noAtual != null){
            lista.inserir(noAtual.getInfo());
            noAtual = noAtual.getProximo();
        }
        
        return lista;
    }
    
}

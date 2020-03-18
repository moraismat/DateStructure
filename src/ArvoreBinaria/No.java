package src.ArvoreBinaria;

public class No {
    private int conteudo;
    private No raiz;
    private No direita;
    private No esquerda;
    private int nElementos;

    public No(){
        raiz = null;
        nElementos = 0;
    }

    public int getElementos() {
        return nElementos;
    }

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int dado) {
            conteudo = dado;
    }

    public No getDir() {
        return direita;
    }

    public No getEsq() {
        return esquerda;
    }

    public boolean vazia() {
        if(raiz == null)
            return true;

        return false;
    }
    public No busca(No T, int valor) {
        if(T == null)
            return null;
        
        if(T.getConteudo() == valor)
            return T;
        
        No aux = T.busca(T.getDir(), valor);
        if(aux == null) {
            aux = T.busca(T.getEsq(), valor);    
        }
        return aux;
    }
    
    public No busca(int valor) {
        if(vazia())
            return null;
    
        return busca(raiz, valor);
    }

    public int insereRaiz(int dado) {
        if(vazia()) {
           raiz.setConteudo(dado); 
            return 1;
        }
        return 0;
    }


}
package src.filaE;

public class filaE{
    private No inicio;
    private No fim;
    private int nElementos;

    public filaE() {
        inicio = null;
        fim = null;
        nElementos=0;
    }
    public boolean vazia() {
        if(nElementos==0) {
            return true;
        }
        else {
            return false;
        }
    }
    public int tamanho() {
        return nElementos;
    }
    public int primeiro() {
        if(vazia())
            return -1;
        else{
            return inicio.getConteudo();
        }
    }
    public void insere(int valor) {
        No novoNo = new No();
        novoNo.setConteudo(valor);
        novoNo.setProx(null);
        
        if(vazia()) {
            inicio = novoNo;
            fim = novoNo;
        }
        else {
            fim.setProx(novoNo);
            fim = novoNo;
        }
        nElementos++;
    }
    public int remove(){
        //verifica se a lista esta vazia
        if(!vazia()) {
            return -1;
        }

        int valor = inicio.getConteudo();
        //verifica se o numero de elementos é igual a 1 
        if(nElementos == 1){
            fim = null;
        }

        No primeiro = inicio;
        inicio = primeiro.getProx();
        nElementos--;

        primeiro = null;
        return valor;

    }
}
package src.filaE;

public class No {
    private int counteudo;
    private No prox;

    public No(){
        prox = null;
    }
    public int getConteudo() {
        return counteudo;
    }
    public void setConteudo(int valor) {
        counteudo = valor;
    }
    public No getProx() {
        return prox;
    }
    public void setProx(No no) {
        prox = no;
    }
}
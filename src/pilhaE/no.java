package src.pilhaE;

public class no{
    private int conteudo;
    private no prox;

    public no(){
        prox = null;
    }
    public int getConteudo(){
        return conteudo;
    }
    public void setConteudo(int valor){
        conteudo = valor;
    }
    public no getNo() {
        return prox;
    }
    public no getProx(){
        return prox;
    }
    public void setProx(no prox){
        this.prox = prox;
    }

}
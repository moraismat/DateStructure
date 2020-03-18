package src.filaS;


public class filaS{
    private int dados[];
    private int inicio;
    private int fim;
    private final int maxElementos = 100;

    private int nElementos;

    public filaS(){
        inicio = 0;
        fim = -1;
        nElementos = 0;
        
        dados = new int[maxElementos];
    }
    public boolean vazia() {
        if(nElementos == 0)
            return true;
        
        else
            return false;
    }
    public boolean cheia() {
        if(nElementos == maxElementos)
            return true;
        else
            return false;
    }
    public int tamanho(){
        return nElementos;
    }
    public int primeiro(){
        if(!vazia())
            return inicio;
        else
            return -1;
    }
    public int ultimo(){
        return fim;
    }
    public boolean insere(int valor) {
        if(!cheia()){
            fim = (fim+1)%maxElementos;
            dados[fim] = valor;
            nElementos++;
            return true;
        }
        else
            return false;
    }
    public boolean remove() {
        if(!vazia()) {
            dados[inicio] = 0;
            nElementos--;
            inicio = (inicio+1)%maxElementos;
            return true;
        }
        else    
            return false;
    }
    public int getUltimo() {
        return dados[fim];
    }
    public int getPrimeiro(){
        if(vazia()){
            return -1;
        }
        return dados[inicio];
    }
    public String toString() {
        String resp = "[ ";

        for(int i = 0; i <100; i++){
            resp += i +": "+dados[i];
            if(i != fim){
                resp += ", ";
            }
        }
        if(cheia())
            resp += " ]";
        return resp;
    }
}
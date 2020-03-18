package src.pilhaE;

import src.pilhaE.no;

public class pilhaE{
    private no topo;
    private int nElementos;

    public pilhaE() {
        topo = null;
        nElementos = 0;
    }
    public boolean vazia(){
        if(nElementos == 0)
            return true;
        else
            return false;
    }
    public int tamanho(){
        return nElementos;
    }
    public int topo(){
        if(vazia())
            return -1;
        else    
            return topo.getConteudo();
    }
    public void push(int valor) {
        no noNovo = new no();
        noNovo.setConteudo(valor);
        
        noNovo.setProx(topo);
        topo = noNovo;
        nElementos++;
    }
    public void pop(){
        if(!vazia()){
            no p = topo;
            int valor = p.getConteudo();

            topo = p.getProx();
            nElementos--;
            
            p = null;
        }
    }
    public int min(){
        no menor = new no();
        menor = topo;
        if(vazia()) {
           return -1; 
        }
        else {
            if(nElementos > 1){
                no p = topo.getProx();
                for(int i = 1; i < nElementos; i++){
                    if(menor.getConteudo() > p.getConteudo()){
                        menor = p;
                    }
                    p = p.getProx();
                }
            }
            return menor.getConteudo();
        }

    }
    public String toString(){
        String p = "[";

        no noNovo = topo;

        for(int i = nElementos; i > 0; i--){
            p +=  i + ": "+noNovo.getConteudo();
            if(i != 1)
                p += ", ";
            noNovo = topo.getProx();
        }
        p += "]";
        return p;
    }
}
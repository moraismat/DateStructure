package src.pilhaE;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        pilhaE pilha = new pilhaE();
        int i, n, valor;
        String text;

        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();
        ler.nextLine();
        for(i = 0; i < n; i++){
            text = ler.nextLine();

            if(text.equals("PUSH")) {
                valor = ler.nextInt();
                pilha.push(valor);
                ler.nextLine();
            }
            if(text.equals("POP")) {
                pilha.pop();
            }
            if(text.equals("MIN")){
                System.out.println(pilha.min());
            }
        }


        ler.close();
    
    }


    static class no{
        private int conteudo;
        private no prox;

        public no(){
            prox = null;
        }
        public int getConteudo(){
            return conteudo;
        }
        public void setConteudo(final int valor){
            conteudo = valor;
        }
        public no getNo() {
            return prox;
        }
        public no getProx(){
            return prox;
        }
        public void setProx(final no prox){
            this.prox = prox;
        }

    }

    static class pilhaE{
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
        public void push(final int valor) {
            final no noNovo = new no();
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

}
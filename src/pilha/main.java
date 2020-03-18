package src.pilha;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
            pilhaE pilha = new pilhaE();
            int  n, valor=0;
            int i, k;
            String text, novo="", text1="";
            char[] c;

            Scanner ler = new Scanner(System.in);
            n = ler.nextInt();
            ler.nextLine();
            for(i = 0; i < n; i++){
                text = ler.nextLine();
                text = text.replace(" ", "");
                //System.out.println(text.length());
                c = text.toCharArray();
                //System.out.println(c[text.length()-1]);
                if(text.length() == 3) {
                    for(k = 0; k < text.length(); k++){
                        novo += c[k];
                    }
                }
                else {
                    for(k = 0; k < text.length(); k++){
                        if(k < 4){
                            novo += c[k];
                        }
                        else{
                            text1 += c[k];
                        }
                    }
                    valor = Integer.parseInt(text1);
                }
                if(novo.equals("PUSH")) {
                    pilha.push(valor);
                    text1 = "";
                }
                if(novo.equals("POP")) {
                    if(pilha.vazia()){
                        System.out.println("EMPTY");
                    }
                    else{
                        pilha.pop();
                    }
                }
                if(novo.equals("MIN")){
                    if(!pilha.vazia()){
                        System.out.println(pilha.min());
                    }
                    else{
                        System.out.println("EMPTY");
                    }
                }
                novo = "";
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
package src.pilha;

import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        String nome, novo = "";
        char[] c;

        Scanner ler = new Scanner(System.in);
        nome = ler.nextLine().replace(" ", "");
        System.out.println(nome);
        c = nome.toCharArray();
        
        for(int i = 0; i < nome.length(); i++){
            novo += c[i];
        }
        System.out.println(novo);
        ler.close();
        


    }
}
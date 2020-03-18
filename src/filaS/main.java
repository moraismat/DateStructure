package src.filaS;


public class main{

    public static void main(String[] args){
        filaS fila = new filaS();

        System.out.println(fila.getPrimeiro());

        for(int i = 0; i < 100; i++){
            fila.insere(i);
        }
        fila.remove();
        fila.insere(10000);
        fila.insere(5);
        System.out.println(fila.toString());
    }



}
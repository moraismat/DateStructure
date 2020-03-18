package src.game;

public class mainGame{

    public static void main(String[] args){
        topScore game = new topScore();

        game.addPoint("Matheus", 1000);
        game.addPoint("Jeffeson", 600);
        game.addPoint("Benedito", 700);
        game.addPoint("Denis", 500);
        game.addPoint("Elias", 300);
        game.addPoint("Jeronimo", 200);
        game.addPoint("Viviane", 100);
        game.addPoint("Alice", 800);
        game.addPoint("Alda", 900);
        game.addPoint("Ana", 400);

/*        System.out.println(game.getPosicion(0));
        System.out.println(game.getPosicion(1));
        System.out.println(game.getPosicion(2));
        System.out.println(game.getPosicion(3));
        System.out.println(game.getPosicion(4));
        System.out.println(game.getPosicion(5));
        System.out.println(game.getPosicion(6));
        System.out.println(game.getPosicion(7));
        System.out.println(game.getPosicion(8));
        System.out.println(game.getPosicion(9));*/

        System.out.println(game.toString());
    }
}
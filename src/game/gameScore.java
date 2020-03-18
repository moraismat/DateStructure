package src.game;

public class gameScore{
    private String name;
    private int score;

    public gameScore(String name, int score){
        this.name = name;
        this.score = score;
    }
    public int getScore(){
        return score;
    }
    public String getName() {
        return name;
    }
}
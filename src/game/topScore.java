package src.game;

import src.game.gameScore;

public class topScore{
    private final gameScore[] gamer;
    protected final int maxGamer = 10;
    protected int numberGamer;

    public topScore() {
        gamer = new gameScore[maxGamer];
        numberGamer = 0;
    }

    public void addPoint( String name,  int score) {
        gameScore e = new gameScore(name, score);
        if(numberGamer == 0){
            gamer[numberGamer] = e;
        }
        if(numberGamer != 0){
            for(int i = 0; i <= numberGamer; i++){
                if(gamer[i] == null){
                    gamer[i] = e;
                    break;
                }
                else{
                    if(e.getScore() > gamer[i].getScore()){
                        for(int k = numberGamer - 1; k >= i; k--){
                            gamer[k+1] = gamer[k];
                        }
                        gamer[i] = e;
                        break;
                    }
                    else{
                        continue;
                    }
    
                }
            }
        }
        numberGamer += 1;
    }

    public String getPosicion(int i){
        return gamer[i].getName() + " = " + gamer[i].getScore();
    }
    
    public String toString(){
        String result = "[";
     
        for(int k = 0; k < numberGamer; k++){
            result += ""+(k+1)+"-"+gamer[k].getName() + ": " + gamer[k].getScore();
            if(k != numberGamer - 1){
                result += ", ";
            }
        }
        result += " ]";
        
        return result;
    }
}
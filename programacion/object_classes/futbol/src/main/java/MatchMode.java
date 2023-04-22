
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase abstracta para llevar acabo un registro de los datos 
 * en cada modalidad del juego.
 * @author s6x
 */
public abstract class MatchMode {
    private short nGamesPlayed;
    private short nVictories;
    private short nDraws;
    private short nDefeats;
    private short nGoalsScored;
    private short nGoalsConceded;
    private short nMatchesWithoutFitting;
    private short nRedCards;
    private short nYellowCards;
    private short nBiggestWin;
    private short nBiggestDefeat;
    private float winningPercentage;
    private final TypeResults [] previousResults;
    
    private static final int VALID_NUMBER_OF_PREVIOUS_RESULTS=5;
    private final String matchModeName;

    public MatchMode(String matchModeName) {
        this.matchModeName=matchModeName;
        this.previousResults=new TypeResults[VALID_NUMBER_OF_PREVIOUS_RESULTS];
    }

    public String getMatchModeName() {
        return matchModeName;
    }
       
    @Override
    public String toString() {
        return "MatchInfo. " + "[ " + this.getMatchModeName() + " ]\n" +  
                "\n\tNumber of Games Played : " + nGamesPlayed + 
                "\n\tNumber of Victories : " + nVictories + 
                "\n\tNumber of Draws : " + nDraws + 
                "\n\tNumber of Defeats : " + nDefeats + 
                "\n\tNumber of Goals Scored : " + nGoalsScored + 
                "\n\tNumber of Goals Conceded : " + nGoalsConceded + 
                "\n\tNumber of Matches Without Fitting : " + nMatchesWithoutFitting + 
                "\n\tNumber of Red Cards : " + nRedCards +
                "\n\tNumber of Yellow Cards : " + nYellowCards + 
                "\n\tNumber of Biggest Win : " + nBiggestWin + 
                "\n\tNumber of Biggest Defeat : " + nBiggestDefeat + 
                "\n\tWinning Percentage : " + winningPercentage + 
                "\n\tPrevious Results : " + Arrays.toString(previousResults);
    }
    
    
    
    
    
    
    
    
}

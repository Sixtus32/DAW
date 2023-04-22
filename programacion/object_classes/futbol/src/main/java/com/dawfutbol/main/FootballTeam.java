/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.main;

import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author s6x
 */
public class FootballTeam {
    private String footballTeamName;
    private ArrayList<SoccerPlayer> players;
    
    public FootballTeam(String teamName) {
        this.footballTeamName=teamName;
        this.players=new ArrayList<>();
        this.players.add(new SoccerPlayer());
        this.players.add(new SoccerPlayer());
    }
    
    public void showPlayers(Graphics2D g2d){
        for (SoccerPlayer player : players) {
            player.draw(g2d);
        }
    }
    
    public void hirePlayer(SoccerPlayer...soccerPlayers){
        for (SoccerPlayer soccerPlayer : soccerPlayers) {
            if(soccerPlayer != null){
                this.players.add(soccerPlayer);
                if (soccerPlayer.isSummoned()){
                    
                }
            }
        }
    }

    public String getFootballTeamName() {
        return footballTeamName;
    }
    
    
    
    
    
}

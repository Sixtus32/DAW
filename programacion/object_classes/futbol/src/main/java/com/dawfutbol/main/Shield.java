/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.dawfutbol.main;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author s6x
 */
public enum Shield {
    
    BARCELONA_FC(FolderManeger.SHIELD_FOLDER+"001-barcelona.png"),
    MANCHERTER_CITY(FolderManeger.SHIELD_FOLDER+"002-mancherter-city.png"),
    MANCHERTER_UNITED(FolderManeger.SHIELD_FOLDER+"003-mancherter-united.png"),
    REAL_MADRID_FC(FolderManeger.SHIELD_FOLDER+"006-real-madrid.png"),
    PARIS_SAINT_GERMAIN(FolderManeger.SHIELD_FOLDER+"007-pares-saint-germain.png"),
    CHELSEA(FolderManeger.SHIELD_FOLDER+"011-chelsea.png"),
    ARSENAL(FolderManeger.SHIELD_FOLDER+"012-arsenal.png"),
    LIVERPOOL(FolderManeger.SHIELD_FOLDER+"013-liverpool.png"),
    NAPOLI(FolderManeger.SHIELD_FOLDER+"014-napoli.png"),
    BAYERN_MUNICHEN(FolderManeger.SHIELD_FOLDER+"015-bayern-munchen.png"),
    ROMA(FolderManeger.SHIELD_FOLDER+"016-roman.png"),
    ATLETICO_MADRID(FolderManeger.SHIELD_FOLDER+"017-atletico-de-madrid.png"),
    BORUSSIA_DORTMUND(FolderManeger.SHIELD_FOLDER+"018-borussia-dortmund.png"),
    JUVENTUS(FolderManeger.SHIELD_FOLDER+"019-juventus.png"),
    BAYERN_LEVERKUSEN(FolderManeger.SHIELD_FOLDER+"020-bayern-leverkusen.png"),
    VILLAREAL(FolderManeger.SHIELD_FOLDER+"021-villareal.png"),
    TOTTENHAM_HOTSPUR(FolderManeger.SHIELD_FOLDER+"022-tottenham-hotspur.png"),
    LAZIO(FolderManeger.SHIELD_FOLDER+"023-lazio.png"),
    OLYMPIQUE_LYONNAIS(FolderManeger.SHIELD_FOLDER+"024-olymipique-lyonnais.png"),
    OLYMPIQUE_MARSEILLE(FolderManeger.SHIELD_FOLDER+"026-olympique-de-marseille.png"),
    MONACO(FolderManeger.SHIELD_FOLDER+"028-monaco.png"),
    NICE(FolderManeger.SHIELD_FOLDER+"029-nice.png"),
    SAMPDORIA(FolderManeger.SHIELD_FOLDER+"030-sampdoria.png"),
    SEVILLA(FolderManeger.SHIELD_FOLDER+"038-sevilla.png"),
    SCHALKE_04(FolderManeger.SHIELD_FOLDER+"033-schalke-04.png"),
    INTER_MILAN(FolderManeger.SHIELD_FOLDER+"034-internazional-milano.png"),
    BORUSSIA_MONCHENGLADACH(FolderManeger.SHIELD_FOLDER+"035-borussia-monchengladach.png"),
    VALENCIA(FolderManeger.SHIELD_FOLDER+"037-valencia.png"),
    // NO IDEA WHAT TO DO WITH THEN
    NONE(FolderManeger.SHIELD_FOLDER+"025-football.png"), 
    NONE_NORMAL(FolderManeger.SHIELD_FOLDER+"027-shield.png"),
    NONE_UPGRADE(FolderManeger.SHIELD_FOLDER+"036-football-club.png")
    ;
    
    private Shield(String shieldFile) {
        this.SHIELD_FILENAME = shieldFile;
        try {
            this.shieldImage=ImageIO.read(new File(this.SHIELD_FILENAME));
        } catch (IOException ex) {
            System.out.println("ERROR. IMAGE NOT FOUND.\nFile at : " + this.SHIELD_FILENAME + " wasn't found.");
        }
    }

    public String getSHIELD_FILENAME() {
        return SHIELD_FILENAME;
    }

    public Image getShieldImage() {
        return shieldImage;
    }
    
    
    private final String SHIELD_FILENAME;
    private Image shieldImage;
}

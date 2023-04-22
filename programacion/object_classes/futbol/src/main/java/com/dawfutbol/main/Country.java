/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.dawfutbol.main;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author s6x
 */
// resource from -> https://www.flaticon.com/packs/countrys-flags/

public enum Country {
    ARGENTINA(FolderManeger.FLAG_FOLDER+"argentina.png"),
    AUSTRALIA(FolderManeger.FLAG_FOLDER+"australia.png"),
    AUSTRIA(FolderManeger.FLAG_FOLDER+"austria.png"),
    BELGIUM(FolderManeger.FLAG_FOLDER+"belgium.png"),
    BRAZIL(FolderManeger.FLAG_FOLDER+"brazil.png"),
    CANADA(FolderManeger.FLAG_FOLDER+"canada.png"),
    CHINA(FolderManeger.FLAG_FOLDER+"china.png"),
    COLOMBIA(FolderManeger.FLAG_FOLDER+"colombia.png"),
    COSTA_RICA(FolderManeger.FLAG_FOLDER+"costa-rica.png"),
    CROATIA(FolderManeger.FLAG_FOLDER+"croatia.png"),
    CHILE(FolderManeger.FLAG_FOLDER+"chile.png"),
    CZECH_REPUBLIC(FolderManeger.FLAG_FOLDER+"czech-republic.png"),
    DENMARK(FolderManeger.FLAG_FOLDER+"denmark.png"),
    ECUADOR(FolderManeger.FLAG_FOLDER+"ecuador.png"),
    EGYPT(FolderManeger.FLAG_FOLDER+"north-korea.png"), /// IMPORTANTE. BUSCAR EL DE EGIPTO.S
    ENGLAND(FolderManeger.FLAG_FOLDER+"england.png"),
    FINLAND(FolderManeger.FLAG_FOLDER+"finland.png"),
    FRANCE(FolderManeger.FLAG_FOLDER+"france.png"),
    GERMANY(FolderManeger.FLAG_FOLDER+"germany.png"),
    HONDURAS(FolderManeger.FLAG_FOLDER+"honduras.png"),
    ICELAND(FolderManeger.FLAG_FOLDER+"iceland.png"),
    INDIA(FolderManeger.FLAG_FOLDER+"india.png"),
    INDONESIA(FolderManeger.FLAG_FOLDER+""), // 6
    IRELAND(FolderManeger.FLAG_FOLDER+"ireland.png"),
    ISRAEL(FolderManeger.FLAG_FOLDER+"israel.png"),
    ITALY(FolderManeger.FLAG_FOLDER+"italy.png"),
    IVORY_COAST(FolderManeger.FLAG_FOLDER+"ivory-coast.png"),
    JAMAICA(FolderManeger.FLAG_FOLDER+"jamaica.png"),
    JAPAN(FolderManeger.FLAG_FOLDER+"japan.png"),
    JORDAN(FolderManeger.FLAG_FOLDER+"jordan.png"),
    SOUTH_KOREA(FolderManeger.FLAG_FOLDER+"south-korea.png"),
    KUWAIT(FolderManeger.FLAG_FOLDER+"kuwait.png"),
    LATVIA(FolderManeger.FLAG_FOLDER+"latvia.png"),
    LEBANON(FolderManeger.FLAG_FOLDER+"lebanon.png"),
    LITHUANIA(FolderManeger.FLAG_FOLDER+"lithuania.png"),
    LUXEMBOURG(FolderManeger.FLAG_FOLDER+"luxembourg.png"),
    MALTA(FolderManeger.FLAG_FOLDER+"malta.png"), 
    MEXICO(FolderManeger.FLAG_FOLDER+"mexico.png"),
    MOROCCO(FolderManeger.FLAG_FOLDER+"morocco.png"),
    NETHERLANDS(FolderManeger.FLAG_FOLDER+"netherlands.png"),
    NEW_ZEALAND(FolderManeger.FLAG_FOLDER+"new-zealand.png"),
    NORWAY(FolderManeger.FLAG_FOLDER+"norway.png"),
    NIGERIA(FolderManeger.FLAG_FOLDER+"nigeria.png"), 
    PANAMA(FolderManeger.FLAG_FOLDER+"panama.png"),
    PERU(FolderManeger.FLAG_FOLDER+"peru.png"),
    POLAND(FolderManeger.FLAG_FOLDER+"poland.png"),
    PORTUGAL(FolderManeger.FLAG_FOLDER+"portugal.png"),
    QATAR(FolderManeger.FLAG_FOLDER+"qatar.png"),
    ROMANIA(FolderManeger.FLAG_FOLDER+"romania.png"),
    RUSSIA(FolderManeger.FLAG_FOLDER+"russia.png"), 
    SERBIA(FolderManeger.FLAG_FOLDER+"serbia.png"),
    SENEGAL(FolderManeger.FLAG_FOLDER+"senegal.png"),
    SLOVAKIA(FolderManeger.FLAG_FOLDER+"slovakia.png"),
    SLOVENIA(FolderManeger.FLAG_FOLDER+"slovenia.png"),
    SOUTH_AFRICA(FolderManeger.FLAG_FOLDER+"south-africa.png"),
    SPAIN(FolderManeger.FLAG_FOLDER+"spain.png"),
    SWEDEN(FolderManeger.FLAG_FOLDER+"sweden.png"),
    SWITZERLAND(FolderManeger.FLAG_FOLDER+"switzerland.png"),
    TURKEY(FolderManeger.FLAG_FOLDER+"turkey.png"),
    UKRAINE(FolderManeger.FLAG_FOLDER+"ukraine.png"),
    URUGUAY(FolderManeger.FLAG_FOLDER+"uruguay.png"),
    UNITED_STATES(FolderManeger.FLAG_FOLDER+"united-states.png"),
    UNITED_KINGDOM(FolderManeger.FLAG_FOLDER+"united-kingdom.png"),
    WALES(FolderManeger.FLAG_FOLDER+"wales.png"),
    NONE(FolderManeger.FLAG_FOLDER+"north-korea.png"); 
    
    private Country(String countryFlagUrl) {
        this.COUNTRY_FLAG_URL = countryFlagUrl;
        try {
            this.flagImg=ImageIO.read(new File(countryFlagUrl));
        } catch (IOException ex) {
            Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String countryFlagFilename(){
        return this.COUNTRY_FLAG_URL;
    }
    
    public Image flagImage(){
        return this.flagImg;
    }

    private final String COUNTRY_FLAG_URL;
    private Image flagImg;
}

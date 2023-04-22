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
public enum Emoji {
    LIKE(FolderManeger.EXTRA_FOLDER+"017-smile.png"),
    STAR(FolderManeger.EXTRA_FOLDER+"018-star.png"),
    CONFUSED(FolderManeger.EXTRA_FOLDER+"019-confused.png"),
    SMILE(FolderManeger.EXTRA_FOLDER+"020-smile-1.png"),
    SAD(FolderManeger.EXTRA_FOLDER+"021-sad.png"),
    ANGRY(FolderManeger.EXTRA_FOLDER+"022-angry.png"),
    COOL(FolderManeger.EXTRA_FOLDER+"023-cool.png"),
    SHOCKED(FolderManeger.EXTRA_FOLDER+"024-shocked.png"),
    MONEY(FolderManeger.EXTRA_FOLDER+"025-emoji.png"),
    LAUGHING(FolderManeger.EXTRA_FOLDER+"026-laughing.png");
    
    private Emoji(String emojiFile) {
        this.EMOJI_FILENAME = emojiFile;
        try {
            this.emojiImage=ImageIO.read(new File(this.EMOJI_FILENAME));
        } catch (IOException ex) {
            System.out.println("ERROR. IMAGE NOT FOUND.\nFile at : " + this.EMOJI_FILENAME + " wasn't found.");
        }
    }

    public Image getEmojiImage() {
        return emojiImage;
    }

    public String getEMOJI_FILENAME() {
        return EMOJI_FILENAME;
    }
    
    private final String EMOJI_FILENAME;
    private Image emojiImage;
}

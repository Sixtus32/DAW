/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

/**
 *
 * @author s6x
 */
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ReproductorAudio {

    public static void main(String[] args) {
        File archivoAudio = new File("res/audio/no-time-no-space.mp3");
        
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(archivoAudio));
            clip.start();
        } catch (Exception e) {
            System.out.println("Se jodio.");
        }
        

    }
}

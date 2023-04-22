
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author s6x
 */
public enum TypeResults {
    VICTORIES('V', Color.green),
    DRAWS('E', Color.orange),
    DEFEATS('D', Color.red);

    private TypeResults(char c, Color resultColor) {
        this.resultChar=c;
        this.resultColor=resultColor;
    }
    
    private final char resultChar;
    private final Color resultColor;
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author s6x
 */
public class GlobalData {
    
    private final MatchMode careerMode;
    private final MatchMode liveMode;
    private final MatchMode friendlyMode;
    
    public GlobalData(MatchMode careerMode, MatchMode liveMode, MatchMode friendlyMode) {
        this.careerMode = careerMode;
        this.liveMode = liveMode;
        this.friendlyMode = friendlyMode;
    }
}

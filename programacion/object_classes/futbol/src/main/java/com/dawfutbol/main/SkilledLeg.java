/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.main;

/**
 *
 * @author s6x
 */
public enum SkilledLeg {
    RIGTHHAND('D'),AMBIDEXTROUS('A'),LEFTHAND('I');

    private SkilledLeg(char abbreviation) {
        this.ABBREVIATION=abbreviation;
    }
    private final char ABBREVIATION;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dawfutbol.interfaces;

import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *@version  1.0
 * @author s6x
 */
public interface Designable {
    // para iniciarlizar las figuras nesariaria para diseñar el objeto disenable.
    void initComponentShapes();

    default void cleverRender(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
    }
}

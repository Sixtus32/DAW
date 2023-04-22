package com.damagedearth.Utilities;

import com.damagedearth.Utilities.Components.TrueTypeFont;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class FontRenderer
{
    private Font f;
    private TrueTypeFont trueTypeFont;

    public FontRenderer()
    {
        f = new Font("Times New Roman", Font.PLAIN, 20);
        trueTypeFont = new TrueTypeFont(f, true);
    }

    public void drawString(String s, double x, double y)
    {
        trueTypeFont.drawString((float) x, (float) y, s, 1.0F, 1.0F);
    }

    public void drawCenterString(String s, double x, double y)
    {
        trueTypeFont.drawString((float) x, (float) y, s, 1.0F, 1.0F, TrueTypeFont.ALIGN_CENTER);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui.components;

import com.dawfutbol.interfaces.Designable;
import com.dawfutbol.main.FolderManeger;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
/**
 *
 * @author s6x 🕕
 */
public class ShopButton extends JButton implements Designable{   
    private static final long serialVersionUID = 1L;
    private static final String PLUS_SIGN="+";
    private int currentAmount;
    private Rectangle2D productRect;
    private Rectangle2D signRect;    
    private Rectangle2D rectImage;
    private Rectangle2D rectQuatity;
    
    private String productImageFilename;
    private Font shopButtonFont;
    
    private Image btnIconImage;
    private int btnIconWidth;
    private int btnIconHeight;
    
    private Color bgColor;
    private Color inColor;
    private Color plusColor;
    private Color quantityColor;

    private final static String DEFAULT_FONT_NAME="Consolas";
    private final static int DEFAULT_FONT_STYLE=Font.BOLD;
    private final static int DEFAULT_FONT_SIZE=16;
    
    private final static int DEFAULT_ICON_WIDTH=18;
    private final static int DEFAULT_ICON_HEIGHT=18;
   
    private final static Color DEFAULT_PLUS_SIGN_COLOR=Color.GREEN;
    private final static Color DEFAULT_QUANTITY_COLOR=Color.WHITE;
    private final static Color DEFAULT_BUTTON_BG_COLOR=new Color(20, 20, 20);
    private final static Color DEFAULT_BUTTON_IN_COLOR=new Color(49, 49, 49);

    public ShopButton() {
        // NO TIENEN POR QUE ENTENDERLO 😅
        this(FolderManeger.ICON_FOLDER+"diamond-solid-24.png", W, H);
    }
    
    
    // recomendation use the other constructor.
    public ShopButton(String shopProductImagefilename, int btnWidth, int btnHeight) {
        currentAmount=0;
        //Configuracion por defecto del botón.
        this.productImageFilename=shopProductImagefilename;
        this.bgColor=DEFAULT_BUTTON_BG_COLOR;
        this.inColor=DEFAULT_BUTTON_IN_COLOR;
        this.plusColor=DEFAULT_PLUS_SIGN_COLOR;
        this.quantityColor=DEFAULT_QUANTITY_COLOR;
        this.btnIconWidth=DEFAULT_ICON_WIDTH;
        this.btnIconHeight=DEFAULT_ICON_HEIGHT;
        setBackground(bgColor);
        setPreferredSize(new Dimension(btnWidth, btnHeight));
        this.shopButtonFont=new Font(DEFAULT_FONT_NAME, DEFAULT_FONT_STYLE, DEFAULT_FONT_SIZE);
        this.addActionListener((ActionEvent e) -> {
            increaseCurrentAmount();
            repaint();
        });
        setBorderPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setFocusPainted(false);
        setFocusable(true);
    }
    
    public ShopButton(String shopProductImagefilename, int btnWidth, int btnHeight, String fontName, int fontStyle, int fontSize) {
        this(shopProductImagefilename,btnWidth,btnHeight);
        this.shopButtonFont=new Font(fontName, fontStyle, fontSize);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); 
        repaint();
        Graphics2D g2d=(Graphics2D) g;
        cleverRender(g2d);
        // REDIMENSIONAR ANTES DE NADA.
//        resize();
        initComponentShapes();
        // Cuadrado del producto con cantidad
        g2d.setColor(inColor);
        g2d.setStroke(new BasicStroke(1.5f));
        g2d.fill(productRect);
        
        // Cuadrado con la imagen del diamante
        g2d.setColor(inColor);
        g2d.fill(rectImage);
        g2d.setFont(shopButtonFont);

        Image img=null;
        try {
            btnIconImage=ImageIO.read(new File(productImageFilename));
            img= btnIconImage.getScaledInstance(btnIconWidth, btnIconHeight, Image.SCALE_SMOOTH);
            btnIconImage.flush();
        } catch (IOException ex) {
            System.out.println("ERROR (Medium Error).  ShopButton -> IMAGE NOT FOUND.");
        } 
        g2d.drawImage(img, 
                      (int)rectImage.getX() + imgPox, 
                      (int)rectImage.getY() + imgPoY,
                      null);
        
        // Cuadrado con los números
        g2d.setColor(inColor);
        g2d.fill(rectQuatity);
        g2d.setColor(quantityColor);
        g2d.drawString(Integer.toString(currentAmount), 
                (int) rectQuatity.getX() + quantityValueX, 
                (int) rectQuatity.getY() + quantityValueY);
        
        // Cuadrado con el signo +
        g2d.setColor(new Color(5, 5, 5));
        g2d.setStroke(new BasicStroke(2.75f));
        g2d.fill(signRect);
        
        //Dibujando el signo de suma.
        g2d.setColor(plusColor);
        g2d.setFont(new Font(shopButtonFont.getName(), shopButtonFont.getStyle(), shopButtonFont.getSize() + sizeSign));
        g2d.drawString(PLUS_SIGN, (float) signRect.getCenterX() - signX, (float) signRect.getCenterY() + signY);
        g2d.dispose();
    }
    
    

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }
    
    public void increaseCurrentAmount(){
        this.currentAmount++;
    }
    
    public void decreaseCurrentAmount(){
        this.currentAmount--;
    }
    


    @Override
    public void initComponentShapes() {
        productRect=new Rectangle2D.Float(prodX, prodY, 
                                        this.getWidth() - (this.getWidth() * prodRectWIncrease), 
                                        this.getHeight() - (this.getHeight() * prodRectHIncrease));
        
        rectImage=new Rectangle2D.Float((float)productRect.getX(), 
                                        (float) productRect.getY(), 
                                        (float) (productRect.getWidth() - (productRect.getWidth() * imgRectW) + 4), 
                                        (float) productRect.getHeight());
        
        rectQuatity=new Rectangle2D.Float((float) rectImage.getMaxX(), 
                                          (float) rectImage.getY(), 
                                          (float) (productRect.getWidth() - (productRect.getWidth() * quantityRectW)), 
                                        (float) productRect.getHeight());
        
        
        signRect=new Rectangle2D.Float( (float)productRect.getMaxX(),
                                        (float)productRect.getY(), 
                                        this.getWidth() - (this.getWidth() * signRectW), 
                                        this.getHeight() - (this.getHeight() * signRectH)); 
    }

    public Font getShopButtonFont() {
        return shopButtonFont;
    }

    public void setShopButtonFont(Font shopButtonFont) {
        this.shopButtonFont = shopButtonFont;
    }

    public Image getButtonImage() {
        return btnIconImage;
    }

    public void setButtonImage(Image buttonImage) {
        this.btnIconImage = buttonImage;
    }

    public Color getBgColor() {
        return bgColor;
    }

    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
    }

    public Color getInColor() {
        return inColor;
    }

    public void setInColor(Color inColor) {
        this.inColor = inColor;
    }

    public Color getPlusColor() {
        return plusColor;
    }

    public void setPlusColor(Color plusColor) {
        this.plusColor = plusColor;
    }

    public Color getQuantityColor() {
        return quantityColor;
    }

    public void setQuantityColor(Color quantityColor) {
        this.quantityColor = quantityColor;
    }

    public String getProductImageFilename() {
        return productImageFilename;
    }

    public void setProductImageFilename(String productImageFilename) {
        this.productImageFilename = productImageFilename;
    }

    public int getButtonImageWidth() {
        return btnIconWidth;
    }

    public void setButtonImageWidth(int buttonImageWidth) {
        this.btnIconWidth = buttonImageWidth;
    }

    public int getButtonImageHeight() {
        return btnIconHeight;
    }

    public void setButtonImageHeight(int buttonImageHeight) {
        this.btnIconHeight = buttonImageHeight;
    }


    private static final int W=100,H=40;   
    private final float   prodX=3.5f,
                    prodY=3.5f,
                    prodRectWIncrease=0.35f,
                    prodRectHIncrease=0.15f,
                    imgRectW=0.75f,
                    quantityRectW=0.25f,
                    signRectW=0.65f,
                    signRectH=0.15f;
    private final int imgPox=4,
                imgPoY=7,
                quantityValueX=8, 
                quantityValueY=21,
                sizeSign=5,
                signX=8, 
                signY=4;  
}

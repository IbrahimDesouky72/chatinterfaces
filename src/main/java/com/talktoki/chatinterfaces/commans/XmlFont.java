/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talktoki.chatinterfaces.commans;

import java.io.Serializable;
import javafx.scene.text.FontWeight;

/**
 *
 * @author IbrahimDesouky
 */
public class XmlFont implements Serializable{
    
    protected String fontSize;
    
    protected String fontFamily;
    
    protected FontWeight fontWeight;

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public String getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public FontWeight getFontType() {
        return fontWeight;
    }
    
    
}

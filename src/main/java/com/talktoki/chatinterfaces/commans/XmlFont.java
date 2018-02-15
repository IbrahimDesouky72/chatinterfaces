/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talktoki.chatinterfaces.commans;

/**
 *
 * @author IbrahimDesouky
 */
public class XmlFont {
    
    protected String fontSize;
    
    protected String fontFamily;
    
    protected String fontType;

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setFontType(String fontType) {
        this.fontType = fontType;
    }

    public String getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public String getFontType() {
        return fontType;
    }
    
    
}

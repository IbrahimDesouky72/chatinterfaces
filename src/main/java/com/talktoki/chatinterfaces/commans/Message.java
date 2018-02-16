package com.talktoki.chatinterfaces.commans;

import java.io.Serializable;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author mahrous
 */
public class Message implements Serializable {

    private String text;
    //private Font font;
    private String textColor;
    private String fontFamily;
    private String fontSize;
    private String fontWeight;
    
    
    public Message(String text, String textColor, String fontFamily, String fontSize, String fontWeight) {
        this.text = text;
        this.textColor = textColor;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.fontWeight = fontWeight;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }

    public Message() {
        fontFamily="";
        fontSize="";
        fontWeight="";
        text="";
        textColor="";
    }
    

   

    
    /**
     * sets message text for any message
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * gets message text
     *
     * @return message text content
     */
    public String getText() {
        return text;
    }


    /**
     * sets text color of a message
     *
     * @param color
     */
    public void setTextColor(String color) {
        textColor = color;
    }

    /**
     * gets text color of the message
     *
     * @return text color
     */
    public String getTextColor() {
        return textColor;
    }


}

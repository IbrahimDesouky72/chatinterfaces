package com.talktoki.chatinterfaces.commans;

import java.io.Serializable;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author mahrous
 */
public class Message implements Serializable {

    protected String text;
    
    protected String date;
    
    protected String from;
    
    protected String to;
    
    protected String time;
    
    protected String fontFamily;
    
    protected String fontSize;
    
    protected String fontWeight;
    
    protected String textColor;
    
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

    public void setDate(String date) {
        this.date = date;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getTime() {
        return time;
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

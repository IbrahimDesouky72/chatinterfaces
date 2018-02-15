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
    private XmlFont font;
    private String textColor;
    

    public Message() {
        text = "";
    }

    public Message(String text, XmlFont font, String textColor) {
        this.text = text;
        this.font = font;
        this.textColor = textColor;
        
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
     * sets font for that message
     *
     * @param font
     */
    public void setFont(XmlFont font) {
        this.font = font;
    }

    /**
     * gets font of the message
     *
     * @return
     */
    public XmlFont getFont() {
        return font;
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

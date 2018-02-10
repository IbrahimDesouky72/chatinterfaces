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
    private Font font;
    private Color textColor;
    private boolean isBold, isItalic;

    public Message() {
        text = "";
    }

    public Message(String text, Font font, Color textColor, boolean isBold, boolean isItalic) {
        this.text = text;
        this.font = font;
        this.textColor = textColor;
        this.isBold = isBold;
        this.isItalic = isItalic;
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
    public void setFont(Font font) {
        this.font = font;
    }

    /**
     * gets font of the message
     *
     * @return
     */
    public Font getFont() {
        return font;
    }

    /**
     * sets text color of a message
     *
     * @param color
     */
    public void setTextColor(Color color) {
        textColor = color;
    }

    /**
     * gets text color of the message
     *
     * @return text color
     */
    public Color getTextColor() {
        return textColor;
    }

    /**
     * sets bold attribute
     *
     * @param bold
     */
    public void setBold(boolean bold) {
        isBold = bold;
    }

    /**
     * gets boold attribute
     *
     * @return true if message text is bold or false other wise
     */
    public boolean isBold() {
        return isBold;
    }

    /**
     * sets Italic attribute
     *
     * @param italic
     */
    public void setItalic(boolean italic) {
        isItalic = italic;
    }

    /**
     * gets Italic attribute
     *
     * @return true if message text is bold or false other wise
     */
    public boolean isItalic() {
        return isItalic;
    }
}

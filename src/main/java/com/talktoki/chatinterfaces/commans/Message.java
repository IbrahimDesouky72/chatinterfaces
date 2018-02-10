package com.talktoki.chatinterfaces.commans;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author mahrous
 */
public interface Message {

    /**
     * sets message text for any message
     *
     * @param text
     */
    public void setText(String text);

    /**
     * gets message text
     *
     * @param text
     * @return message text content
     */
    public String getText(String text);

    /**
     * sets font for that message
     *
     * @param font
     */
    public void setFont(Font font);

    /**
     * gets font of the message
     *
     * @return
     */
    public Font getFont();

    /**
     * sets text color of a message
     *
     * @param color
     */
    public void setTextColor(Color color);

    /**
     * gets text color of the message
     *
     * @return text color
     */
    public Color getTextColor();

    /**
     * sets bold attribute
     */
    public void setBold(Boolean bold);

    /**
     * gets boold attribute
     *
     * @return true if message text is bold or false other wise
     */
    public boolean isBold();

    /**
     * sets Italic attribute
     */
    public void setItalic(Boolean italic);

    /**
     * gets Italic attribute
     *
     * @return true if message text is bold or false other wise
     */
    public boolean isItalic();

}

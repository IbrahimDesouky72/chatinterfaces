package commans;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author mahrous
 */
public interface Message {
    
    public void setText( String text );
    public String getText( String text );
    
    public void setFont(Font font);
    public Font getFont();
    
    public void setColor( Color color);
    public Color getColor();
    
}

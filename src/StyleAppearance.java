/*
This program is to change appearance using methods (setBackground(),
setforeground(),setOpaque(),setFont()).
*/

import javax.swing.*;
import java.awt.*;

public class StyleAppearance extends JFrame {
    JPanel pnl = new JPanel();

    JLabel lbl1 = new JLabel( "Custom Background" ) ;
    JLabel lbl2 = new JLabel( "Custom Foreground" ) ;
    JLabel lbl3 = new JLabel( "Custom Font" ) ;

    Color customColor = new Color(0,255,0);
    Font customFont = new Font("Serif",Font.PLAIN, 48);
    Box customBox = Box.createVerticalBox();


    public StyleAppearance(){
        super( "Swing Window" );
        setSize( 500,200 );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        add(pnl);

        lbl1.setOpaque(true);
        lbl1.setBackground(Color.DARK_GRAY);

        lbl2.setForeground(customColor);

        lbl3.setFont(customFont);

        customBox.add(lbl1);
        customBox.add(lbl2);
        customBox.add(lbl3);

        pnl.add(customBox);

        setVisible( true );
    }

    public static void main(String[] args) {
        StyleAppearance gui = new StyleAppearance();
    }
}

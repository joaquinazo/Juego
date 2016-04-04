import javafx.scene.text.*;

import java.awt.*;
import java.awt.Font;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Juako on 31/3/16.
 */
public class MyCanvas extends Canvas {
    public static int IESTADO_MENU = 1;
    public static int IESTADO_JUEGO = 2;
    public int IESTADO_ACTUAL = IESTADO_MENU;
    public int counter = 0;

    public MyCanvas() {

        super();
    }

    public void setIESTADO_ACTUAL(int IESTADO_ACTUAL) {
        this.IESTADO_ACTUAL = IESTADO_ACTUAL;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;

        if (IESTADO_ACTUAL == IESTADO_MENU) {
            PaintMenu(graphics2D);
        } else if (IESTADO_ACTUAL == IESTADO_JUEGO) {
            PaintJuego(graphics2D);
        }


    }

    public void PaintMenu(Graphics2D p) {
        int fontSize = 20;
        Font f = new Font("Dialog", Font.PLAIN, fontSize);
        int fontSize2 = 35;
        Font f2 = new Font("Helvetica", Font.BOLD, fontSize2);
        setBackground(Color.black);
        p.setColor(Color.white);
        p.setFont(f2);
        p.drawString("MENU", 320, 310);
        p.setFont(f);
        p.setColor(Color.gray);
        p.drawString("JUGAR", 340, 440);
        p.setColor(Color.white);
        p.drawString("OPCIONES", 340, 470);
        p.drawString("SALIR", 340, 500);


    }

    public void PaintJuego(Graphics2D q) {
        setBackground(Color.black);
        q.setColor(Color.GREEN);
        q.drawString("JUEGO", 350, 390);
    }
}

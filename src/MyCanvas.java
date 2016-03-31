import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Juako on 31/3/16.
 */
public class MyCanvas extends Canvas {
    public static int IESTADO_MENU = 1;
    public static int IESTADO_JUEGO = 2;
    public int IESTADO_ACTUAL = IESTADO_MENU;

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
        setBackground(Color.black);
        p.setColor(Color.GREEN);
        p.drawString("MENU", 350, 390);
    }

    public void PaintJuego(Graphics2D q) {
        setBackground(Color.black);
        q.setColor(Color.GREEN);
        q.drawString("JUEGO", 350, 390);
    }
}

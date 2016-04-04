import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

/**
 * Created by Juako on 31/3/16.
 */

//La clase menu implementa Keylistener.
public class Menu implements KeyListener{
    MyCanvas myCanvas;
    int counter = 0;

    public Menu(MyCanvas myCanvas) {
        this.myCanvas = myCanvas;
        this.myCanvas.addKeyListener(this);


    }

    public void menuPrincipal(MyCanvas myCanvas) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
      /*  if (e.getKeyChar()== 'a' ){
            myCanvas.setIESTADO_ACTUAL(MyCanvas.IESTADO_JUEGO);
        }else if (e.getKeyChar()== 'b' ){
            myCanvas.setIESTADO_ACTUAL(MyCanvas.IESTADO_MENU);
        } */
        if (e.getKeyChar()=='a'){
            counter++;
       
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.printf("RELEASED " + e);
    }
}




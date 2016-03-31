import javax.swing.*;

/**
 * Created by Juako on 31/3/16.
 */
public class Activity {
    JFrame jFramePrincipal;

    public Activity() {
        jFramePrincipal = new JFrame();
        jFramePrincipal.setBounds(300, 300, 800, 800);

        MyCanvas myCanvas = new MyCanvas();
        new Menu(myCanvas);
        jFramePrincipal.add(myCanvas);
        jFramePrincipal.setVisible(true);

    }


    public static void main(String[] args) {
        new Activity();

    }
}

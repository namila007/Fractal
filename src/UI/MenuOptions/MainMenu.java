package UI.MenuOptions;

import com.sun.deploy.panel.JavaPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Namila on 9/11/2017.
 */
public class MainMenu extends JPanel implements ItemListener {
    private final static String MANDELBROT="Mandelbrot";
    private final static String JULIA="Julia";
    public MenuCombo menuCombo;
    public MenuJulia menuJulia;
    public  MenuMandel menuMandel;
    private JPanel cardboard;

    public MainMenu(){
        initialise();
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 800));
        setSize(400,800);
        add(menuCombo,BorderLayout.PAGE_START);

        cardboard=new JPanel(new CardLayout());
        add(cardboard,BorderLayout.CENTER);

        cardboard.add(menuMandel,MANDELBROT);
        cardboard.add(menuJulia,JULIA);


    }

    private void initialise(){
        menuCombo=new MenuCombo();
        menuJulia=new MenuJulia();
        menuMandel=new MenuMandel();
        menuCombo.comboBox1.addItemListener(this);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        CardLayout cardboardLayout = (CardLayout)(cardboard.getLayout());
        cardboardLayout.show(cardboard, (String)e.getItem());
    }


}

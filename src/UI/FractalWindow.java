package UI;

import Core.AbstractFractal;
import UI.MenuOptions.MainMenu;



import javax.swing.*;
import java.awt.*;

/**
 * Created by Namila on 8/2/2017.
 */

public class FractalWindow extends JFrame {


    public FractalWindow(String title, AbstractFractal fractal){

        setTitle(title);

        FractalPanel fractalPanel = new FractalPanel(fractal);
        getContentPane().add(fractalPanel, BorderLayout.LINE_START);
        MainMenu mainMenu=new MainMenu(fractalPanel,fractal,this);
        getContentPane().add(mainMenu);


    }
}

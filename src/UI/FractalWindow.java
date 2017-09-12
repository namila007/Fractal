package UI;

import Core.AbstractFractal;
import UI.FractalPanel;
import UI.MenuOptions.MainMenu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Namila on 8/2/2017.
 */

public class FractalWindow extends JFrame {


    public FractalWindow(String title, AbstractFractal fractal){

        setTitle(title);


        //setLayout(new GridLayout(1,2));
        // setLayout(new BorderLayout());
        FractalPanel fractalPanel = new FractalPanel(fractal);
        getContentPane().add(fractalPanel, BorderLayout.LINE_START);
        MainMenu mainMenu=new MainMenu();
        getContentPane().add(mainMenu);

     /*
        GridBagConstraints c=new GridBagConstraints();
        c.fill=GridBagConstraints.HORIZONTAL;



        c.fill=GridBagConstraints.BOTH;
        c.weightx=800;
        c.weighty=800;
        c.gridx=0;
        c.gridy=0;
        c.gridwidth=fractalPanel.getWidth();
        c.gridheight=fractalPanel.getHeight();
        c.anchor=GridBagConstraints.LINE_START;


        MainMenu mainMenu=new MainMenu();
        c.weightx=400;
        c.weighty=800;
        c.gridx=1;
        c.gridy=0;
        c.fill=GridBagConstraints.BOTH;
        c.anchor=GridBagConstraints.LINE_END;
       getContentPane().add(mainMenu,c);
*/


//        setTitle(title);
//       // setLayout(new GridLayout(1,2));
//        FractalPanel fractalPanel = new FractalPanel(fractal);
//        MainMenu mainMenu=new MainMenu();
//
//        setSize(new Dimension(fractal.frame_width+400,fractal.frame_height));
//        getContentPane().add(fractalPanel,BorderLayout.LINE_START);
//       // getContentPane().add(mainMenu);
//        System.out.println(getSize());
    }
}

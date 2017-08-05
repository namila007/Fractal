package UI;

import Core.AbstractFractal;
import UI.FractalPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Namila on 8/2/2017.
 */

public class FractalWindow extends JFrame {


    public FractalWindow(String title, AbstractFractal fractal){

        setTitle(title);
        setSize(new Dimension(fractal.frame_width,fractal.frame_height));

        FractalPanel fractalPanel = new FractalPanel(fractal);
        add(fractalPanel);
    }
}

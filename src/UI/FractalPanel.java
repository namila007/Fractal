package UI;

import Core.AbstractFractal;
import Core.ColourPoint;

import javax.swing.*;

import java.awt.*;
/**
 * Created by Namila on 7/25/2017.
 */
public class FractalPanel extends JPanel {
    AbstractFractal fractal;

    public FractalPanel(AbstractFractal fractal){

       this.fractal=fractal;
       setPreferredSize(new Dimension(800, 800));
        setSize(new Dimension(fractal.frame_height,fractal.frame_height));
        revalidate();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int x = 0; x <= fractal.frame_height; x++){
            for (int y = 0; y <= fractal.frame_width; y++){
                ColourPoint colourPoint=fractal.setPoints(x,y,fractal.getRealX(),fractal.getImagY());
                g.setColor(fractal.colourFractal(colourPoint.getIteration(),colourPoint.getZabs()));

                g.drawLine(x,y,x,y);
            }
        }


    }

    public void setFractal(AbstractFractal fractal) {
        this.fractal = fractal;
    }
}

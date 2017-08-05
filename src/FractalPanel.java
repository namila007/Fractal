import javax.swing.*;

import java.awt.*;
/**
 * Created by Namila on 7/25/2017.
 */
public class FractalPanel extends JPanel {
    AbstractFractal fractal;
    FractalPoints fractalPoints;

    public FractalPanel(AbstractFractal fractal){
         setSize(new Dimension(fractal.frame_height,fractal.frame_height));
       this.fractal=fractal;

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int x = 0; x <= 800; x++){
            for (int y = 0; y <= 800; y++){
                ColourPoint colourPoint=fractal.setPoints(x,y,fractal.getRealX(),fractal.getImagY());
                g.setColor(fractal.colourFractal(colourPoint.getIteration(),colourPoint.getZabs()));

                g.drawLine(x,y,x,y);
            }
        }


    }
}

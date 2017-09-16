package Core;

import java.util.HashMap;

/**
 * Created by Namila on 9/13/2017.
 */
public class FractalThreading implements Runnable{
    private AbstractFractal abstractFractal;
    public HashMap<Point,ColourPoint> map;

    public FractalThreading(AbstractFractal abstractFractal){
        this.abstractFractal=abstractFractal;
        map=new HashMap<>();
    }

    @Override
    public void run() {
        for (int x = 0; x <= abstractFractal.frame_height; x++){
            for (int y = 0; y <= abstractFractal.frame_width; y++) {
                   map.put(new Point(x,y),null);
            }
        }


    }
}

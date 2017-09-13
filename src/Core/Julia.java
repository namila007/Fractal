package Core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Namila on 8/3/2017.
 */
public class Julia extends AbstractFractal  {
private Complex C;

    public Julia(int frame_height,int frame_width,double real_max, double real_min,
                 double imag_max, double imag_min, int max_iterate,double realX,double imagY){

        super(frame_height,frame_width,real_max,real_min, imag_max, imag_min,max_iterate,realX,imagY);
        this.C=new Complex(realX,imagY);

    }

    public ColourPoint getJulia(int zx, int zy, double cx, double cy){
        return getIterations(getComplexPoint(zx,zy),new Complex(cx,cy));
    }

    @Override
    public ColourPoint setPoints(int zx, int zy, double cx, double cy) {
        return getIterations(getComplexPoint(zx,zy),new Complex(cx,cy));
    }


}

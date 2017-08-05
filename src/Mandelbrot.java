/**
 * Created by Namila on 7/25/2017.
 */


public class Mandelbrot extends AbstractFractal {
    Complex c;
    Complex z;

    public Mandelbrot( int frame_height,int frame_width,double real_max, double real_min,
                      double imag_max, double imag_min, int max_iterate){
        super(frame_height,frame_width,real_max,real_min, imag_max,imag_min,max_iterate,0,0);
    }


    @Override
    ColourPoint setPoints(int zx, int zy, double cx, double cy) {
        return getIterations(new Complex(0d,0d),getComplexPoint(zx,zy));

    }


}

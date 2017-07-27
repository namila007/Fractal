import com.sun.glass.ui.Size;

import javax.swing.*;

/**
 * Created by Namila on 7/25/2017.
 */
public abstract class Fractal {

    private int frame_height,frame_width,iterations,max_iterate;
    private double real_max,real_min,imag_max,imag_min;
    private double real,imag;
    private Complex z;

    public Fractal(int frame_height, int frame_width, double real_max, double real_min, double imag_max, double imag_min, int max_iterate){

    this.frame_height=frame_height;
    this.frame_width=frame_width;
    this.real_max=real_max;
    this.real_min=real_min;
    this.imag_max=imag_max;
    this.imag_min=imag_min;
    this.max_iterate=max_iterate;
}

    abstract Complex setComplexValues(int x, int y);



  public int calculateFractal(){

    for(int col=0;col<this.frame_height;col++){
        for(int row=0;row<this.frame_width;row++){
            new Mandelbrot(getComplexPoint(row,col));
        }


    }
    ;

}

    protected int getIterations(Complex z, Complex c){
     for(iterations=0; iterations<max_iterate;iterations++) {
         z = z.square().add(c);
        if(z.absolute()>4 && iterations>max_iterate) {
            return iterations;
        }
     }


    }

    public Complex getComplexPoint(int x, int y){
        real=real_min+(x/frame_width)*(real_max-real_min);
        imag=imag_max-(y/frame_height)*(imag_max-imag_min);

        return new Complex(real,imag);

    }








}

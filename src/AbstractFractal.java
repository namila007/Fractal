import com.sun.glass.ui.Size;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Namila on 7/25/2017.
 */
public abstract class AbstractFractal {

    public int frame_height,frame_width;
    private int max_iterate;
    private double real_max,real_min,imag_max,imag_min;
    private double realX,imagY,real,imag;
    private Complex z;
    private static double LOG_2=1/Math.log(2);
    private static double HALF_LOG=Math.log(0.5)*LOG_2;

    public AbstractFractal(int frame_height,int frame_width,double real_max, double real_min,
                           double imag_max, double imag_min, int max_iterate,double realX,double imagY){
        this.frame_height=frame_height;
        this.frame_width=frame_width;
        this.real_max=real_max;
        this.real_min=real_min;
        this.imag_max=imag_max;
        this.imag_min=imag_min;
        this.max_iterate=max_iterate;
        this.realX=realX;
        this.imagY=imagY;
    }

    public double getRealX() {
        return realX;
    }

    public double getImagY() {
        return imagY;
    }

    protected ColourPoint getIterations(Complex z, Complex c){

        int iterations=0;
         for(; iterations<max_iterate;iterations++) {
            if(z.absolute() > 4) {
                return new ColourPoint(iterations,z.absolute());
            }
             z = z.square().add(c);
         }

        return new ColourPoint(iterations,z.absolute());

    }

    public Complex getComplexPoint(int x, int y){
        real=real_min+ (double)x * (real_max - real_min)/800;
        imag=imag_max-(double)y * (imag_max - imag_min)/800;

        return new Complex(real,imag);

    }


    abstract ColourPoint setPoints(int zx,int zy,double cx,double cy);



        public Color colourFractal(int iteration, double z) {
            float red ,green, blue,count;

             count = (float)(iteration + 5- HALF_LOG - (Math.log(Math.log(z))/LOG_2)*(LOG_2));

             red = (float)(Math.sin(0.693f *count + 6f) * 128f + 127f);
             green = (float)(Math.cos(0.5f * count+ 4f) * 128f + 127f);
             blue = (float)(Math.cos(0.005f * count + 0.16f) * 128f + 127f);
             return new Color(clampBetween((int)red,0,255),clampBetween((int) green,0,255), clampBetween((int)blue,0,255));

        }


        int clampBetween(int value, int min, int max){
            if (value < min) return min;
            if (value > max) return max;
            return value;
        }








}

package UI;

import Core.Complex;

/**
 * Created by Namila on 8/5/2017.
 */
public class FractalPoints
{ private Complex z,c;

    public FractalPoints(Complex z,Complex c){
        this.z=z;
        this.c=c;
    }



    public Complex getZ() {
        return z;
    }

    public Complex getC() {
        return c;
    }
}

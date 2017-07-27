/**
 * Created by Namila on 7/25/2017.
 */


public class Mandelbrot extends Fractal {
    Complex c;
    Complex z;

    public Mandelbrot(Complex number){
        this.c =number;
        this.z =new Complex(0,0);
    }


    @Override

    public Complex setComplexValues(int x, int y) {
        return new Complex(x,y);
    }


}

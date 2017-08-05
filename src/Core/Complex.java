package Core;

/**
 * Created by Namila on 7/22/2017.
 */
public class Complex {
    private double x,y;

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Complex add(Complex number){
        return new Complex(x + number.getX(), y + number.getY());
    }

    public Complex subtract(Complex number){
        Complex z=new Complex(x-number.getX(), y-number.getY());
        return z;
    }

    public Complex multiply(Complex number){
        Complex z=new Complex(x*number.getX()-y*number.getY(),x*number.getY()+y*number.getX());
        return z;
    }
    public Complex square(){
        Complex z=new Complex(this.getX()*this.getX()-this.getY()*this.getY(),2*this.getX()*this.getY());
        return z;
    }

    public double absolute(){
      return this.getX()*this.getX()+this.getY()*this.getY();

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void print(){
        System.out.println(this.getX() +" i"+this.getY());
    }
}

/**
 * Created by Namila on 7/25/2017.
 */
public class Test {



    public static void main(String[] args) {
        Complex c=new Complex(2,1);
        c.square().print();
        c.add(new Complex(8,2)).print();
        c.subtract(new Complex(2,1)).print();
        System.out.println( c.absolute());
    }
}

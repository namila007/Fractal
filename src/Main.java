import javax.swing.*;
import java.awt.*;

/**
 * Created by Namila on 7/25/2017.
 */
public class Main {


    public static void main(String[] args) {
         int frame_height=800,frame_width=800,max_iterate=100;
         double real_max=1,real_min=-1,imag_max=1,imag_min=-1;
         double realX=-0.4 ,imagY=0.6;
         String title="Fractals";

        AbstractFractal fractal=new Mandelbrot(frame_height,frame_width,real_max,real_min,imag_max,imag_min,max_iterate);
        FractalWindow fractalWindow;
        for(String n:args){
            if(n.equals("mandelbrot") || n.equals("Mandelbrot")) {
                for (String k : args)
                    if ( k.equals("-h")|| k.equals("--help")) {
                        System.out.println("Enter Mandelbrot <realMin> <realMax> <imagMin> <imagMax> <maxIterations>");
                        System.out.println("user can give Mandelbrot with 0 or 5 or 6 args by ommiting iteration");
                        System.exit(1);

                    }
            }
            else if(n.equals("julia") || n.equals("Julia")) {
                for (String k : args)
                    if (k.equals("-h")|| k.equals("--help")) {
                        System.out.println("Enter Julia <realMin> <realMax> <imagMin> <imagMax> ");
                        System.out.println("user can give Mandelbrot with 0 or 4 args ");
                        System.exit(1);
                    }
            }
            else  {
                System.out.println("Enter Mandelbrot -h for get help or run Fractal Mandelbrot");
                System.out.println("Enter Julia -h for get help or run Fractal Julia");
                System.exit(1);
            }
        }

        if (args.length >= 1 && args.length<7) {

            if (args[0].equals("Mandelbrot") || args[0].equals("mandelbrot")) {

                    title="Mandelbrot Fractal";
                    try {
                        if(args.length==5){

                            if (args[1]!=null) {
                                real_min = Double.parseDouble(args[1]);
                            } else real_min = -1.0;
                            if (!args[2].isEmpty()) {
                                real_max = Double.parseDouble(args[2]);
                            } else real_max = 1.0;
                            if (!args[3].isEmpty()) {
                                imag_min = Double.parseDouble(args[3]);
                            } else imag_min = -1.0;
                            if (!args[4].isEmpty()) {
                                imag_max = Double.parseDouble(args[4]);
                            } else imag_max = 1.0;

                        } else if(args.length==6) {
                            if (args[1]!=null) {
                                real_min = Double.parseDouble(args[1]);
                            } else real_min = -1.0;
                            if (!args[2].isEmpty()) {
                                real_max = Double.parseDouble(args[2]);
                            } else real_max = 1.0;
                            if (!args[3].isEmpty()) {
                                imag_min = Double.parseDouble(args[3]);
                            } else imag_min = -1.0;
                            if (!args[4].isEmpty()) {
                                imag_max = Double.parseDouble(args[4]);
                            } else imag_max = 1.0;
                            if (args[5] != null) {
                                max_iterate = Integer.parseInt(args[5]);
                            } else max_iterate = 1000;

                        }
                        else
                         {
                            real_min = -1.0;
                            real_max = 1.0;
                            imag_min = -1.0;
                            imag_max = 1.0;
                             max_iterate = 1000;

                        }
                        /*if (args[5] != null) {

                                max_iterate = Integer.parseInt(args[5]);

                        } else max_iterate = 1000;
                        */
                    }catch (NumberFormatException e) {
                    System.out.println(e);
                }

                    fractal=new Mandelbrot(frame_height,frame_width,real_max,real_min,imag_max,imag_min,max_iterate);
                }
                else if(args[0].equals("Julia") || args[0].equals("julia")){
                    try{
                    title="Julia Fractal";

                    if(!args[1].isEmpty()) {

                            realX = Double.parseDouble(args[1]);

                    }else System.out.println("Enter Real Boundary for C");
                    if(!args[2].isEmpty()) {

                            imagY = Double.parseDouble(args[2]);
                        }else System.out.println("Enter Imaginary Boundary for C");
                    fractal=new Julia(frame_height,frame_width,real_max,real_min,imag_max,imag_min,max_iterate,realX,imagY);
                    }catch (NumberFormatException e){ System.out.println(e);}
                    }else{
                    System.out.println("Enter Mandelbrot or Julia for print or to get more options -help");
                }

        }
        else {
            System.out.println("Less or too much arguments");
            System.out.println("Enter -h for help");
            System.exit(1);
        }


        fractalWindow = new FractalWindow(title,fractal);
        fractalWindow.setSize(new Dimension(frame_width,frame_height));
       fractalWindow.setVisible(true);
       fractalWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

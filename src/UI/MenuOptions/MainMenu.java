package UI.MenuOptions;

import Core.AbstractFractal;
import Core.Julia;
import Core.Mandelbrot;
import UI.FractalPanel;
import UI.FractalWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


/**
 * Created by Namila on 9/11/2017.
 */
public class MainMenu extends JPanel implements ItemListener, ActionListener {
    private final static String MANDELBROT="Mandelbrot";
    private final static String JULIA="Julia";
    private MenuCombo menuCombo;
    private MenuJulia menuJulia;
    private MenuMandel menuMandel;
    private JPanel cardboard;
    private String fractal_model="Mandelbrot";
    private FractalPanel fractalPanel;
    private AbstractFractal abstractFractal;
    private FractalWindow fractalWindow;

    public MainMenu(FractalPanel fractalPanel,AbstractFractal abstractFractal,FractalWindow fractalWindow){
        this.fractalPanel=fractalPanel;
        this.abstractFractal=abstractFractal;
        this.fractalWindow=fractalWindow;
        initialise();
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 800));
        setSize(400,800);
        add(menuCombo,BorderLayout.PAGE_START);

        cardboard=new JPanel(new CardLayout());
        add(cardboard,BorderLayout.CENTER);

        cardboard.add(menuMandel,MANDELBROT);
        cardboard.add(menuJulia,JULIA);

        if(abstractFractal instanceof  Julia){
            menuCombo.getComboBox1().setSelectedIndex(1);
            setJulia();

        }
        else if(abstractFractal instanceof  Mandelbrot){

            menuCombo.getComboBox1().setSelectedIndex(0);
            setMandelbrot();
        }


    }

    private void initialise(){
        //initializing all;
        menuCombo=new MenuCombo();
        menuJulia=new MenuJulia();
        menuMandel=new MenuMandel();
        menuCombo.getComboBox1().addItemListener(this);

        menuCombo.getGenerate().addActionListener(this);


    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        //when combobox change this is fired
        CardLayout cardboardLayout = (CardLayout)(cardboard.getLayout());
        cardboardLayout.show(cardboard, (String)e.getItem());
        fractal_model=e.getItem().toString();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //when generate button clicked
         if(fractal_model.equals("Mandelbrot"))  {
             double []values=menuMandel.getValues();

            fractalPanel.setFractal( new Mandelbrot(800,800,values[0],values[1],values[2],values[3],
                     menuCombo.getTextField1()));

            fractalPanel.repaint();
            fractalWindow.setTitle("Mandelbrot Fractal");
         }
          else if(fractal_model.equals("Julia")){
             double []values=menuJulia.getValues();

             fractalPanel.setFractal( new Julia(800,800,abstractFractal.getReal_max(),abstractFractal.getReal_min(),
                     abstractFractal.getReal_max(),abstractFractal.getReal_min(), menuCombo.getTextField1(),values[0],values[1]));

             fractalPanel.repaint();
             fractalWindow.setTitle("Julia Fractal");
         }
    }

    private void setMandelbrot() {
        //getting values from mandelbrot and set values
        menuCombo.setTextField1(abstractFractal.getMax_iterate());
        menuMandel.setAllValues(abstractFractal.getImag_min(),abstractFractal.getImag_max(),abstractFractal.getReal_min(),abstractFractal.getReal_max());

    }

    private void setJulia(){
        //getting values from julia and set values
        menuCombo.setTextField1(abstractFractal.getMax_iterate());
        menuJulia.setValues(abstractFractal.getRealX(),abstractFractal.getImagY());
    }



    }
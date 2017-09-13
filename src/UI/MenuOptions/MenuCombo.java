/*
 * Created by JFormDesigner on Sun Sep 10 21:36:54 IST 2017
 */

package UI.MenuOptions;

import java.awt.*;
import javax.swing.*;

/**
 * @author Namila Bandara
 */
public class MenuCombo extends JPanel {
    private JPanel panel1;
    private JLabel label1;
    private JComboBox comboBox1;
    private JLabel label2;
    private JTextField textField1;
    private JButton generate;
    private String list[]={"Mandelbrot","Julia"};

    public MenuCombo() {

        initComponents();

    }

    public int getTextField1() {
        return Integer.parseInt(textField1.getText());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gonaz Gamz
        panel1 = new JPanel();
        label1=new JLabel("Fractal Type:");
        label2=new JLabel("Maximum Iterations");
        textField1 = new JTextField();
        comboBox1 = new JComboBox(list);

        generate=new JButton("Generate");

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                            "", javax.swing.border.TitledBorder.CENTER,
                            javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                            java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            setLayout(new GridLayout(3, 2));
            add(label1);
            add(comboBox1);
            add(label2);
            add(textField1);
            add(generate);

        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    public void setTextField1(int iterations) {
        this.textField1.setText(iterations+"");
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public JButton getGenerate() {
        return generate;
    }
}
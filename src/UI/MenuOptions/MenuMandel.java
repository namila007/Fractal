/*
 * Created by JFormDesigner on Sun Sep 10 21:55:02 IST 2017
 */

package UI.MenuOptions;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Namila Bandara
 */
public class MenuMandel extends JPanel {
    public MenuMandel() {
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license -
        label1 = new JLabel();
        real_max = new JTextField();
        label2 = new JLabel();
        real_min = new JTextField();
        label3 = new JLabel();
        imag_max = new JTextField();
        label4 = new JLabel();
        imag_min = new JTextField();
        label5 = new JLabel();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //---- label1 ----
        label1.setText("Real Max");

        //---- label2 ----
        label2.setText("Real Min");

        //---- label3 ----
        label3.setText("Imaginary Max");

        //---- label4 ----
        label4.setText("Imaginary Min");

        //---- label5 ----
        label5.setText("Region of interest:");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(imag_min, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                        .addComponent(real_max, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                        .addComponent(real_min, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                        .addComponent(imag_max, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(label5)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(real_max, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(real_min, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(imag_max, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(imag_min, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4))))
                    .addContainerGap(203, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }



    public void setAllValues(double imagmin,double imagmax,double realmin,double realmax){
        real_max.setText(realmax+"");
        real_min.setText(realmin+"");
        imag_max.setText(imagmax+"");
        imag_min.setText(imagmin+"");


    }

    public double[] getValues(){
        double[] values={Double.parseDouble(real_max.getText()),Double.parseDouble(real_min.getText()),
        Double.parseDouble(imag_max.getText()),Double.parseDouble(imag_min.getText())};
        return values;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gonaz Gamz
    private JLabel label1;
    private JTextField real_max;
    private JLabel label2;
    private JTextField real_min;
    private JLabel label3;
    private JTextField imag_max;
    private JLabel label4;
    private JTextField imag_min;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author DELL
 */
public class Main  extends JFrame implements ActionListener {
    JRadioButton r1;
    JRadioButton r2;
    JButton btn;
    
    Main(){
        
    r1= new JRadioButton ("Appel");
    r2= new JRadioButton ("orange");
    r1.setBounds(100, 100, 100, 90);
    r2.setBounds(100, 150, 120, 90);
    
    //concat all my buttons on a buttongroup
    ButtonGroup buttong = new ButtonGroup(); 
    buttong.add(r1);
    buttong.add(r2);
    
    btn= new JButton ("submit");
    btn.setBounds(250, 250, 90, 80);
    btn.addActionListener(this);
    
    //add my buttons to my frame
    add(r1);
    add(r2);
    add(btn);
    setSize(500,500);
    setLayout(null);
    setVisible(true);
    }
public static void main(String[]args){
    new Main();
}

//the action comming after the chose and the click of submit
    @Override
    public void actionPerformed(ActionEvent e) {
    if (r1.isSelected()){
        JOptionPane.showMessageDialog(this,"you select Appel !");
    }
    if (r2.isSelected()){
        JOptionPane.showMessageDialog(this,"you select Orange !");
    }
    }
}

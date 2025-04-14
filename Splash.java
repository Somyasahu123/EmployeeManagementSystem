package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
    
    Splash(){
        
        getContentPane().setBackground(Color.WHITE); //getContentPane()= poore frame ka access mil gya
        setLayout(null);//Swing ke bnye huye layout ko use nhi krna
        
        JLabel heading =  new JLabel("EMPLOYEE MANAGEMENT SYSTEM"); //component
        heading.setBounds(80, 30, 1200, 60);//(left,top,length,width)
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);//Foreground -> text colour
        add(heading); //Jframe ke andr heading add krdo
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT); //(length, width)
        //Why image is converted to ImageIcon?
        //Because image has to be ultimately pass on to JLabel and JLabel only accepts ImageIcon object not Image class.
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);//(left,top,length,width)
        add(image); 
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);//click event is performed here
        image.add(clickhere);
        
        //Frame ko set kr re h
        setSize(1170, 650); //setSize Function(length, width)
        setLocation(200, 50); //setLocation function takes two argument(distance from left, distance from top)
        setVisible(true);
        
        while(true){
            heading.setVisible(false);
            try{
               Thread.sleep(500); //500ms ke liye rokna hai bs
            }catch(Exception e){
            
            }
            
            heading.setVisible(true);
            try{
               Thread.sleep(500);
            }catch(Exception e){
            
            }
        }       
    }
    
    public void actionPerformed(ActionEvent ae){ //Method override 
        setVisible(false); //close current page
        new Login();//and open login page...because object bnte hi constructor call hoga aur saari coding constructor mai likhi h 
    }
    
    public static void main(String args[]){
        Splash s = new Splash(); //create object 
    }    
}

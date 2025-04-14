package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JTextField tfusername, tfpassword;//declare them globally so that you can use them in other function too.
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE); //Changed colour of frame
        setLayout(null);
        
            //Create Username:
            JLabel lblusername = new JLabel("Username");
            lblusername.setBounds(40,20,100,30);
            add(lblusername); //Username ko frame mai add kiya
            
            //JTextField for Username created:
            tfusername = new JTextField();
            tfusername.setBounds(150, 20, 150,30);
            add(tfusername);
            
            //JTextField for Password Created:
            tfpassword = new JTextField();
            tfpassword.setBounds(150, 70, 150,30);
            add(tfpassword);
            
            //JButton for Login Created:
            JButton login = new JButton("LOGIN");
            login.setBounds(150, 140, 150, 30);
            login.setBackground(Color.BLACK);
            login.setForeground(Color.WHITE);
            login.addActionListener(this);
            add(login);
            
            //Image pasted:
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
            Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(350, 0, 200, 200);
            add(image);
            
            //Create Password:
            JLabel lblpassword = new JLabel("Password");
            lblpassword.setBounds(40,70,100,30);
            add(lblpassword);
        
            //Create Frame:
            setSize(600,300); //(length,width)
            setLocation(450,200); //(left,top)
            setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
           String username = tfusername.getText(); 
           String password = tfpassword.getText();
           
           Conn c = new Conn();
           String query ="select * from login where username= '"+username+"' and password = '"+password+"'"; //query created
        
           ResultSet rs = c.s.executeQuery(query); //4th step - query executed
           if(rs.next()){
               setVisible(false);//close current page
               new Home(); //move to next page
           }else{
              JOptionPane.showMessageDialog(null,"Invalid username or password");
              setVisible(false); //5th Step 
           }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public static void main(String args[]){
          new Login(); //create object
    }
}

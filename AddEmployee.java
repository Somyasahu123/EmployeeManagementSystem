package employee.management.system;

import java.awt.*; //color
import javax.swing.*; //JLabel
import com.toedter.calendar.JDateChooser; //DOB
import java.util.*; //Random number
import java.awt.event.*; //ActionListener

public class AddEmployee extends JFrame implements ActionListener{
    
    Random ran = new Random(); //For unique Employee Id
    int number = ran.nextInt(999999);
    
    //Declare globally so that you can use them in other function
    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfdesignation, tfsalary;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add, back;
            
    AddEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //Heading created:
        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN SERIF", Font.BOLD, 25));
        add(heading);
    
        //Name:
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50,150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN,20));
        add(labelname);
        
        //Name TextField:
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150,30);
        add(tfname);
        
        //Father's name:
        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(400,150, 150, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN,20));
        add(labelfname);
        
        //Father's name TextField:
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150,30);
        add(tffname);
        
        //Date of Birth:
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50,200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN,20));
        add(labeldob);
        
        //Date of Birth TextField:
        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);
        
        //Salary
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN,20));
        add(labelsalary);
        
        //Salary TextField:
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);
        
        //Address:
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50,250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN,20));
        add(labeladdress);
        
        //Address TextField:
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        //Phone:
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN,20));
        add(labelphone);
        
        //Phone TextField:
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        //Email:
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN,20));
        add(labelemail);
        
        //Email TextField:
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        //Highest Education:
        JLabel labeleducation = new JLabel("Highest Education");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN,20));
        add(labeleducation);
        
        //Highest Education TextField:
        String courses[] = {"BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA" , "MTECH", "MSC", "PHD"};
        cbeducation  = new JComboBox(courses); //JComboBox -> drop down button aa jyga
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        add(cbeducation);
        
        //Designation:
        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN,20));
        add(labeldesignation);
        
        //Designation TextField:
        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);
        
        //Aadhar Number:
        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN,20));
        add(labelaadhar);
        
        //Aadhar Number TextField:
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        //Employee ID:
        JLabel labelempId = new JLabel("Employee id");
        labelempId.setBounds(50, 400, 150, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN,20));
        add(labelempId);
        
        //Employee Id TextField:
        lblempId = new JLabel(" " + number);
        lblempId.setBounds(200, 400, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN,20));
        add(lblempId);

        //ADD BUTTON
        add = new JButton("Add Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add); 
        
        //BACK BUTTON
        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        
        //Frame created:
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String)cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empId = lblempId.getText();
            
            try{
                Conn conn = new Conn();
                //Values should  be inserted in same order as mentioned in MySQL:
                String query = "insert into employee values('"+name+"','"+fname+"', '"+dob+"', '"+salary+"', '"+address+"','"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"','"+empId+"')";
                conn.s.executeUpdate(query);//DML Command 
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
            new Home();
        }
    }
    public static void main(String args[]){
        new AddEmployee(); //create object
    }   
}

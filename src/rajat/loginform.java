package rajat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.font.*;
import java.sql.*;

class impanel implements ActionListener
{
JFrame ff;
JPanel pp,p2,p3;
Image t;
JButton b1,b2;
JLabel l1,l2,l3;
JTextField t1;
JPasswordField p1;
JComboBox cb;
JLabel l4;
JComboBox cb1;
Connection con;
Statement set;
ResultSet rs;
	impanel()
	{
            l4=new JLabel("Select Login as:");
            String ss1[]={"Guest","Administrator"};
            cb1=new JComboBox(ss1);
            b1=new JButton("Log In");
            b1.addActionListener(this);
            b2=new JButton("Reset");
            b2.addActionListener(this);
            l1=new JLabel("User Name");
            l2=new JLabel("Password");
            l3=new JLabel("Course Enrolled");
            String ss[]={"CSE","ECE","ME"};
            cb=new JComboBox(ss);
            t1=new JTextField();
            p1=new JPasswordField();
            Font f=new Font("Comic Sans MS",Font.BOLD,16);
            l1.setFont(f);
            l2.setFont(f);
            l3.setFont(f);
            l4.setFont(f);
            l1.setForeground(Color.WHITE);
            l2.setForeground(Color.WHITE);
            l3.setForeground(Color.WHITE);
            l4.setForeground(Color.WHITE);
		ff=new JFrame("Image panel");
                p2=new JPanel();
                p3=new JPanel();
		pp=new JPanel()
		{
			public void paintComponent(Graphics g)
			{
				t=new ImageIcon("D:\\java\\think3.jpg").getImage();
				g.drawImage(t,0,0,this);
				
			}
		};
                GridLayout gl=new GridLayout(5,2,40,5);
                p2.setLayout(gl);
                GridBagLayout gbl=new GridBagLayout();
                GridBagConstraints gc=new GridBagConstraints();
                p3.setLayout(gbl);
                
                gc.insets=new Insets(250,900,500,50);
                p2.add(l4);
                p2.add(cb1);
                p2.add(l1);
                p2.add(t1);
                p2.add(l2);
                ff.setDefaultCloseOperation(ff.EXIT_ON_CLOSE);
                p2.add(p1);
                p2.add(l3);
                p2.add(cb);
                p2.add(b1);
                p2.add(b2);
                p2.setOpaque(false);
                p3.add(p2,gc);
                
                pp.add(p3);
		ff.add(pp);
                p3.setOpaque(false);
                ff.setResizable(false);
		ff.setVisible(true);
                ff.setSize(1360,800);
                p2.setPreferredSize(new Dimension(400, 150));
 	
	}
        


        






public void actionPerformed(ActionEvent e)
{
        //throw new UnsupportedOperationException("Not supported yet.");
        if(e.getSource()==b1)
        {
            String ss=t1.getText();
            String ss1=p1.getText();
           String combo=(String)cb1.getSelectedItem();
           if(combo.equals("Administrator"))
           {
            try
            {
                connection();
                set=con.createStatement();
                rs=set.executeQuery("select username,password from login where username = '" + ss +"'AND password='"+ss1+"'");
                if(rs.next()==true)
                {
                    String x=rs.getString(1);
                    System.out.println(x);
                    ff.dispose();
                    new zxc();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "username or password are incorrect","login error",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(Exception a)
            {
                System.out.println(a);
            }
           }
          
         else  if(combo.equals("Guest"))
           {
            try
            {
                connection();
                set=con.createStatement();
                rs=set.executeQuery("select roll_no,psw from student_detail where student_name = '" + ss +"'AND psw='"+ss1+"'");
                if(rs.next()==true)
                {
                    String x=rs.getString(1);
                    System.out.println(x);
                    ff.dispose();
                    new regpage();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "username or password are incorrect","login error",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(Exception a)
            {
                System.out.println(a);
            }
           }
            else
           {
                   JOptionPane.showMessageDialog(null, "try admin","login error",JOptionPane.WARNING_MESSAGE);
           }
          
        }
        if((e.getSource()==b2))
           {
               t1.setText("");
               p1.setText("");
           }
}
        public void connection()
        {
            try
            {
                 Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajatproject","root","");
                System.out.println("Connected successfully");
                
            }
            catch(Exception ab)
            {
                System.out.println("Connection Error"+ab);
                
            }
        }
}





class loginform
{
	public static void main(String ar[])
	{
		new impanel();
	}
}
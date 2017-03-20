package rajat;

import javax.swing.*;
import java .awt.*;
import java.sql.DriverManager;
import java.sql.*;

        class stupass
        {
            JLabel l1,l2,l3,l4;
            JTextField t1,t2,t3,t4;
            Image t;
            JComboBox cb,cb1,cb2;
            JPanel p,p1,p2;
             ResultSet rs;
             Connection con;
             Statement set;
            
            
            stupass()
            {
                JFrame f=new JFrame("Student Passed");
                 p1=new JPanel()
                        {
           public void paintComponent(Graphics g)
			{
				t=new ImageIcon("D:\\java\\s1.jpg").getImage();
				g.drawImage(t,0,0,this);
				
			}
       };
                l1=new JLabel("No. of Students Registered");
                Font f16=new Font("ComicSans Ms",Font.BOLD,16);   
       l1.setFont(f16);
                        l1.setForeground(Color.WHITE);
                l2=new JLabel("No. of Students Cleared all Subjects");
                Font f17=new Font("ComicSans Ms",Font.BOLD,16);   
       l2.setFont(f17);
                        l2.setForeground(Color.WHITE);
                t1=new JTextField();
                t2=new JTextField();
                l3=new JLabel("CLICK BELOW");
                Font f18=new Font("ComicSans Ms",Font.BOLD,16);   
       l3.setFont(f18);
                        l3.setForeground(Color.WHITE);
                
                String ss[]={};
                cb=new JComboBox(ss);
                String ss1[]={};
                cb1=new JComboBox(ss);
                String ss2[]={};
                cb2=new JComboBox(ss2);
                String ss3[]={};
                p=new JPanel();
                p2=new JPanel
                        ();
                 try
                {
                    connection();
                    set=con.createStatement();
                    rs=set.executeQuery("select count(*) from Student_detail");
                    while(rs.next())
                    {
                        int co=rs.getInt(1);
                        cb.addItem(String.valueOf(co));
                    }
                    rs=set.executeQuery("select count(percentage>40.0) from student_detail where percentage>40.0");
                   // rs=set.executeQuery("select student_name from Student_detail where percentage<40.0");
                     while(rs.next())
                    {
                        int co1=rs.getInt(1);
                        cb1.addItem(String.valueOf(co1));
                    }
                     rs=set.executeQuery("select student_name from Student_detail where percentage>0.0");
                     while(rs.next())
                     {
                        String co2=rs.getString(1);
                        cb2.addItem(co2);
                     }
                    
                    
                }
                 catch(Exception t)
                {
                    
                }
                p1.add(l1);
                p1.add(l2);
                p1.add(cb1);
                p1.add(cb2);
                p1.add(cb);
                p1.add(l3);
                p1.add(p);
                f.add(p1);
               p1.setLayout(null);
                FlowLayout fl=new Flowlayout();
                //f.setLayout(null);
                l1.setBounds(60,50,280,15);
                l2.setBounds(60,100,280,15);
                l3.setBounds(400,150,280,15);
                cb1.setBounds(400,100,130,18);
                cb2.setBounds(400,180,130,18);
                cb.setBounds(400,50,130,18);
                f.setVisible(true);
                f.setSize(600,400);
               // f.setPreferredSize(new Dimension(800, 450));
                f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
                f.setResizable(false);
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
                    class stupasss
                    {
                        public static void main(String args[])
                        {
                            stupass obj=new stupass();
                        }
                    
                      
                        
                        
                        
                    }
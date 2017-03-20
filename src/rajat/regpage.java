package rajat;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

 

 
 

 

 class regpage extends JFrame implements ActionListener 
            {
     String rid;
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
        JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17;
        JMenuBar mb;
        JMenuItem m1,m2,m3,m4,m5,m34;
        JMenu file;
        JFrame f;
        JPanel p1,p2,p3,p4,p5,p6,im;
        Image t;
        JButton bat1;
        ResultSet rs;
     Statement set;
     Connection con;
     PreparedStatement pstmt;
     String eid;
        regpage()
        {
            im=new JPanel()
                    {
           public void paintComponent(Graphics g)
			{
				t=new ImageIcon("D:/java/race.jpg").getImage();
				
                               g.drawImage(t,0,0,this);
				
			}
       };
            im.setLayout(null);
            
               // JFrame f=new JFrame();
            
            //PANEL 1st
            l1=new JLabel("ENTER TO FIND THE DETAIL OF RECORD");
            Font f76=new Font("ComicSans Ms",Font.BOLD,14);   
       l1.setFont(f76);
                       l1.setForeground(Color.white);
            l2=new JLabel("University roll no.");
            bat1=new JButton("Click me");
  bat1.addActionListener(this);
           add(bat1);
            bat1.setBounds(680,65,100,20);
             Font f16=new Font("ComicSans Ms",Font.BOLD,14);   
       l2.setFont(f16);
                       l2.setForeground(Color.white);
            t1=new JTextField();
            t2=new JTextField();
            p1=new JPanel();
            p2=new JPanel();
            l3=new JLabel("NAME");
            Font f36=new Font("ComicSans Ms",Font.BOLD,14);   
       l3.setFont(f36);
                       l3.setForeground(Color.BLACK);
            l4=new JLabel("DEPARTMENT");
            Font f46=new Font("ComicSans Ms",Font.BOLD,14);   
       l4.setFont(f46);
                       l4.setForeground(Color.BLACK);
            l5=new JLabel("ACADEMIC YEAR");
            Font f56=new Font("ComicSans Ms",Font.BOLD,14);   
       l5.setFont(f56);
                       l5.setForeground(Color.BLACK);
            l6=new JLabel("GENDER");
            Font f66=new Font("ComicSans Ms",Font.BOLD,14);   
       l6.setFont(f66);
                       l6.setForeground(Color.BLACK);
            t3=new JTextField();
            t4=new JTextField();
            t5=new JTextField();
            t6=new JTextField();
            mb=new JMenuBar();
            GridLayout gl=new GridLayout(4,2,10,20);
            
            p1.add(l3);
            p1.add(t3);
            p1.add(l4);
            p1.add(t4);
            p1.add(l5);
            p1.add(t5);
            p1.add(l6);
            p1.add(t6);
            p1.setLayout(gl);
            p1.setPreferredSize(new Dimension(300,180));
            p2.add(p1);
            
            p2.setBorder(BorderFactory.createTitledBorder("Student Detail's "));
            p2.setBounds(80,180,360,220);
            p2.setLayout(new FlowLayout());
            im.add(p2);
            im.add(bat1);
//    setLayout(null);
            
    
            
            
           
            
            //f.setLayout(new FlowLayout());
            //p2.setVisible(true);
           // p2.setBounds(140,120,300,200);
            file=new JMenu("FILE");
            m1=new JMenuItem("Topper's List");
            m1.addActionListener(this);
            m34=new JMenuItem("Student Failed");
            m34.addActionListener(this);
            m3=new JMenuItem("Student Passed");
            m3.addActionListener(this);
            m4=new JMenuItem("Eligibility");
            m5=new JMenuItem("Exit");
            m5.addActionListener(this);
            file.add(m1);
            p5=new JPanel();
            file.add(m34);
            file.add(m3);
            file.add(m4);
                   // f.setSize(900,900);
                  //f.setDefaultCloseOperation(f.this.EXIT_ON_CLOSE);
                    setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            file.add(m5);
            mb.add(file);
            mb.setBounds(0,0,1000,40);
            mb.setVisible(true);
            setVisible(true);
            setJMenuBar(mb
                   );
            im.add(l1);
            //FlowLayout fl=new FlowLayout();
            
            l1.setBounds(400,10,400,50);
            l2.setBounds(300,50,300,50);
            t2.setBounds(450,65,200,25);
            l1.setVisible(true);
            l2.setVisible(true);
            t2.setVisible(true);
            im.add(l2);
           im.add(t2);
            
            
            
            
            //PANEL 2ND
            p3=new JPanel();
            p4=new JPanel();
            l7=new JLabel("MATHEMATICS  :");
            Font f17=new Font("ComicSans Ms",Font.BOLD,14);   
       l7.setFont(f17);
                       l7.setForeground(Color.BLACK);
            l8=new JLabel("PHYSICS  :");
            Font f18=new Font("ComicSans Ms",Font.BOLD,14);   
       l8.setFont(f18);
                       l8.setForeground(Color.BLACK);
            l9=new JLabel("CHEMISTRY   :");
            Font f19=new Font("ComicSans Ms",Font.BOLD,14);   
       l9.setFont(f19);
                       l9.setForeground(Color.BLACK);
            
            l10=new JLabel("JAVA_LANGUAGE   :");
            Font f20=new Font("ComicSans Ms",Font.BOLD,14);   
       l10.setFont(f20);
                       l10.setForeground(Color.BLACK);
            l11=new JLabel("C_PROGRAMMING:");
            Font f11=new Font("ComicSans Ms",Font.BOLD,14);   
       l11.setFont(f11);
                       l11.setForeground(Color.BLACK);
            //l12=new JLabel("MARK  1   :");
            l14=new JLabel("AVERAGE OBTAINED   :");
            Font f24=new Font("ComicSans Ms",Font.BOLD,14);   
       l14.setFont(f24);
                       l14.setForeground(Color.BLACK);
            l13=new JLabel("TOTAL MARKS   :");
            Font f26=new Font("ComicSans Ms",Font.BOLD,14);   
       l13.setFont(f26);
                       l13.setForeground(Color.BLACK);
            t7= new JTextField();
            t8= new JTextField();
            t9= new JTextField();
            t10= new JTextField();
            t11= new JTextField();
            //t12= new JTextField();
            t13= new JTextField();
            t14= new JTextField();
            GridLayout gl1=new GridLayout(7,2,10,28);
                p3.add(l7);
                p3.add(t7);
                p3.add(l8);
                p3.add(t8);
                p3.add(l9);
                p3.add(t9);
                p3.add(l10);
                p3.add(t10);
                p3.add(l11);
                p3.add(t11);
              //  p3.add(l12);
                //p3.add(t12);
                p3.add(l13);
                p3.add(t13);
                p3.add(l14);
                p3.add(t14);
                p3.setLayout(gl1);
                p3.setPreferredSize(new Dimension(450,400));
                p4.add(p3);
                 p4.setBorder(BorderFactory.createTitledBorder("Student Marks Obtained :"));
                //setLayout(null);
                //p4.setPreferredSize(new Dimension(600,400));
              p4.setLayout(new FlowLayout());
              p4.setBounds(830,180,480,470);
             im.add(p4);
            
                
                
                
                //PANEL 3RD
                l15=new JLabel("ATTENDENCE (No. of Days Present)");
                Font f27=new Font("ComicSans Ms",Font.BOLD,14);   
       l15.setFont(f27);
                       l15.setForeground(Color.WHITE);
                l16=new JLabel("ATTENDENCE (No. of Days Absent)");
                Font f28=new Font("ComicSans Ms",Font.BOLD,14);   
       l16.setFont(f28);
                       l16.setForeground(Color.WHITE);
                p6=new JPanel();
                t15=new JTextField("");
                t16=new JTextField("");
                GridLayout gl2=new GridLayout(2,2,20,20);
                p5.add(l15);
                 p5.add(t15);
                 p6.setBorder(BorderFactory.createTitledBorder("Attendence Detail"));
                p5.add(l16);
                 p5.add(t16);
                 p5.setLayout(gl2);
                 p6.add(p5);
                 p6.setBounds(20,550,600,120);
                         
                 p5.setPreferredSize(new Dimension(550,70));
               p6.setLayout(new FlowLayout());
               //p4.setBounds(400,300,200,300);
               //f.add(p4);
               im.add(p6);
               p6.setOpaque(false);
               p4.setOpaque(false);
               p2.setOpaque(false);
               p1.setOpaque(false);
               p2.setOpaque(false);
               p3.setOpaque(false);
               p5.setOpaque(false);
               setSize(1350,900);
               add(im);
                 
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
     public void actionPerformed(ActionEvent e)
     {
         
     if(e.getSource()==m34)
     {
         System.out.println("good morning");
         new studentfail();
     }
     if(e.getSource()==m1)
     {
         new hello();
     }
     if(e.getSource()==m3)
     {
         new stupass();
     }
     if(e.getSource()==m5)
     {
      new impanel();
      
     }
        if(e.getSource()==bat1)
        {
            
            
             rid=t2.getText();
             System.out.println("style");
            try
            {
                 Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajatproject","root","");
                System.out.println("Connected successfully");
                
                //connection();
                  set=con.createStatement();
                 // rs=set.executeQuery("select * from student_detail where roll_no='"+rid+"'");
                  System.out.println("check1");
                  rs=set.executeQuery("select * from student_detail where roll_no='"+rid+"'");
                  System.out.println("check2");
                  ResultSetMetaData rdmt=rs.getMetaData();
                  System.out.println(rdmt.getColumnCount());
                  System.out.println(rid);
                  while(rs.next())
                  {
            String name=rs.getString(1);
                      String roll=rs.getString(2);
                      String depart=rs.getString(3);
                      String acd=rs.getString(4);
                      String gen=rs.getString(5);
                      int std1=rs.getInt(6);
                      int std2=rs.getInt(7);
                      int std3=rs.getInt(8);
                      int std4=rs.getInt(9);
                      int std5=rs.getInt(10);
                      int aten=rs.getInt(11);
                     int absent=120-aten;
                      String per=rs.getString(12);
                      String res=rs.getString(13);
                      
                      t3.setText(name);
                      t2.setText(roll);
                      t4.setText(depart);
                     t5.setText(acd);
                     t6.setText(gen);
                   
                      t7.setText(String.valueOf(std1));
                      t8.setText(String.valueOf(std2));
                      t9.setText(String.valueOf(std3));
                      t10.setText(String.valueOf(std4));
                      t11.setText(String.valueOf(std5));
                      t15.setText(String.valueOf(aten));
                      t16.setText(String.valueOf(absent));
                      t13.setText(res);
                      t14.setText(per);
                      //tat2.setText(String.valueOf(aten));
                      
                  }
                  if(t2.getText().equals(null))
                      {
                          JOptionPane.showMessageDialog(null,"roll no. does not exist","roll no. error",JOptionPane.WARNING_MESSAGE);
                      }
            }
        
             
     
            catch(Exception ui)
            {
                ui.printStackTrace();
            }
        }
     }
           /* catch(Exception a)
            {
                    System.out.println("error of catch"+a);
            }*/
        
        
    }

     
      
    



  
    
 
 
 
 
 

 

    
        

 

 
 

 

                class   aaaaaaaaa
                {
                    
                
                  public static void main(String args[])
                    {
                        new regpage();
                        
                    }
                }
                

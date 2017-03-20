package rajat;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
class zxc extends JFrame implements ActionListener
{
    String name;
                      String roll;
                      String depart;
                      String acd;
                      String gen;
                      int std1;
                      int std2;
                      int std3;
                      int std4;
                      int std5;
                      int aten;
                      String per;
                      String rest;
                      JTable jtbl;
                      DefaultTableModel dtb1;
    int att;
   String eid="";
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,
            tat1,tat2,tat3;
    JTextArea ta1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l20,
            lat1,lat2,lat3;
    Checkbox ch,ch1,ch2,ch3,ch4,ch5,ch6,ch7;
    CheckboxGroup cbg,cbg1;
    Choice course;
    JPanel rp,p1,p2,p3,p4,p5,mainp,stumrk,stuatt,p6,stup6;
    JButton b1,ad,m,d,insert,update,del,nxt,b3,b4,bat1,bat2,bat3,bat4,b33,b44;
    Image i;
    JComboBox cb,cba;
    JRadioButton rdm,rdf;
     JMenuBar mb;
     JMenu file,smarksd;
     JMenuItem mi,mi1,mi2;
     JTabbedPane tp;
     Image t;
     int tb1;
     static int count=0;
     ResultSet rs;
     Statement set;
     Connection con;
     PreparedStatement pstmt;
    zxc()
    {
        mainp=new JPanel()
                {
           public void paintComponent(Graphics g)
			{
				t=new ImageIcon("D:/java/race.jpg").getImage();
				g.drawImage(t,0,0,this);
				
			}
       };
           rp=new JPanel();
       stumrk=new JPanel()
       {
           public void paintComponent(Graphics g)
			{
				t=new ImageIcon("D:/java/race.jpg").getImage();
				g.drawImage(t,0,0,this);
				
			}
       };
       stuatt=new JPanel()
               {
           public void paintComponent(Graphics g)
			{
				t=new ImageIcon("D:/java/race.jpg").getImage();
				g.drawImage(t,0,0,this);
				
			}
       };
           p2=new JPanel();
           p1=new JPanel();
           stup6=new JPanel();
           mainp.setPreferredSize(new Dimension(1000,900));
           stumrk.setPreferredSize(new Dimension(1000,900));
           stumrk.setLayout(null);
           stuatt.setPreferredSize(new Dimension(1000,900));
           
           
           
           
           
        tp=new JTabbedPane();
        tp.add("Student Detail",mainp);
        tp.add("Student Marks",stumrk);
        tp.add("Student Attendance",stuatt);
        tp.setBounds(0,0,1370,1000);
        tb1=tp.getTabCount();
        System.out.println(tb1);
        
        this.getContentPane().setBackground(Color.black);
        
           mb=new JMenuBar();
           file=new JMenu("FILE");
           //smarksd=new JMenu("STUDENT MARKS");
           mi=new JMenuItem("Guest");
           mi.addActionListener(this);
           mi1=new JMenuItem("Log Out");
           mi1.addActionListener(this);
           //mi2=new JMenuItem("MARKS DETAIL");
           mb.add(file);
         //  mb.add(smarksd);  
           file.add(mi);
           file.add(mi1);
           //smarksd.add(mi2);
           
          mb.setBounds(0,0,1000,20);
          l18=new JLabel("Student_Detail");
           Font f10=new Font("ComicSans Ms",Font.BOLD,20);   
       l18.setFont(f10);
         l17=new JLabel("Select The Operation To be Performed");
          nxt=new JButton("NEXT");    
          ad=new JButton("ADD");
          m=new JButton("MODIFY");
          d=new JButton("DELETE");
          insert=new JButton("INSERT");
          insert.addActionListener(this);
          update=new JButton("UPDATE");
          update.addActionListener(this);
          del=new JButton("DELETE");
          
          ad.addActionListener(this);
          d.addActionListener(this);
          m.addActionListener(this);
          
          
          b44=new JButton("BACK");
          b44.addActionListener(this);
          b33=new JButton("NEXT");      
          b33.addActionListener(this);
          b33.setBounds(180,420,150,25);
          b44.setBounds(350,420,150,25);
          Font f3=new Font("ComicSans Ms",Font.CENTER_BASELINE,15);
          l16=new JLabel("STUDENT MARKS DETAIL");
          l16.setFont(f3);
         l16.setBounds(40,20,200,100);
                        
                        stumrk.add(b44);
                        stumrk.add(b33);
                        
          l11=new JLabel("Mathematics");             
            Font f4=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       l11.setFont(f4);
                        l11.setForeground(Color.black);
                        l12=new JLabel("Physics");
                        Font f5=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       l12.setFont(f5);
                        l12.setForeground(Color.BLACK);
                        l13=new JLabel("Chemistry");
                        Font f6=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       l13.setFont(f6);
                        l13.setForeground(Color.BLACK);
                        
                        l14=new JLabel("Java_Language");
                        Font f7=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       l14.setFont(f7);
                        l14.setForeground(Color.BLACK);
                        
                        l15=new JLabel("C Programming");
                        Font f8=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       l15.setFont(f8);
                        l15.setForeground(Color.BLACK);
                        t15=new JTextField(10);
                        t11=new JTextField("");
                        t12=new JTextField("");
                        t13=new JTextField("");
                        t14=new JTextField("");
                        p6=new JPanel();
                        GridLayout gr = new GridLayout(5,2,50,15);
            FlowLayout fl = new FlowLayout();
           
                        p6.add(l11);
                        p6.add(t11);
                        p6.add(l12);
                        p6.add(t12);
                        p6.add(l13);
                        p6.add(t13);
                        p6.add(l14);
                        p6.add(t14);
                        p6.add(l15);
                        p6.add(t15);
                        //p6.add(b3);
                        //p6.add(b4);
           // stumrk.setBounds(0,200,500,500);           
                        p6.setLayout(gr);
                         p6.setPreferredSize(new Dimension(500, 200));
                        p6.setOpaque(false);
                        
                        
          
          l18.setBounds(30,40,200,25);
          l17.setBounds(390,10,300,25);
          ad.setBounds(450,40,90,25);
          m.setBounds(550,40,90,25);
          d.setBounds(650,40,90,25);
          insert.setBounds(150,400,90,25);
          update.setBounds(250,400,90,25);
          del.setBounds(350,400,90,25);
          nxt.setBounds(700,300,130,25);
          del.addActionListener(this);
          nxt.addActionListener(this);
          
          insert.setVisible(false);
          update.setVisible(false);
          del.setVisible(false);
          
          
          
          
          
          
          
          l1=new JLabel("Student Name");
          Font f15=new Font("ComicSans Ms",Font.BOLD,16);   
       l1.setFont(f15);
                        l1.setForeground(Color.BLACK);
          l2= new JLabel("University Roll No.");
          Font f16=new Font("ComicSans Ms",Font.BOLD,16);   
       l2.setFont(f16);
                        l2.setForeground(Color.BLACK);
          l3 = new JLabel("Department");
          Font f17=new Font("ComicSans Ms",Font.BOLD,16);   
       l3.setFont(f17);
                        l3.setForeground(Color.BLACK);
          l4=new JLabel("Academic Year");
          Font f18=new Font("ComicSans Ms",Font.BOLD,16);   
       l4.setFont(f18);
                        l4.setForeground(Color.BLACK);
          l5=new JLabel("GENDER");
          Font f19=new Font("ComicSans Ms",Font.BOLD,16);   
       l5.setFont(f19);
                        l5.setForeground(Color.BLACK);
          
          
           ButtonGroup jbp=new ButtonGroup();
           rdm=new JRadioButton("Male",false);
           rdf=new JRadioButton("Female",false);
           rdm.setVisible(false);
           rdf.setVisible(false);
        
        
           t1=new JTextField();
           t2=new JTextField();
           t1.setVisible(false);
           t2.setVisible(false);
           
           
           String dep[]={"CSE","ECE","ME"};
           cb=new JComboBox(dep);
           String acd[]={"2005-2006","2006-2007","2007-2008","2008-2009","2009-2010","2010-2011","2011-2012","2012-2013"};
           cba=new JComboBox(acd);
           cb.setVisible(false);
           cba.setVisible(false);
        
           p1.setOpaque(false);
           GridLayout gl=new GridLayout(5,2,100,20);
           p1.setLayout(gl);
        
            jbp.add(rdm);
            jbp.add(rdf);
            rp.setOpaque(false);
            rdm.setOpaque(false);
            rdf.setOpaque(false);
            p1.add(l1);
            p1.add(t1);
            p1.add(l2);
            p1.add(t2);
            p1.add(l3);
            p1.add(cb);
            p1.add(l4);
            p1.add(cba);
            p1.add(l5);
            rp.add(rdm);
            rp.add(rdf);
            p1.add(rp);
            
            //p2.setPreferredSize(new Dimension(700,350));
            p1.setPreferredSize(new Dimension(500,250));
            p2.setLayout(new FlowLayout());
            
            stup6.setLayout(new FlowLayout());
            
            
                        
           
                       
                        
        
            p2.add(p1);
            p1.setOpaque(false);
            p2.setOpaque(false);
            stup6.add(p6);
            stup6.setOpaque(false);
           
           p2.setBounds(00,100,520,300);
            
            stup6.setBounds(50,150,600,300);
            p2.setBorder(BorderFactory.createTitledBorder("Insert Detail"));
            dtb1=new DefaultTableModel();
            jtbl=new JTable(dtb1);
            dtb1.addColumn("Student name");
            dtb1.addColumn("Roll no.");
            dtb1.addColumn("Department");
            dtb1.addColumn("Academic year");
            dtb1.addColumn("Gender");
            dtb1.addColumn("Marks in subject 1");
            dtb1.addColumn("Marks in subject 2");
            dtb1.addColumn("Marks in subject 3");
            dtb1.addColumn("Marks in subject 4");
            dtb1.addColumn("Marks in subject 5");
            dtb1.addColumn("Total attendence");
            dtb1.addColumn("percentage");
            dtb1.addColumn("result");
            JScrollPane pane =new JScrollPane(jtbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
          pane.setBounds(0,440,1350,250);
            jtbl.setBounds(0,440,1345,250);
            try
            {
                connection();
                set=con.createStatement();
                rs=set.executeQuery("select * from student_detail");
                ResultSetMetaData rsmd=rs.getMetaData();
                int no_col =rsmd.getColumnCount();
                System.out.println("No. of col are------>>>"+no_col);
                Object[] ros=new Object[no_col];
                while(rs.next())
                {
                    for(int i=1;i<=no_col;i++)
                    {
                        ros[i-1]=rs.getString(i);
                    }
                    dtb1.addRow(ros);
                }
                
                
                
                
                
                
            }
            catch(Exception abcde)
            {
                
            }
        mainp.setLayout(null);
        mainp.add(ad);
        mainp.add(m);
        mainp.add(d);
        mainp.add(p2);
        mainp.add(insert);
        mainp.add(update);
        mainp.add(del);
        mainp.add(nxt);
        mainp.add(l17);
        mainp.add(l18);
        mainp.add(pane);
        stumrk.add(stup6);
        stumrk.add(l16);
        
        nxt.addActionListener(this);
        //student attendence panel
        
        lat1=new JLabel("ENTER NO. OF DAYS ABSENT  :");
        Font f21=new Font("ComicSans Ms",Font.HANGING_BASELINE,16);   
       lat1.setFont(f21);
                        lat1.setForeground(Color.black);
        lat2=new JLabel("NO. OF DAYS PRESENT  :");
        Font f22=new Font("ComicSans Ms",Font.HANGING_BASELINE,16);   
       lat2.setFont(f22);
                        lat2.setForeground(Color.black);
        lat3=new JLabel("ENTER TOTAL NO. OF DAYS  :");
        Font f23=new Font("ComicSans Ms",Font.HANGING_BASELINE,16);   
       lat3.setFont(f23);
                        lat3.setForeground(Color.black);
        tat1=new JTextField("");
        tat2 = new JTextField("");
        tat3 = new JTextField("120");
        tat3.setEditable(false);
        bat1=new JButton("CALCULATE");
        bat1.addActionListener(this);
        bat2=new JButton("NEXT");
        bat2.addActionListener(this);
        bat3=new JButton("BACK");
        bat3.addActionListener(this);
        bat4=new JButton("CLEAR");
        bat4.addActionListener(this);
        
        lat1.setBounds(40,30,250,85);
        lat2.setBounds(40,80,250,85);
        lat3.setBounds(640,30,250,85);
        tat1.setBounds(310,62,170,20);
        tat2.setBounds(310,112,170,20);
        tat3.setBounds(900,62,120,20);
        bat1.setBounds(300,170,130,19);
        bat2.setBounds(100,270,170,25);
        bat3.setBounds(350,270,170,25);
        bat4.setBounds(600,270,170,25);
        stuatt.add(lat1);
          stuatt.add(lat2);
            stuatt.add(lat3);
              stuatt.add(tat1);
                stuatt.add(tat2);
                  stuatt.add(tat3);
                    stuatt.add(bat1);
                      stuatt.add(bat2);
                        stuatt.add(bat3);
                          stuatt.add(bat4);
        stuatt.setLayout(null);
         
        setLayout(null);                  
        setVisible(true);
        setSize(1370,1000);
        setResizable(true);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setJMenuBar(mb);
        add(tp);
         
        
         }
    public void actionPerformed(ActionEvent ae1)
           {
               if(ae1.getSource()==update)
               {
                   try
                   {
                    String gender1;
                   String s11=t1.getText();
                   String s21=t2.getText();
                  String dp1=(String)cb.getSelectedItem();
                   String acy1=(String)cba.getSelectedItem();
                   
                    String s31=t11.getText();
                                 int x1=   Integer.parseInt(s31);
                                           
                    String s41=t12.getText();
                            int y1=   Integer.parseInt(s41);
                    String s51=t13.getText();
                           int z1    =   Integer.parseInt(s51); 
                    String s61=t14.getText();
                   int p1=   Integer.parseInt(s61);
                    String s71=t15.getText();
                            int q1=   Integer.parseInt(s71);
                   /* 11 will use att for attendance*/ 
                            String att11=tat2.getText();
                            int sum=x1+y1+z1+p1+q1;
                    double percentage1=((double)sum/500*100);
                   System.out.println(percentage1);
                                      String result1;
                   if(percentage1>40.0)
                           {
                               result1="Fail";
                           }
                   else{
                       result1="Pass";
                   }
                       if(rdm.isSelected())
                       {
                           gender1="MALE";
                           
                       }
                       else
                           gender1="FEMALE";
                 
                       connection();
                       System.out.println("SYstem is now again updated");
                       set=con.createStatement();
                       
                            
                         if ( set.executeUpdate("update student_detail set Student_name='"+s11+"',roll_no='"+s21+"',department='"+dp1+"',academic_year='"+acy1+"',gender='"+gender1+"',m1='"+x1+"',m2='"+y1+"',m3='"+z1+"',m4='"+p1+"',m5='"+q1+"',attendance='"+att11+"',percentage='"+percentage1+"',result='"+result1+"' where roll_no='"+eid+"'")==1);
                  
                       
//                       pstmt=con.prepareStatement ("update student_detail set student name='"+name+"',roll no='"+roll+"',department='"+depart+"',academic_year='"+acd+"',gender='"+gen+"',m1='"+std1+"',m2='"+std2+"',m3='"+std3+"',m4='"+std4+"',m5='"+std5+"',attendence='"+aten+"',percentage='"+per+"',result='"+res+"'");
                       System.out.println("updates checked");
                       t1.setText("");
                       t2.setText("");
                       cb.setSelectedIndex(0);
                       cba.setSelectedIndex(0);
                       t11.setText("");
                       t12.setText("");
                       t13.setText("");
                       t14.setText("");     
                        t15.setText("");
                        rdm.setSelected(false);
                        rdf.setSelected(false);
                       JOptionPane.showMessageDialog(this,"Updated.......","update messsge",JOptionPane.INFORMATION_MESSAGE);
                   }
                   catch(Exception abcde)
                   {
                       System.out.println("got exception"+abcde);
                   }
               }
               if(ae1.getSource()==ad)
               {
                    System.out.println("Implemented");
                   t1.setVisible(true);
                   t2.setVisible(true);
                   cb.setVisible(true);
                   cba.setVisible(true);
                   rdm.setVisible(true);
                   rdf.setVisible(true);
                   insert.setVisible(true);
                   del.setVisible(false);
                   update.setVisible(false);
                   
               }
               if(ae1.getSource()==mi1)
               {
                   dispose();
                   new impanel();
               }
               if(ae1.getSource()==d)
               {
                   System.out.println("Implemented--d");
                   t1.setVisible(false);
                   del.setVisible(true);
                   t2.setVisible(true);
                   cb.setVisible(false);
                   cba.setVisible(false);
                   rdm.setVisible(false);
                   rdf.setVisible(false);
                   insert.setVisible(false); 
                   update.setVisible(false);
               }
               if(ae1.getSource()==m)
               {
                   System.out.println("Implemented===u");
                   t1.setVisible(true);
                   t2.setVisible(true);
                   cb.setVisible(true);
                   cba.setVisible(true);
                   rdm.setVisible(true);
                   rdf.setVisible(true);
                   update.setVisible(true);
                   insert.setVisible(false);
                   del.setVisible(false);
                  eid= JOptionPane.showInputDialog("Enter roll no. which you want to modify");
                  
                  
               try
               {
                  connection();
                  set=con.createStatement();
                  rs=set.executeQuery("select * from student_detail where roll_no='"+eid+"'");
                  System.out.println("check1");
                  rs=set.executeQuery("select * from student_detail where roll_no='"+eid+"'");
                  System.out.println("check2");
                  ResultSetMetaData rdmt=rs.getMetaData();
                  System.out.println(rdmt.getColumnCount());
                  System.out.println(eid);
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
                      String per=rs.getString(12);
                      String res=rs.getString(13);
                      
                      t1.setText(name);
                      t2.setText(roll);
                      cb.setName(depart);
                      cba.setSelectedItem(acd);
                      System.out.println(gen);
                      if(rdm.getLabel().equals(gen))
                      {
                          rdm.setSelected(true);
                          System.out.println("male printed");
                          
                      }
                      else
                      {
                          rdf.setSelected(true);
                          System.out.println(rdm.getLabel());
                          System.out.println(rdf.getLabel());
                          System.out.println("female prineted");
                      }
                      t11.setText(String.valueOf(std1));
                      t12.setText(String.valueOf(std2));
                      t13.setText(String.valueOf(std3));
                      t14.setText(String.valueOf(std4));
                      t15.setText(String.valueOf(std5));
                      tat2.setText(String.valueOf(aten));
                  }
               }
               catch(Exception yu)
               {
               System.out.println(yu);    
               }
                  
                  
                
                       
                                    
               
                   
               }
               if(ae1.getSource()==nxt)
               {
                   tp.setSelectedIndex(1);
                   
               }
               if(ae1.getSource()==b33)
               {
                   tp.setSelectedIndex(2);
           }
               if(ae1.getSource()==b44)
               {
                   tp.setSelectedIndex(0);
             
   
}
               if(ae1.getSource()==bat1)
               {
                   int x,y;
                   String s1=tat3.getText();
                   x=Integer.parseInt(s1);
                   String s2=tat1.getText();
                   y=Integer.parseInt(s2);
                  att=x-y;
                   
                   String s3=String.valueOf(att);
                   tat2.setText(s3);
                   
                   
                   
               }
               //guest panel
               if(ae1.getSource()==mi)
               {
                   new regpage();
                   
               }
                    if(ae1.getSource()==del)
                    {
                        try
                        {
                        connection();
                        String id=t2.getText();
                        pstmt=con.prepareStatement("delete from student_detail where roll_no='"+id+"'");
                        if (pstmt.executeUpdate()==1)
                        {
                            t2.setText("");
                            JOptionPane.showMessageDialog(null,"deleted successfully","DELETION",JOptionPane.INFORMATION_MESSAGE);
                        }
                        }
                        catch(Exception wp)
                        {
                            System.out.println(wp);
                        }
                                
                    }
               
               if(ae1.getSource()==bat2)
               {
                   tp.setSelectedIndex(0);
}
               if(ae1.getSource()==bat3)
               {
                   tp.setSelectedIndex(1);
                   
}
               if(ae1.getSource()==bat4)
               {
                   tat1.setText("");
                   tat2.setText("");
}
               if(ae1.getSource()==insert)
               {
                   count++;
               if(count==1)
                   
               {
                   JOptionPane.showMessageDialog(null,"CLICK THE NEXT BUTTON","STUDENT DETAIL",JOptionPane.INFORMATION_MESSAGE);
               }
               if(count==2)
               {
                  /* 5 */  String gender;
                  /* 1 */ String s1=t1.getText();
                  /* 2 */ String s2=t2.getText();
                  /* 3 */String dp=(String)cb.getSelectedItem();
                  /* 4 */ String ay=(String)cba.getSelectedItem();
                   if(rdm.isSelected())
                   {
                      gender="Male";
                   }
                   else
                   {
                       gender="Female";
                       
                   }
                   /* 6 */ String s3=t11.getText();
                                 int x=   Integer.parseInt(s3);
                                           
                   /* 7 */ String s4=t12.getText();
                            int y=   Integer.parseInt(s4);
                   /* 8 */ String s5=t13.getText();
                           int z    =   Integer.parseInt(s5); 
                   /* 9 */ String s6=t14.getText();
                   int p=   Integer.parseInt(s6);
                   /* 10 */ String s7=t15.getText();
                            int q=   Integer.parseInt(s7);
                   /* 11 will use att for attendance*/ 

                            int sum=x+y+z+p+q;
                   /* 12 */ double percentage=((double)sum/500*100);
                   
                   System.out.println(percentage+"value of x-->"+x+"value of y-->"+y+"value of z-->"+z+"value of p-->"+p+"value of q-->"+q);
                   /* 13 */String result;
                   if(percentage>40.0)
                   {
                       result="Pass";
                       
                   }
                   else
                   {
                       result="Fail";
                   }
                try
                   {
              connection();
           pstmt=con.prepareStatement("insert into student_detail values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
           {
               pstmt.setString(1,s1);
               pstmt.setString(2,s2);
               pstmt.setString(3,dp);
               pstmt.setString(4,ay);
               pstmt.setString(5,gender);
               pstmt.setInt(6,x);
               pstmt.setInt(7,y);
               pstmt.setInt(8,z);
               pstmt.setInt(9,p);
               pstmt.setInt(10,q);
               pstmt.setInt(11,att);
               pstmt.setDouble(12,percentage);
               pstmt.setString(13,result);
               pstmt.setString(14,s2);
               
           }
           if(pstmt.executeUpdate()==1)
           {
               t1.setText("");
               t2.setText("");
               cb.setSelectedIndex(0);
               cba.setSelectedIndex(0);
               l11.setText("");
               l12.setText("");
               l13.setText("");
               l14.setText("");
               l15.setText("");
               rdm.setSelected(false);
               rdf.setSelected(false);
               JOptionPane.showMessageDialog(null,"Inserted Successfully","Value Insertion",JOptionPane.INFORMATION_MESSAGE);
           }
           System.out.println(pstmt.executeUpdate());
           
               
           }
                   catch(Exception abc )
                   {
                       System.out.println("sp");
                   }
                
              
               }
               if(count>2)
               {
                   count=1;
               }
               
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
        class signup 
        {
            public static void main(String arg[])
            {
                zxc z=new zxc();
            }
}

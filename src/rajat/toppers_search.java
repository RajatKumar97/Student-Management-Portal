package rajat;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.event.*;



class hello extends JFrame implements ActionListener
{
    JLabel tl1,tl2,tl3,tl4,tl5,tl6,tl7,tl8,tn,tl;
    JTextField tt1,tt2,tt3,tt4,tt5,tt6,tt7;
    JComboBox tcb;
    JPanel tp1,tp2;
    Connection con;
    ResultSet rs;
    Statement st;
    String top;
    JButton display;
    JPanel im;
    Image t;
    
    
 hello() 
 {
     im=new JPanel()
                    {
           public void paintComponent(Graphics g)
			{
				t=new ImageIcon("D:/java/god1.jpg").getImage();
				
                               g.drawImage(t,0,0,this);
				
			}
       };
            im.setLayout(null);
     display=new JButton("Display");
     display.setBounds(380,90,90,25);
     im.add(display);
     display.addActionListener(this);
    
     setTitle("TOPPERS LIST");
   // this.setBounds(100,50,this.getWidth(),this.getHeight());
     tl=new JLabel("Name Of The Star Is:");
      Font f121=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       tl.setFont(f121);
                        tl.setForeground(Color.white);
   //  tl.setFont(new Font("ComicSans Ms", Font.PLAIN, 20));
     tl.setBounds(400,10,200,30);
   //  tl.setForeground(Color.black);
     tn=new JLabel();
     Font f14=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       tn.setFont(f14);
                        tn.setForeground(Color.white);
     tn.setBounds(620,10,200,30);
     
  tl1=new JLabel("Click Below to Select ");
   Font f11=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       tl1.setFont(f11);
                        tl1.setForeground(Color.white);
  
   tcb=new JComboBox();
  //tcb.addItemListener(this);
   
   tp1=new JPanel();
           tl2=new JLabel("Mathematics Marks");
           Font f6=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       tl2.setFont(f6);
                        tl2.setForeground(Color.WHITE);
          tl3=new JLabel("Physics Marks");
          Font f16=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       tl3.setFont(f16);
                        tl3.setForeground(Color.WHITE);
          tl4=new JLabel("Chemistry Marks");
          Font f26=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       tl4.setFont(f26);
                        tl4.setForeground(Color.WHITE);
          tl5=new JLabel("C Programming ");
          Font f36=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       tl5.setFont(f36);
                        tl5.setForeground(Color.WHITE);
          tl6=new JLabel("Java Programming Marks");
          Font f46=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       tl6.setFont(f46);
                        tl6.setForeground(Color.WHITE);
          tl7=new JLabel("TOTAL");
          Font f76=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       tl7.setFont(f76);
                        tl7.setForeground(Color.WHITE);
          Font f56=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       tl3.setFont(f56);
                        tl3.setForeground(Color.WHITE);
          tl8=new JLabel("AVERAGE");
          Font f66=new Font("ComicSans Ms",Font.HANGING_BASELINE,20);   
       tl8.setFont(f66);
                        tl8.setForeground(Color.WHITE);
          
       tt1=new JTextField();
      tt2=new JTextField();
       tt3=new JTextField();
       tt4=new JTextField();
      tt5=new JTextField();
       tt6=new JTextField();
       tt7=new JTextField();
       tp1=new JPanel();
       tp2=new JPanel();
       
       tp1.add(tl2);
       tp1.add(tt1);
       tp1.add(tl3);
       tp1.add(tt2);
       tp1.add(tl4);
       tp1.add(tt3);
       tp1.add(tl5);
       tp1.add(tt4);
       tp1.add(tl6);
       tp1.add(tt5);
       tp1.add(tl7);
       tp1.add(tt6);
       tp1.add(tl8);
       tp1.add(tt7);
       tp2.add(tp1);
       tp1.setOpaque(false);
       tp2.setOpaque(false);
       
       GridLayout tgl=new GridLayout(7,2,12,14);
       tp1.setLayout(tgl);
        tp1.setPreferredSize(new Dimension(400,250));
           tp2.setLayout(new FlowLayout());
           
           tp2.setBounds(350,250,450,300);
            tp2.setBorder(BorderFactory.createTitledBorder("MARKS DETAIL"));
             try//createTitledBorder("MARKS DETAIL"));
   {
       Connect();
       st=con.createStatement();
       rs=st.executeQuery("SELECT roll_no from student_detail where percentage=(select max(percentage)from student_detail)");
       System.out.println("check 1");
       
       
       while(rs.next())
       {
          
           
          tcb.addItem(rs.getString(1));
           
       }
   }
             catch(Exception rt)
             {
                 rt.printStackTrace();
             }
 
//  tcb.addActionListener(this);
  
    
    tl1.setBounds(190, 45, 280, 50);
    tcb.setBounds(190,90,150,25);
    
        tcb.setSelectedItem(null);
       
  im.add(tl);
  im.add(tn);
 im. add(tl1);
  im.add(tcb);
 im.add(tp2);
 add(im);
   //im.setLayout(null);
      setVisible(true);
      setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
      setSize(900,600);
      setResizable(false);
      
 }
  public void Connect()
    {
         try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajatproject", "root","");
           System.out.println("Connected Successfully----");
                    
       }
       catch(Exception de1)
       {
           System.out.println(de1);
           de1.printStackTrace();
       } 
    }
  
  
  


   
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==display)
        {
        try{
    Connect();
       st=con.createStatement();
     
           String selection=(String)tcb.getSelectedItem();
            rs=st.executeQuery("select * from student_detail where roll_no='"+selection+"' ");
            while(rs.next())
            {
               tn.setText(rs.getString(1));
                String roll=rs.getString(2);
                String  depart=rs.getString(3);
               String   acd=rs.getString(4);
                 String gen=rs.getString(5);
                 
                int aten=rs.getInt(11);
                 String per=rs.getString(12);
                String  res=rs.getString(13);
               int f1=rs.getInt(6);
               int f2=rs.getInt(7);
               int f3=rs.getInt(8);
               int f4=rs.getInt(9);
               int f5=rs.getInt(10);
               int sums=f1+f2+f3+f4+f5;
               double avg=(double)sums/5;
               tt6.setText(String.valueOf(sums));
               tt7.setText(String.valueOf(avg));
                tt1.setText(String.valueOf(f1));
                tt2.setText(String.valueOf(f2));
                tt3.setText(String.valueOf(f3));
                tt4.setText(String.valueOf(f4));
                tt5.setText(String.valueOf(f5));
       }
       
        
        }
        catch(Exception es)
        {
            JOptionPane.showMessageDialog(null,"error "+es);
        }
        }
        
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
       
}  
 


public class toppers_search
{
   public static void main(String arg[])
   {
       hello h=new hello();
   }
}

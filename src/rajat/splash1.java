package rajat;


import java.awt.*;
import javax.swing.*;
import javax.swing.UIManager;

class splash1 extends JWindow implements Runnable 
{
    Image im;
   JProgressBar progressBar;
   int min=10;
   int max=100;
   
    splash1()
    {
        
    im=Toolkit.getDefaultToolkit().getImage("D:\\java\\chitkara.jpg"); // Change path of image as per your pc
 progressBar = new JProgressBar(JProgressBar.HORIZONTAL);

   
        setVisible(true);
        setSize(1380,800);
        show();
         Thread t=new Thread();
        t.start();
         
         progressBar.setBounds(140, 620, 1050,23);
        
         setLayout(null);
        add(progressBar);
                 //pack();
         
     //   UIManager.put("ProgressBar.background", Color.orange);
//UIManager.put("ProgressBar.foreground", Color.blue);
        
    }
    public void run()
    {
        int min=0;
        int max=100;
        min=progressBar.getMinimum();
        max=progressBar.getMaximum();
        
        try
        {
        for(int i=min;i<=max;i++)
        {
            int value=progressBar.getValue();
            progressBar.setValue(value+1);
            progressBar.setStringPainted(true);
            if(progressBar.getValue()>=100)
        {            new impanel(); // at this place, call the next file which you want to show after this splash..... 

            dispose();
        }
            Thread.sleep(50);
        }
        
        
       // Thread.start();
        }
        catch(Exception y)
        {
            y.printStackTrace();
        }
 
    }
   
    
   public void paint(Graphics g)
    {
        g.drawImage(im,0,0,this);
    }
  
    public static void main(String ty[])
    {
        try
        {
            
         //   UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
         //  UIManager.setLookAndFeel("UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel);
           UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            UIManager.put("ProgressBar.background", Color.blue);
        }
        catch(Exception ab)
        {
            System.out.println("at last ");
        }
        new splash1().run();
    }

}
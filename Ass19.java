
import java.awt.*;
import java.awt.event.*;
public class Ass19 extends Frame implements ActionListener,Runnable
{
    Button b1,b2;
   TextArea t;
    int cnt;
   Thread t1 = new Thread(this,"t1");
   public Ass19()
   {
         setLayout(null);
         t=new TextArea();
         b1=new Button("Start");
         b2=new Button("Stop");
         t.setBounds(50,50,600,100);
         t.setForeground(Color.RED);
         b1.setBounds(50,170,100,30);
        b2.setBounds(160,170,100,30);
       add(t);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
       add(b2);
        setSize(900,400);
        setVisible(true);
         cnt=0;

	              
                


    }
    public void actionPerformed(ActionEvent ae)
    {
           String str;
           str=ae.getActionCommand();
           if(str.equals("Start"))
          {
                    
                    t1.start();
          }
          if(str.equals("Stop"))
          {
                   t1.stop();
          }
     }
     public void run()
    {
                 try
                 {
                                 while(true)
                                {
                                		
                                 for(int i=0;i<=100;i++)
                                {
                                		t.setText(" "+i);
			Thread.sleep(150);
                                                       
		
                                 }
                                              
                                 }
                }
                catch(Exception e)
                {}
      }
    public static void main(String args[])
        {
            new Ass19().show();      
        }
}

              

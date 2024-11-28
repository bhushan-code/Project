import java.awt.*;
import java.awt.event.*;


class CalculatorX
{
    public static void main(String A[])
    {
        Calculator cobj = new Calculator(300,375,"CalculatorX");
    }
}

class Calculator extends WindowAdapter implements ActionListener            //Both class and interface from java.awt.event.*
{
    public Frame mainframe;
    public Button b1,b2,b3,b4;
    public TextField t1,t2;
    public Label lobj;
    Integer No1, No2;

    public Calculator(int Width, int Height, String Title)
    {
        //Frame creation
        mainframe = new Frame(Title);                                       
        mainframe.setSize(Width,Height);                                    
        mainframe.setLocation(50,50);                                       
        mainframe.addWindowListener(this);                                  


        //button creation
        b1 = new Button("ADD");                                             
        b1.setBounds(30,220,100,30);                                         
        mainframe.add(b1);                                                  
        b1.addActionListener(this);                                         


        b2 = new Button("SUB");
        b2.setBounds(170,220,100,30);
        mainframe.add(b2);
        b2.addActionListener(this);


        b3 = new Button("MULT");
        b3.setBounds(30,280,100,30);
        mainframe.add(b3);
        b3.addActionListener(this);


        b4 = new Button("DIV");
        b4.setBounds(170,280,100,30);
        mainframe.add(b4);
        b4.addActionListener(this);


        //textfield creation 
        t1 = new TextField();                                               
        t1.setBounds(30,75,100,40);                                        
        mainframe.add(t1);                                                  


        t2 = new TextField();
        t2.setBounds(170,75,100,40);
        mainframe.add(t2);       
        

        //label creation    
        lobj = new Label("Result : ");                                                
        lobj.setBounds(100,120,200,100);                                    
        mainframe.add(lobj);

      
        mainframe.setLayout(null);
        mainframe.setVisible(true);
    }

    //To close button work
    public void windowClosing(WindowEvent wobj)                              //windowClosing from WindowAdaptor class
    {
        System.exit(0);                                             
    }

    //logic for buttons
    public void actionPerformed(ActionEvent aobj)                           //actionPerformed from ActionListener interface
    {
        try
        {
            No1 = Integer.parseInt(t1.getText());                           
            No2 = Integer.parseInt(t2.getText());

            if(aobj.getSource() == b1)                                      
            {
                lobj.setText("Addition is : "+(No1+No2));
            }
            else if(aobj.getSource() == b2)
            {
                lobj.setText("Substraction is : "+(No1-No2));
            }
            else if(aobj.getSource() == b3)
            {
                lobj.setText("Multiplication is : "+(No1*No2));
            }
            else if(aobj.getSource() == b4)
            {
                lobj.setText("Division is : "+(No1/No2));
            }
        }
        catch(Exception eobj)
        {}
    }
}

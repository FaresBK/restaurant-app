  import javax.swing.*;
  import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
  
public class Client1 extends JFrame{
    JButton bt1,bt2,bt3,bt4;
     JLabel lab1,lab2,lab3;
    public Client1 (){
        setLayout(null);
        
        setSize(400,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Restaurant-app");
       lab1=new JLabel("liste des Restaurants :");
        lab1.setText("liste des Restaurants");
        lab1.setFont(new Font("serif", Font.BOLD, 20));
        
        lab1.setBounds(100,30,200,40);
        bt1=new JButton("Restaurant 1");
        bt1.setBounds(50,80,150,30);
        bt2=new JButton("Restaurant 2");
        bt2.setBounds(50, 140, 150,30);
         bt3=new JButton("Restaurant 3");
        bt3.setBounds(50, 190, 150,30);
         bt4=new JButton("Restaurant 4");
        bt4.setBounds(50, 240, 150,30);
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(lab1);
        bt1.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent arg0) {
                                Rest1 rest1 = new Rest1();
				rest1.setVisible(true);
				rest1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				}

			});  
         bt2.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent arg0) {
				 Rest2 rest2=new Rest2();
                                 rest2.setVisible(true);
                                 rest2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				  	
				}

			});  
          bt3.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent arg0) {
				 Rest3 rest3=new Rest3();
                                 rest3.setVisible(true);
                                 rest3.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				  	
				}

			});  
           bt4.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent arg0) {
				  Rest4 rest4=new Rest4();
                                 rest4.setVisible(true);
                                 rest4.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				  	
				}

			});  
    }
            
    public static void main(String[] args){
       
            Client1 c1=new Client1();
        c1.setVisible(true);
       
       
        
         
    }
}

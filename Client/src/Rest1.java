import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.intserveur;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
public class Rest1 extends JFrame{
    int i=0;
       intserveur stub;
          JLabel Jlb1,Jlb2,Jlb3,Jlb4,Jlb5,Jlb6;
          JTextField txt1,txt2,txt3;
          JButton btn;
           int a,b,c,com;
           double x;
            Connection connection=null;
            Statement statement=null;
            PreparedStatement preparedStatement=null;
            ResultSet resultSet=null;
           public Rest1 (){
                 setSize(400,400);
                  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                     this.setTitle("Restaurant 1");
                  setLayout(null);
                  Jlb1=new JLabel("Restaurant 1 :");
                  Jlb5=new JLabel("Entrez le Vote :");
                  Jlb1.setBounds(120,20,250,40);
                  Jlb5.setBounds(40,60,250 , 30);
                  Jlb1.setFont(new Font("serif", Font.BOLD, 20));
                  Jlb2=new JLabel("Qualité de la nourritur :");
                  Jlb2.setBounds(30,100, 230, 20);
                  txt1=new JTextField();
                  txt1.setBounds(170,100,50,30);
                  Jlb3=new JLabel("Qualité de Salla :");
                  Jlb3.setBounds(30,150, 100, 20);
                  txt2=new JTextField();
                  txt2.setBounds(170,150,50,30);
                   Jlb4=new JLabel("Qualité de Service :");
                  Jlb4.setBounds(30,200, 150, 20);
                  txt3=new JTextField();
                  txt3.setBounds(170,200,50,30);
                  Jlb6=new JLabel("0");
                  Jlb6.setBounds(30, 260, 150, 30);
                  btn=new JButton ("MOY");
                  btn.setBounds(230, 260, 80, 30);
                 
               
              try {
                   Class.forName("com.mysql.jdbc.Driver");
                   connection=DriverManager.getConnection("jdbc:mysql://localhost/myinfo?user=root&password=1234");
                   statement=connection.createStatement();
                    resultSet= statement.executeQuery("SELECT secor from user1");
                    int x = 0;
                     while(resultSet.next()){
                        x = resultSet.getInt(1);
                     }
                     
                     
                    x++;
                     String query = "update user1 set secor = ?";
                      PreparedStatement preparedStmt = connection.prepareStatement(query);
                      preparedStmt.setInt(1, x);
                      preparedStmt.executeUpdate();
                    Jlb6.setText(" number de visitor = "+x);
                   
		    
                  
                    
                    
                   this.stub= (intserveur)Naming.lookup("rmi://localhost:1020/FR");
                  } catch (Exception ex) {
                   ex.printStackTrace();
                  }
              
                btn.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent arg0) {
                        a=Integer.parseInt(txt1.getText());
                        b=Integer.parseInt(txt2.getText());
                        c=Integer.parseInt(txt3.getText());
                       try {
                                          
                           x=stub.moy(a, b, c);
                         JOptionPane.showMessageDialog(btn," le Moy = "+x);
                         
                          } catch (Exception ex) {
                          ex.printStackTrace();
                       }
				
                   }

			});  
              
              add(Jlb1);
              add(txt1);
              add(Jlb2);
              add(Jlb3);
              add(txt2);
              add(Jlb4);
              add(txt3);
              add(Jlb6);
              add(btn);
              add(Jlb5);
           }   
        
    
   public static void main (String [] args){
            Rest1 R1=new Rest1();
            R1.setVisible(true);
            //R1.setDefaultCloseOperation(HIDE_ON_CLOSE);
             
    }
    
}

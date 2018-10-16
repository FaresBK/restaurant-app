package restaurants_app_serveur;

import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.Remote;
import java.util.Scanner;

public class Restaurants_App_Client {


    public static void main(String[] args) throws Exception {
       
        Remote r = Naming.lookup("rmi://"
					+ InetAddress.getLocalHost().getHostAddress() + ":" + 1099
					+ "/DATA");
			System.out.println(r);
                        if (r instanceof interface_partager) {
                            int i;
                            restaurant res=new restaurant();
                            String [] liste=res.getTab(); 
                            int []liste1=res.getTab1();
                            System.out.println("voici le classement des restaurants!");
                            for (i=0;i<liste.length;i++){
                                System.out.println(liste[i]);
                            }  
                            
                            for(int j=0;j<=2;j++){
                            System.out.println("Bonjour monsieur num"+j+" quel est votre choix!"); 
                             Scanner lire = new Scanner(System.in);
                            String c=lire.nextLine();
        
                            switch (c) {
                               	case "rest1": { 
                                      int compteur=0;  
                                      for(int a=0;a<=2;a++){
                                      System.out.println("donner moi votre avis sur cet restaurant  ");
                                      System.out.println("votre note sere /20  ");
                                      System.out.println("Qualité de la nourriture");
                                      int nour=lire.nextInt();
                                      System.out.println("Qualité de la salle");
                                      int salle=lire.nextInt();
                                      System.out.println("Qualité du service");
                                      int service=lire.nextInt();
			              int s = ((interface_partager) r).CalculerScore(nour, salle, service);
			              System.out.println("moyenne  d'evaluation pour  ="+c+" est " + s);
                                      System.out.println("merci   pour  votre avis");
                                      compteur=compteur+s;
                                      int score = ((interface_partager) r).CalculerMoyenne(compteur);
                                      System.out.println("le score est "+score);
                                      //liste1[0]=(score);]
                                       }  break;
                                }
                             
                                  case "rest2": { 
                                      int compteur1=0;  
                                      for(int a=0;a<=2;a++){
                                      System.out.println("donner moi votre avis sur cet restaurant client ");
                                      System.out.println("votre note sere /20  ");
                                      System.out.println("Qualité de la nourriture");
                                      int nour=lire.nextInt();
                                      System.out.println("Qualité de la salle");
                                      int salle=lire.nextInt();
                                       System.out.println("Qualité du service");
                                      int service=lire.nextInt();
			              int s = ((interface_partager) r).CalculerScore(nour, salle, service);
			              System.out.println("moy d evaluation pour  ="+c+" " + s);
                                      System.out.println("moyenne  d'evaluation pour  ="+c+" est " + s);
                                      System.out.println("merci   pour  votre avis");
                                      compteur1=compteur1+s;
                                       int score = ((interface_partager) r).CalculerMoyenne(compteur1);
                                      System.out.println("le score est "+score);
                                      // liste1[1]=(score);
                                        }break;
                                }
                                	case "rest3": { 
                                      int compteur=0;  
                                       for(int a=0;a<=2;a++){
                                      System.out.println("donner moi votre avis sur cet restaurant client ");
                                       System.out.println("votre note sere /20  ");
                                      System.out.println("Qualité de la nourriture");
                                      int nour=lire.nextInt();
                                      System.out.println("Qualité de la salle");
                                      int salle=lire.nextInt();
                                       System.out.println("Qualité du service");
                                      int service=lire.nextInt();
			              int s = ((interface_partager) r).CalculerScore(nour, salle, service);
			              System.out.println("moy d evaluation pour  ="+c+" " + s);
                                      System.out.println("moyenne  d'evaluation pour  ="+c+" est " + s);
                                      System.out.println("merci   pour  votre avis");
                                      compteur=compteur+s;
                                      int  score = ((interface_partager) r).CalculerMoyenne(compteur);
                                       System.out.println("le score est "+score);
                                     //  liste1[2]=(score);
                                       }break;
                                }
                                 
                         }   
                           
                           for (int z=0;i<liste1.length;z++){
                                System.out.println(liste1[z]); }  } 
                            
                            
                          
                       
                           
                            
                            
                            }}}



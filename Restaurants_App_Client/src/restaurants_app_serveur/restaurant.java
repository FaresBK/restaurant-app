package restaurants_app_serveur;

public class restaurant {
    String nom;
   public String [] t;
   public int []t1;
   public String getNom(){
      return nom;  
    }
    public void setNom(String name){
        this.nom=name;
        
    }
    
    public restaurant(){
        t=new String [3];
        t[0]=("rest1");
        t[1]=("rest2");
        t[2]=("rest3");
         t1=new int [3];
        t1[0]=(5);
        t1[1]=(4);
        t1[2]=(3);
    }
     public String []getTab(){
      return t;  
    }
    public void setTab(String []table){
        this.t=table;
        
    }
     
     public int []getTab1(){
      return t1;  
    }
    public void setTab1(int []table){
        this.t1=table;
        
    }
}

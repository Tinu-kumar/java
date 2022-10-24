class ComputerProfessional{
  String ename;
 int dutyhour;
  String prospect;
  
  ComputerProfessional(String name , int dh , String prs)
  {
      ename=name;
      dutyhour=dh;
      prospect=prs;    
  }
   
   void display() 
   {
         System.out.println("ename:" + ename);
        System.out.println("dutyhour:" + dutyhour);
        System.out.println("prospect:" + prospect);
    }
}

class Developer extends ComputerProfessional
{
     
    double studyhours;
     Developer( String name , int dh , String pro , double studyhours )
     {
        super(name,dh,pro);
        this.studyhours=6;
     }
     
   void display()
   {
      super.display();
        System.out.println("studyhours:" + studyhours);
       
      
   }
  
   
}

class NetworkAdmin extends ComputerProfessional
{
   
   double praticehours;
   NetworkAdmin( String name , int dh , String pro , double ph)
   {
       super(name,dh,pro);
         praticehours=ph;
   }
     void display()
   {
      super.display();
        System.out.println("praticehours:" + praticehours);
      
       
      
   }
}

class DataOperator extends ComputerProfessional
{

   int typingspeed;
   DataOperator( String name , int dh , String pro , int ts)
   {
       super(name,dh,pro);
        typingspeed=ts;
   }
     void display()
   {
      super.display();
        System.out.println("typingspedd:" + typingspeed);
      
       
      
   }
}


class javaProfessional extends Developer
{
    String proficiencylevel;
 
   
  javaProfessional( String name , int dh , String pro , double sh , String pl)
   {
       super(name,dh,pro,sh );
         proficiencylevel=pl;
   }
     void display()
   {
      super.display();
        System.out.println("proficiency level:" + proficiencylevel);
      
       
      
   }
}
/*
class pythonProfessional extends Developer
{
    String proficiencylevel;
}
*/

 public class ass5
{
  public static void main(String[] args)
   {
      System.out.println("developer");
      Developer ob1=new Developer("amit" , 10, "excellent" ,  5.0);
      ob1.display();
        System.out.println("networkadmin");
       NetworkAdmin ob2=new NetworkAdmin("ankush" , 20 , "good" , 6.54);
         ob2.display();
          DataOperator ob3=new DataOperator("rajesh" , 50, "very good" ,6);
           ob3.display();
        javaProfessional ob4=new javaProfessional("mukesh" , 60, "good" ,7.5 , "beginner");
           ob4.display();
   }
  
}
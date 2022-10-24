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
     Developer( String name , int dutyhour , int prospect , double studyhours )
     {
        super("amit",10,"excellent");
        this.studyhours=6;
     }
     
   void display()
   {
      super.display();
        System.out.println("studyhours:" + studyhours);
       
      
   }
  
   
}
/*
class NetworkAdmin extends ComputerProfessional
{
   private double praticehours;
}

class DataOperator extends ComputerProfessional
{
     private int typingspeed;
}


class javaProfessional extends Developer
{
   private String proficiencylevel;
}

class pythonProfessional extends Developer
{
   private String proficiencylevel;
}
*/

class ass5
{
  public static void main(String[] args)
   {
      Developer ob1=new Developer();
      ob1.display();
   }
  
}
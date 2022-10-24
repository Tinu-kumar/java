


 class Test{

 void show() 
       { 

         System.out.println("1");
      
        }
}

class xyz extends Test
{
   
     synchronized   void show() 
    {

      System.out.println("2");
       
     }

    public static void main(String [] args)
    {

      Test t=new Test();
        t.show();
       xyz s=new xyz();
      s.show();
}
}



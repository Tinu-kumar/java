class abstract
{
   
     Public static void main(String [] args)
        {
           saving s1=new saving(123);
       }

}


 class saving extends abstract
{
     private double y;
    public saving (int x)
       {
        y=x;   
       } 
       void show()
        {
            System.out.println(y);
          }
}
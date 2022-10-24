class qabstract
{
   
     Public static void main(String [] args)
        {
           saving s1=new saving(123);
       }

}


 class saving extends qabstract
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
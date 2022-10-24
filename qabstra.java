class qabstra
{
    int a=10;
     public static void main(String args[])
        {
           saving s1=new saving(123);
           s1.show();
       }

}


 class saving extends qabstra
{
     public double y;
    public saving (int x)
       {
        y=x;   
       } 
       void show()
        {
            System.out.println(y);
          }
}
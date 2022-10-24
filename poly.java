class poly{


   void show(int a )
      {

        System.out.println("1");
       }
       void show(int... a  )
       {
           System.out.println("9");
         }
        public static void main(String[] args)
        {
            poly t=new poly();
            t.show();
           }
           
}
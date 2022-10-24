import java.util.*;

class Shape
{
     void cal_area()
      {
         
      }

      public static void main(String args[])
      {
          Square s1=new Square();
             s1.cal_area();
      }

}

class Square extends Shape
{
   int a,result;
   
   void get()
       {
          Scanner sc=new Scanner(System.in);
          a=sc.nextInt();
        }
         void put()
           {

               result=a*a;
           }
    void cal_area()
    {
       get();
        put();
       
      System.out.println("sqaure area is = " + result);
    }
}

class Rectangle extends Shape
{
   int a,b,result;
   void get()
       {
          Scanner sc=new Scanner(System.in);
          a=sc.nextInt();
          b=sc.nextInt();
        }
          void put()
           {

               result=a*b;
           }
    void cal_area()
    {
      System.out.println("sqaure area is = " + result);
    }
}

class Triangle extends Shape
{
   int a,b,c,s;
      double result;
   void get()
       {
          Scanner sc=new Scanner(System.in);
          a=sc.nextInt();
          b=sc.nextInt();
          c=sc.nextInt();
            s=(a+b+c)/2;
            
        }
          void put()
           {

               result=Math.sqrt(  s*(s-a)*(s-b)*(s-c)   );
           }
    void cal_area()
    {
      System.out.println("sqaure area is = " + result);
    }
}


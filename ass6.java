import java.util.*;


class Shape
{
   protected int length , height;
 void get()

    {

   }
   void cal_area()
   {
   }

   void put()
   {

   }


   
}
class Square extends Shape
 {
          
   protected int a;
   void get()
  { 
    Scanner s1=new Scanner(System.in);
    length=s1.nextInt();
  }
   void cal_area()
   { 
         a=length*length;
   }
     void put()
    {
           System.out.println("square is: " + a);
    }

  }




class Rectangle extends Shape
 {
          
   protected int a;
   void get()
  { 
    Scanner s1=new Scanner(System.in);
    length=s1.nextInt();
    height=s1.nextInt();
  }
   void cal_area()
   { 
         a=length*height;
   }
     void put()
    {
           System.out.println("Rectangle is: " + a);
    }

  }




class Triangle extends Shape
 {
          
   protected int a;
   void get()
  { 
    Scanner s1=new Scanner(System.in);
    length=s1.nextInt();
    height=s1.nextInt();
  }
   void cal_area()
   { 
         a=(length*height)/2;
   }
     void put()
    {
           System.out.println("Triangle is: " + a);
    }

  }


class ass6
{
  public static void main(String[] args)
{
  Square ob1=new Square();
    ob1.get();
    ob1.cal_area();
ob1.put();


  Rectangle ob2=new Rectangle();
    ob2.get();
    ob2.cal_area();
ob2.put();



  Triangle ob3=new Triangle();
    ob3.get();
    ob3.cal_area();
ob3.put();
}
}
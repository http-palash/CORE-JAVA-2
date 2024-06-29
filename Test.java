import java.util.Scanner;
class Point{
        int x,y;
 
    Point()
    {
        x=0;y=0;
    }
    Point(int a)
    {
        x=y=a;
    }
    Point(int a,int b)
    {
        this.x=a;
        this.y=b;
    }
    Point(Point p)
    {
        this.x=p.x;
        this.y=p.y;
    }

    void read()
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Value of x : ");
        x=input.nextInt();
        System.out.println("Enter Value of Y : ");
        y=input.nextInt();
    }
    void display()
    {
        System.out.println("X : "+x+" Y : "+y);
    }

    Point add(Point p)
     {
        Point t = new Point();
        t.x=this.x+p.x;
        t.y=this.y+p.y;
        return t;
        // return new Point (this.x+p.x,this.y+p.y);
    }

     Point sub(Point p)
     {
        Point t = new Point();
        t.x=this.x-p.x;
        t.y=this.y-p.y;
        return t;
        // return new Point (this.x-p.x,this.y-p.y);
     }

     void Eq( Point p1, Point p2)
     {
         boolean ifequal = true;
         boolean ifnotequal = false; 
         if(p1 == p2)
         {
            System.out.println(ifequal); 
         }
         else
         {
            System.out.println(ifnotequal); 
         }
     }

     Point ad(Point p)
     {
         Point t = new Point();
         t.x=this.x*p.x;
         t.y=this.y*p.y;
         return t;
     }
    public static void main(String[] args)
    {
     
         Point p1= new Point();
         Point p2= new Point(2);
         Point p3= new Point(2,3);
         Point p4= new Point(p3);
         
         p1.display();
         p2.display();
         p3.display();
         p4.display();
         p3.read();
         p3.display();
         Point a = new Point(p1.add(p2));
         a.display();
         Point b = new Point(p1.sub(p2));
         b.display();
         Point p5=new Point(p3);
         p4.Eq(p3,p4);
         Point ad = new Point(p3.ad(p4));
         ad.display();
    }
}
import java.util.Scanner;
class Point {
		int x,y;
		Point() {
			x=0;
			y=0;
		}

		Point(int a) {
			x=y=a;
		}
		Point(int x,int y) {
			this.x=x;
			this.y=y;
		}
		Point(Point m) {
			/*or
			x=m.x;
			y=m.y;
			*/
			this.x=m.x;
			this.y=m.y;
		}
		void display() {
			System.out.println(" x : " +x+ " y : "+y);
		}
		
		Point add(Point a)
		{
		    Point t = new Point(); // to not change p1 & p2
		    t.x = this.x + a.x;
		    t.y = this.x + a.y;
		    return t;
        }
        
        Point sub(Point a)
		{
		    Point t = new Point(); // to not change p1 & p2
		    t.x = this.x - a.x;
		    t.y = this.x - a.y;
		    return t;
        }
		
		void read()
		{
		    Scanner input = new Scanner (System.in);
		    System.out.println("Enter value of x : ");
		    x=input.nextInt();
		     System.out.println("Enter value of y : ");
		    y=input.nextInt();
        }
		public static void main(String[] args) {
			Point p1 = new Point ();
			Point p2 = new Point (1);
			Point p3 = new Point (2,3);
			Point p4 = new Point (p3);
//			p1.display();
////			p2.display();
			p3.display();
//			p4.display();
			
//			Point l = new Point(p2.add(p1));
//			l.display();

//Point l = new Point(p2.sub(p1));
//			l.display();			
			p3.read();
			p3.display();
		}
}

/*
or
class Main
{
public static void main(String[] args)
  {
    // have to save program as main.java
  }
}
*/

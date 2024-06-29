import java.util.Scanner;
class Complex {
		int x,y;
		Complex() {
			x=0;
			y=0;
		}

		Complex(int a) {
			x=y=a;
		}
		Complex(int x,int y) {
			this.x=x;
			this.y=y;
		}
		Complex(Complex m) {
			/*or
			x=m.x;
			y=m.y;
			*/
			this.x=m.x;
			this.y=m.y;
		}
		void display() {
			System.out.println(x+"+"+y+"i");
		}
		
		Complex add(Complex a)
		{
		    Complex t = new Complex(); // to not change p1 & p2
		    t.x = this.x + a.x;
		    t.y = this.x + a.y;
		    return t;
        }
        
        Complex sub(Complex a)
		{
		    Complex t = new Complex(); // to not change p1 & p2
		    t.x = this.x - a.x;
		    t.y = this.x - a.y;
		    return t;
        }
		
		void read()
		{
		    Scanner input = new Scanner (System.in);
		    System.out.println("Enter value of a : ");
		    x=input.nextInt();
		     System.out.println("Enter value of b : ");
		    y=input.nextInt();
        }
		public static void main(String[] args) {
			Complex p1 = new Complex ();
			Complex p2 = new Complex (1);
			Complex p3 = new Complex (2,3);
			Complex p4 = new Complex (p3);
			
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
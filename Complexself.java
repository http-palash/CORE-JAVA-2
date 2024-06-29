import java.util.Scanner;
class Complex
{
    int x,y;
    Complex() {
			x=0;
			y=0;
		}
		Complex(int a) {
			x=y=a;
		}
		Complex(int x,int y) 
        {
			this.x=x;
			this.y=y;
		}
		Complex(Complex c) {
			x=c.x;
			y=c.y;
		}
		void display() {
			System.out.println("Complex no is");
            System.out.println(x+"+"+y+"i");
		}
        void read()
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter X : ");
            x=input.nextInt();
            System.out.println("Enter Y : ");
            y=input.nextInt();
        }
		
		Complex add(Complex a)
		{
		    Complex t = new Complex(); // to not change p1 & p2
		    t.x = this.x + a.x;
		    t.y = this.y + a.y;
		    return t;
        }
        
        Complex sub(Complex a)
		{
		    Complex t = new Complex(); // to not change p1 & p2
		    t.x = this.x - a.x;
		    t.y = this.y - a.y;
		    return t;
        }
        Complex mul(Complex c)
        {
            Complex t = new Complex();
            t.x=this.x*c.x;
            t.y=this.y*c.y;
            return t;
        }
        void eq(Complex c1, Complex c2)
        {
            boolean equal = true;
            boolean notequal = false;
            if(c1==c2)
            {
                System.out.println(equal);
            }
            else{
                 System.out.println(notequal);
            }

        }
    public static void main(String[] args)
    {
        Complex c1 = new Complex();
        Complex c2 = new Complex(2);
        Complex c3 = new Complex(2,3);
        Complex c4 = new Complex(c3);
        Complex c5 = new Complex(8,9);
        Complex c6 = new Complex(c4.add(c5));
        Complex c7 = new Complex(c4.sub(c5));
        c6.display();
        c7.display();
        c5.read();
        c5.display();
        c1.display();
        Complex c8 = new Complex(c4.mul(c5));
        c1.eq(c6,c7);
    } 
}
import java.util.Scanner;
class Rational
{
    int p,q;

    Rational()
    {
        p=0;
        q=1;
    }
    Rational(int r)
    {
      p=q=r;
    } 
    Rational(int r1,int r2)
    {
        p=r1;
        q=r2;
    }
    Rational(Rational r)
    {
        this.p=r.p;
        this.q=r.q;
    }
    void read()
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the value of p : ");
        p=input.nextInt();
        System.out.println("Enter the value of q : ");
        q=input.nextInt();
    }
    void display()
    {
        System.out.println("The value of p and q are "+ p + " , "+q);
    }
    int getnum()
    {
        return p;
    }
    int getdeno()
    {
        return q;
    }

    int lcm(int m)
    {
        int d=q;
        int div=m;
        int rem = 1;
        while(rem!=0)
        {
            rem = div % d;
            div = d;
            d=rem;
        }
        int l = ((this.q)* m )/ div;
        return l;
    }
    int hcf(int num)
    {
        int d=q;
        int div=num;
        int rem = 1;
        while(rem!=0)
        {
            rem = div % d;
            div = d;
            d=rem;
        }
        return div;
    }
     int hcf1(int num)
    {
        int d=p;
        int div=num;
        int rem = 1;
        while(rem!=0)
        {
            rem = div % d;
            div = d;
            d=rem;
        }
        return div;
    }
    Rational add(Rational l)
    {
        Rational a = new Rational();
        a.q=lcm(l.q);
        System.out.println("the value : "+ a.q);
        a.p = (this.p)*(a.q/this.q) + (l.p)*(a.q/l.q);
        System.out.println("the value : "+hcf(a.q) );

       /* int num = a.hcf(a.p);
        a.p /= num;
        a.q /= num;*/
        return a;
    }
    Rational sub(Rational l)
    {
        Rational a = new Rational();
        a.q=lcm(l.q);
        System.out.println("the value : "+ a.q);

        a.p = this.p*(a.q/this.q) - l.p*(a.q/l.q);
        System.out.println("the value : "+hcf(a.q) );

       /* int num = a.hcf(a.p);
        a.p /= num;
        a.q /= num;*/
        return a;
    }
    public static void main(String[] args)
    {
        Rational l1 = new Rational(1,5);
        Rational l2 = new Rational(2,7);
        Rational l3 = new Rational(l2.add(l1));
        Rational l4 = new Rational(l2.sub(l1));
        l3.display();
        l4.display();
        
        //System.out.println("The hcf : "+l2.hcf(l2.q));

        
    }
}
// Super class use
import java.util.*;

class A
{
    int x;
    A()
    {
        x=2;
    }
    void display()
    {
        System.out.println("Class A : "+x);
    }

}

class B extends A
{
    int y;
    
    B()
    {
        y=1;
    }
    void display()
    {
        super.display();      
        System.out.println("Class B : "+y);
    }

    public static void main (String[] args)
    {
        B sub = new B();
        sub.display();
    }
}

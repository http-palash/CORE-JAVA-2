import java.util.*;

class Super
{
    String s;
     Super()
    {
      System.out.println("This is super class Constructor");
    }
    Super(int x,int y)
    {
        x=2;
        y=3;
    }
}

public class sub extends Super
{
    sub()
    {
        System.out.println("This is sub class constructor");
    }
    sub(int x,int y,int z)
    {
        super(x, y);
        z=4;
    }
    void display()
    {
        System.out.println(+x+","+y+","+z);
    }

    public static void main (String[] args)
    {
        Sub s = new Sub();
        s.display();
    }
}
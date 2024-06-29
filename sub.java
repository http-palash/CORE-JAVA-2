import java.util.*;

class Super
{
    int x;
    int y;
    int z;
    String s;
     Super()
    {
      System.out.println("This is super class Constructor");
    }
    Super(int x,int y)
    {
        this.x=x;
        this.y=y;
        z=4;
    }
    void display()
    {
        System.out.println(+x+","+y+","+z);
    }

}

class sub extends Super
{
    int x;
    int y;
    int z;
    sub()
    {
        System.out.println("This is sub class constructor");
    }
    sub(int x,int y,int z)
    {
        super(x, y);
        z=0;
    }
    void display()
    {
        System.out.println(+x+","+y+","+z);
    }

    public static void main (String[] args)
    {
        sub s = new sub();

        Super s2 = new Super(1,1);
        sub s1 = new sub(2,3,3);
        s2.display();
        s1.display();
    }
}
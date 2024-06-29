import java.util.*;
class Super
{
    String colour = "Black";
}

class Dog2 extends Super{
    String colour = "White";

    void print()
    {
           System.out.println(super.colour);

    }
    class SSSuper
    {
        public static void main(String args[])
        {
            Super d= new Super());
            d.print();
        }
    }

 }
import java.util.Scanner;
 final class A
{
  int i;
  A()
  {
      i=100;
  }
}

class B  extends A 
{
  int j;
  B()
  {
       i=200;
      j=100;
  }

}

class finel
{
    public static void main(String[] args)
    {
        A a1=new A();
        B b1=new B();    
    }
}

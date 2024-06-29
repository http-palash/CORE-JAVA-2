import java.util.Scanner;
class A
{
  int i;
  Scanner input = new Scanner(System.in);
  
  A()
  {
      i=100;
  }
   void readi()
  {
    System.out.println("Enter i : ");
    i=input.nextInt();
  }

   int displaytemp()
  {
    //   System.out.println("The value of i is :"+i);
    return i;
  }
     void displayi()
  {
      System.out.println("The value of i is :"+i);
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
  B(int x)
  {
      i=j=x;
  }
  B(int x,int y)
  {
      i=x;
      j=y;
  }
  void readj()
  {
     System.out.println("Enter j : ");
     j=input.nextInt();
  }
  void  displayj()
  {
      System.out.println("The value of i is :"+i);
      System.out.println("The value of j is :"+j);
  }

  int temp=0;

  void displayt()
  {
        temp = displaytemp();
  System.out.println("Value of temp : "+temp);
  }
}

class Inherit
{
    public static void main(String[] args)
    {
        A a1=new A();
        B b1=new B();
        // a1.readi();
        a1.displayi();
         b1.readi();
        b1.displayj();  
        b1.displayt();      
    }
}

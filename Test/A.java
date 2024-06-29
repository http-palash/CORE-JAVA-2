package p;
public class A
{
     public void C()
    {
        System.out.println("I am Package");
    }
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        A a =new A();
        a.C();
    }
}
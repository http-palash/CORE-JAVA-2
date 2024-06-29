import java.util.*;
class Mylist
{
    int []a;
    Mylist()
    {
        a=new int[1]; 
    }
    Mylist(int i)
    {
        a=new int[i]; 
    }
    Mylist(Mylist m)
    {
        a=new int[m.a.length];
        for(int i=0;i<a.length;i++)
        {
            a[i]=m.a[i];
         } 
    }
    
    void read()
    {
      Scanner obj = new Scanner(System.in);
      System.out.println("The total length of array is :"+a.length);
      for(int i=0;i<a.length;i++)
      {
          System.out.println("The value of a["+i+"] is :");
          a[i]=obj.nextInt();
          }    
    }
    
    void display()
    {
        System.out.println("\nThe List is");
        for(int i=0;i<a.length;i++)
      {
          System.out.println("The value of a["+i+"] is :"+a[i]);
          }   
    }
    
    public static void main(String[] args)
    {
        Mylist a = new Mylist();

        Mylist b = new Mylist(5);
        
        Mylist c = new Mylist(b);
        
        b.read();
        b.display();
        
    }
}
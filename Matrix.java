import java.util.Scanner;

class Matrix{
    
     Scanner jin = new Scanner(System.in);
     int a[][];

     Matrix()
     {
       a=new int [2][2];
       for(int i=0;i<a.length;i++)
       for(int j=0;j<a[i].length;j++)
       a[i][j]=0;
     }
     Matrix(int i)
     { 
       this.a=new int [i][i];
      //  for(int i=0;i<a.length;i++)
      //  for(int j=0;j<a[i].length;j++)
      //  System.out.println("ENter matrix element : ");
      //  System.out.println("("+i"),("+j")");
      //  this.a[i][j]=jin.nextInt();
     }
     Matrix(int i,int j)
     {
         this.a=new int [i][j];
     }
     Matrix(Matrix m)
     {
        a=new int [m.a.length] [m.a[0].length];
         for(int i=0;i<m.a.length;i++)
         for(int j=0;i<m.a[i].length;j++)
         a[i][j]=m.a[i][j];
     }
     void display()
     {
      for(int i=0;i<a.length;i++)
      for(int j=0;j<a[i].length;j++)
      System.out.println(a[i][j]+"\t");
     }
     void read()
     {
      for(int i=0;i<a.length;i++)
      for(int j=0;j<a[i].length;j++)
      // System.out.println("Enter value of a["+i+"],["+j+"]");
      a[i][j]=jin.nextInt();
      }
      Matrix trans()
      {
        Matrix temp = new Matrix(this.a.length,this.a[0].length);
        for(int i=0;i<a.length;i++)
        for(int j=0;j<a[i].length;j++)
        t.a[i][j]=this.a[j][i];
        
        // return t
        this.a=t;
        return new Matrix(this);
      }

      boolean equal(Matrix m)
      {
        boolean flag = true;
        if(a.length == m.a.length && a[0].length == m[0].length)
        {
          for(int i=0;i<a.length;i++)
          {
            for(int j=0;j<a[i].length;j++)
            {
              if(a[i][j] != m.a[i][j])
              return false;
            }
          }
          return true;
        }
      }
}

class Demomatrix
{
    public static void main(String[] args)
    {
      Matrix m = new Matrix(3,3);
      m.read();
      m.display();
      Matrix m2 = m1.trans();
      m2.display();
      
    }
}
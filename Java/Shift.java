import java.util.*;
class Shift
{
    int mat[][],m,n;
    int mat2[][];
    Shift(int mm,int nn)
    {
        m=mm;
        n=nn;
        mat =new int[m][n];
        mat2 =new int[m][n];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter a no.");
                mat[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]);
                
            }
            System.out.println();
        }
        
    }
    void cyclic(Shift P)//explanation
    {
     int i,j;
     for(i=0;i<m;i++)
     {
         for(j=0;j<n;j++)
         {
             if(i!=0)
             mat2[i-1][j]=P.mat[i][j];
             else
             mat2[m-1][j]=P.mat[0][j];
         }
     }
    }
    void display()
    {
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Shift ob1=new Shift(3,3);
        Shift ob2=new Shift(3,3);
        ob1.input();
        //ob2.input();
        ob1.cyclic(ob1);
        ob1.display();
        //ob2.display();
        
    }
}
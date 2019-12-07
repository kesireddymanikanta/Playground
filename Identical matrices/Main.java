import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int r=s.nextInt();
    int c=s.nextInt();
    int a[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
a[i][j]=s.nextInt();
      }
    }
    int b[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
b[i][j]=s.nextInt();
      }
    }
    int flag=0;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(a[i][j]!=b[i][j])
        {
          flag=1;
          break;
        }
      }
    }
    if(flag==1)
    {
      System.out.println("No");
    }
    else
    {
      System.out.println("Yes");
    }
  }
}
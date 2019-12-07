import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
   int size=s.nextInt();
    int a[]=new int[size];
    for(int i=0;i<size;i++)
    {
      a[i]=s.nextInt();
    }
    int value=0;
    
    for(int i=1;i<size;i++)
    {
      boolean is_match=false;
      for(int j=0;j<size;j++)
      {
        if(i==a[j])
        {
          is_match=true;
       
        }
      }
      if(is_match==false)
      {
        value=i;
       
      }
    }
      System.out.println(value);
  }
        
      }
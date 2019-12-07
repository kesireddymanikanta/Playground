import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    System.out.println(mbs(a,n));
  }
  public static int mbs(int a[],int n)
  {
    int running_element=a[0];
    int max_sum=a[0];
    for(int i=1;i<n;i++)
    {
      if(a[i]>a[i-1])
      {
        running_element=running_element+a[i];
      }
      else
      {
        running_element=a[i];
      }
      if(running_element>max_sum)
      {
        max_sum=running_element;
      }
      
    }
    return max_sum;
  }
}
  
  
  
import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        a[i]=s.nextInt();
      }
      int value=s.nextInt();
      function(a,n,value);
    }
  public static void function(int a[],int n,int value)
  {
    for(int i=0;i<=n-1;i++)
    {
      for(int j=i+1;j<=n-1;j++)
      {
        int sum=a[i]+a[j];
        if(sum==value)
        {
     System.out.println(a[i] + "," + " " + a[j]);
        }
      }
    }
        
        
        
        
        
        
        
        
        
    }
}
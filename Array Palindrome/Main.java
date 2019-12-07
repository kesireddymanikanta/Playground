import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int a[]=new int[size];
      for(int i=0;i<size;i++)
      {
        a[i]=s.nextInt();
      }
      int left=0;
      int right=size-1;
      int count=0;
      for(int i=0;i<size-1;i++)
      {
        
        if(a[left]==a[right])
        {
        left++;
        right--;
          count=count+i;
      }
      else
      {
        
        count=0;
      }
      }
      if(count>0)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
        
    }
}
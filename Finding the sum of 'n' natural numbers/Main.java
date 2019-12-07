import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  int num=s.nextInt();
  int val=sum(num);
  System.out.println(val);
}
  public static int sum(int n)
  {
    if(n>0)
    {
return n+sum(n-1);
    }
    else
    {
      return 0;
    }
  }
}
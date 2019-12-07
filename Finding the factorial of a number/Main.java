import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  int num=s.nextInt();
  int val=fact(num);
  System.out.println(val);
}
  public static int fact(int n)
  {
    if(n>0)
    {
return n*fact(n-1);
    }
    else
    {
      return 1;
    }
  }
}
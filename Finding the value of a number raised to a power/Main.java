import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner s=new Scanner(System.in);
      int base=s.nextInt();
      int exponent=s.nextInt();
     int result=1;
      for(int i=1;i<=exponent;i++)
      {
        result=result*base;
      }
      System.out.println(result);
      
    }
}
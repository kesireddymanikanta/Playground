import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      method(n);
	} 
  public static void method(int n){
int result=n*n;
    System.out.println(result);
  }
  
}
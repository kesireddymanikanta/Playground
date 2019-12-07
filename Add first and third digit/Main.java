import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int f_d=n/100;
      int t_d=n%10;
      int result=f_d+t_d;
      System.out.println(result);
      
	}
}
import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      method(n1,n2,n3);
      
	}
  public static void method(int n1,int n2,int n3){
    int gcd=0;
    for(int i=1;i<=n3;i++){
      
      if((n1%i==0)&&(n2%i==0)&&(n3%i==0)){
        gcd=i;
      }
    }
    System.out.println(gcd);
  }
}
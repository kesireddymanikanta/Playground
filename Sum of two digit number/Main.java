import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int num = s.nextInt();
      int fd=num/10;
      int sd=num%10;
      int sum=fd+sd;
      System.out.println(sum);
	}
}
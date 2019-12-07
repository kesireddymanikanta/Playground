import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      method(n);
      
	}
  public static void method(int n){
    for(int i=2;i<=n;i++){
      int count=0;
      for(int j=1;j<=n;j++){
        if(i%j==0){
          count++;
        }
      }
      if(count<3){
        System.out.println(i);
      }
    }
}
}
import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
       int count=1;
      for(int i=1;i<=n;i++){
        for(int space=1;space<=n-i;space++){
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
         System.out.print(count+" ");
          count++;
        }
        System.out.println();
      }
      
    }    
}
import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner s=new Scanner(System.in);
     
     int count=0;
     int n=s.nextInt();
      for(int i=1;i<2*n;i++){
        if(i%2==1){
System.out.println(i);
          count++;
        }
        if(count==n){
          break;
        }
      }
    }
    
}
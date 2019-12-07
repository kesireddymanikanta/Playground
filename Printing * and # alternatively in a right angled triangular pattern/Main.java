import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner s = new Scanner(System.in);
  		// Type your code here
      int n=s.nextInt();
      int turn=0;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          if(turn==0){
            System.out.print("*");
            turn=1;
          }
          else{
System.out.print("#");
            turn=0;
          }
        }
        System.out.println();
      
    }
}
}
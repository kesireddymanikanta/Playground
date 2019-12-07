import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int base=s.nextInt();
    int exponent=s.nextInt();
    method(base,exponent);
  }
  public static void method(int base,int exponent){
int result=1;
    for(int i=1;i<=exponent;i++){
      result=result*base;
    }
    System.out.println(result);
  }
}
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
        a[i]=s.nextInt();
      }
      method(a);
    }
  public static void method(int a[]){
    int max=0;
for(int i=0;i<a.length;i++){
  if(max<a[i]){
    max=a[i];
  }
}
    System.out.println(max);
  }
}
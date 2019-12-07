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
      int se1=s.nextInt();
      int se2=s.nextInt();
      method(se1,se2,a);
    }
  public static void method(int se1,int se2,int a[]){
    int index1=-1;
    int index2=-1;
  for(int i=0;i<a.length;i++){
    if(a[i]==se1){
      index1=i;
    }
    if(a[i]==se2){
      index2=i;
    }
  
  
  }
    System.out.println(index1);
    System.out.println(index2);
}
}
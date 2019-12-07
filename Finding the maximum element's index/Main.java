import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    int max=0;
    int index=0;
    for(int i=0;i<n;i++){
      a[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
      if(max<a[i]){
        index=i;
        max=a[i];
      }
    }
    System.out.println(index);
  }
}
import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner s=new Scanner(System.in);
    String str1=s.nextLine();
    String str2=s.nextLine();
    int str1_l=str1.length();
    int str2_l=str2.length();
    int count=0;
    for(int i=0;i<(str1_l-str2_l+1);i++)
    {
      boolean ismatching=true;
      for(int j=0;j<str2_l;j++)
      {
        if(str1.charAt(i+j)!=str2.charAt(j))
           {
             ismatching=false;
           }
      }
           if(ismatching==true)
           {
             count++;
           }
           }
           System.out.println(count);
           }
           }
           
             
             
             

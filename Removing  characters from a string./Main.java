import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
  String str1 = s.nextLine();
  String str2 =s.nextLine();
  
  

  char[] mask = new char[256];
  for (int i = 0; i < str2.length(); i++)
  {
   mask[str2.charAt(i)]++;
  }
  for (int i = 0; i < str1.length(); i++) {
   if (mask[str1.charAt(i)] == 0)
    System.out.print(str1.charAt(i));
  }
 }
}
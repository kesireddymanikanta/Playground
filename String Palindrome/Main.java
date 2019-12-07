import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      int s1_len=s1.length();
      boolean ispalindrome=true;
      int front=0;
      int end=s1_len-1;
      while(front<end)
      {
        if(s1.charAt(front)!=s1.charAt(end))
        {
          ispalindrome=false;
          break;
        }
        front++;
        end--;
      }
      if(ispalindrome==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
          
          
          
          
          
          
          
          
          
          
          
          
          
      
    } 
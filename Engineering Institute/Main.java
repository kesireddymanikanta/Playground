//import required packages
import java.util.Scanner;

class Faculty
{
  public void salary(int basesalary)
    
  {
System.out.println("Base Salary: "+(basesalary));
  }
}
class CSE extends Faculty
{
  public void salary(int basesalary)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: " +(basesalary+3000));
    
  }
}
class IT extends CSE
{
  public void salary(int basesalary)
  
  
  {
    //write your IT class statements
    System.out.println("IT Faculty: " +(basesalary+5000));
  }
}
class ECE extends IT
{
  public void salary(int basesalary)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: " +(basesalary+4500));
    
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
  int basesalary=s.nextInt();
    if(basesalary>0)
    {
      Faculty f=new Faculty();
      CSE cs=new CSE();
      ECE e=new ECE();
      IT i=new IT();
       f.salary(basesalary);
      cs.salary(basesalary);
      i.salary(basesalary);
     
      e.salary(basesalary);
      
  }
}
}
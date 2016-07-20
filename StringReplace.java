

import java.util.Scanner;
class StringReplace
{

  public static void main(String args[])
{
   String name1;
  String s1="Hello Username , How are you?";
 System.out.println(s1);
 Scanner s=new Scanner(System.in);
  name1=s.next();
 System.out.println("Enter your name :");
 
  System.out.println(s1.replaceAll("Username",name1));

}
}



import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
{


System.out.println("Enter the four digit year:");
Scanner s=new Scanner(System.in);
int year=s.nextInt();
System.out.println(year);
if(year%4==0)
{

System.out.println("year is leap year");
}
else

System.out.println("year is not leap year");
}


}



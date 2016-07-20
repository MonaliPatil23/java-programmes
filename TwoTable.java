import java.lang.Math.*;
class TwoTable
{
   public static void main(String args[])
    {
     System.out.println("Total number of arguments:" + args[0]);
    int N=Integer.parseInt(args[0]);
   if(N>31)
   {
 
     System.out.println("Enter value below 31 Beacause 2^31 overflows integer value");
   }

  else
   {
   for(int i=0;i<=N;i++)
     {

       System.out.format("The power of 2^ " + "%d"+"\t" + "is" +"\t", i );
       System.out.println(Math.pow(2,i)); 


     }

 
   }
   }

 } 
 

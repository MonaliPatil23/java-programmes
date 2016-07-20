
  
import java.lang.Math.*;
class Anagram
  { 
    public static void main(String args[])
     {

       int i,j;
     
       char[] str1={'a','b','c','d'};
       char[] str2={'d','c','b','a'};
      

      for(i=0;i<str1.length;i++)   
      { 

       for(j=0;j<str2.length;j++)
        {
          if(str1[i]==str2[i])
          {
               System.out.format( " %d character is match" +"\t", (i+1));
          }
         
        }
   
     }
 System.out.println("String is anagram");
   }
}


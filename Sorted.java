import java.util.Arrays;
import java.lang.Object;
class Sorted

{
public static void main(String args[])
{
String[] arr = new String[4];
arr[0]="monali";
arr[1]="pooja";
arr[2]="sheetal";
arr[3]="garima";
//arr[4]="komal";

//System.out.println("The size of array is: " + size);
for (int i = 0; i <4; i++) 
{

	            System.out.println("Index[" + i + "] = " + arr[i]);

	        }
	 
System.out.println("\n\n\n");
Arrays.sort(arr);
for (int i = 0; i <4; i++) 
{

	            System.out.println("Index[" + i + "] = " + arr[i]);

	        }
	int mid=(arr[0]+arr[1])/2;
System.out.println("\n Enter the name that you want to search");
String search="sheetal";

//while(search==mid){
//System.out.println("Name is found");
//}
//else
//{
//if(sea)
//}
 //}

 int retval=arr.indexOf("pooja");
if(retval==mid)
{System.out.println("Name is found");
}
else if(retval>mid)
{
flag(1);
}
else
{
flag(0);
}
}
}

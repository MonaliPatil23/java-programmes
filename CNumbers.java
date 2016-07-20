import java.util.*;
import java.io.*;

class CNumbers
{

public static void main(String args[]) throws IOException

{

		randomNumber();
	}
	
public static void randomNumber() throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number for N Distinct Coupon Numbers");
		int n = Integer.parseInt(br.readLine());
		
		Random r = new Random();
		int ran = 0;
		
		for(int i = 1;i <= n;++i)
		{
			ran = r.nextInt(50);
			System.out.println("coupans are: "+ran);
		}
	}
}

package metdod;
import java.util.Arrays;
import java.util.Scanner;
public class P4 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the frist String");
		String s=sc.next();
		System.out.println("Enter the second String");
		String s1=sc.next();
		boolean flag=false;
		if(s.length()!=s.length())
		{
			flag=false;
			
			
		}
		char [] c1=s.toCharArray();
		Arrays.sort(c1);
		char [] c2=s1.toCharArray();
		Arrays.sort(c2);
		
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]==c2[i])
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("Given Strings is anangram");
		}
		else
		{
			System.out.println("not a anagrame");
		}
	}

}

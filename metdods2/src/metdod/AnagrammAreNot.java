package metdod;
import java.util.Arrays;
import java.util.Scanner;
public class AnagrammAreNot 
{
	public static boolean 	isAnagrame(String s, String s1)
	{
		boolean flag=true;
		if(s.length()!=s1.length())
		{
			return false;
		}
		
			char [] c1=s.toCharArray();
			char [] c2=s1.toCharArray();
			Arrays.sort(c1);
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
			
		
				
		return flag;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the frist word");
		String s=sc.next();
		System.out.println("Enter the second word");
		String s1=sc.next();
		
		System.out.println(isAnagrame(s,s1));

	}

}

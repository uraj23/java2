package metdod;
import java.util.Scanner;
public class P10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentece");
		String s=sc.nextLine();
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((i==0 && s.charAt(i)!=' ')||(s.charAt(i)!=' ' && s.charAt(i-1)==' '))
			{
				count++;
				//(s.charAt(i)).toUpperCase();
			}
		}
		System.out.println(count);
		
		
//		char [] ch=s.toCharArray();
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			if(i==0 && ch[i]!=' ')
//			{
//				System.out.print(ch[i].toUpperCase());
//			}
//				
//					
//				
//		}
	}
}



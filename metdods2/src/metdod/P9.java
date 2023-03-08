package metdod;
import java.util.Scanner;
public class P9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		String [] s1=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			char [] c1=s1[i].toCharArray();
			int count=0;
			for(int j=0;j<c1.length;j++)
			{
				count++;
			}
			System.out.println(s1[i]+" present in elements "+count);
		}
	}

}

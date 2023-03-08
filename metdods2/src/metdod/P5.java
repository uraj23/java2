package metdod;
import java.util.Scanner;
public class P5 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		char [] c1=s.toCharArray();
		
		int count1=0;
		
		for(int i=0;i<c1.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c1.length;j++)
			{
				if(c1[i]==c1[j] && c1[j]!='#')
				{
					count++;
					c1[j]='#';
				}
				
			}
			
			if(count>count1)
			{
				count1=count;
			}
			
			
		}
		System.out.println(count1);
		
	}

}

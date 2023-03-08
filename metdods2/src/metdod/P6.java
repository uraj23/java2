package metdod;
import java.util.Scanner;
public class P6 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		
		char [] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[j]!='@')
				{
					count++;
					ch[j]='@';
				}
			}
			if(count>1 && ch[i]!='@')
			{
				System.out.println(ch[i]+" ");

			}
		}
	}

}

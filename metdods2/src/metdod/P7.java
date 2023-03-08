package metdod;
import java.util.Scanner;
public class P7 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		String [] s1=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			int count=1;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]) && !(s1[j].equals("?")))
				{
					count++;
					s1[j]="?";
				}
			}
			if(count>1 && s1[i]!="?")
			{
				System.out.println(s1[i]+" "+count);
			}
		}
		
	}

}

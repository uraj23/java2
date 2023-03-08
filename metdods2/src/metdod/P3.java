package metdod;
import java.util.Scanner;
public class P3
{
	public static void main(String[] args) 
	{
	
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the mail");
		String s=sc.next();
		boolean flag=false;
		
		
		if(!(s.startsWith(".")) && !(s.isEmpty()))
		{
			
			if(s.contains("@"))
			{
				String [] s1=s.split("@");
				String str="@gmail.com";
				
				if(!(str.equals(s)))
				{
					for(int i=0;i<s1.length;i++)
					{
						if(s1[i].contains("gmail.com"))
						{
							//System.out.println("valied mail");
							flag=true;
							break;
						}
					}
				}
		
			}

		}
				
		if(flag==true)
		{
			System.out.println("valied mail");
		}
		else
		{
			System.out.println("Enter valied mail");
		}
	}

}

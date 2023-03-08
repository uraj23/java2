package metdod;

public class P1 
{
	public static void main(String[] args) {
		
		String s="Hello good morning everyone";
		String [] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println(s1.toString());
		
		
		String s2[]=s.split(" ",2 );
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
	}

}

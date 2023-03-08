package metdod;

public class Programme
{
	public static void main(String[] args) {
		String s="06-03-2023";
		String [] s1=s.split("-");
		System.out.println("This is String "+s);
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
	}

}

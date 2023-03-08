package metdod;
import java.util.Scanner;
public class P8 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		String [] s1=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]+" ");
		}
	}

}

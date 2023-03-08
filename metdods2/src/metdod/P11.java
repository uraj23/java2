package metdod;
import java.util.Scanner;
public class P11 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2="";
        
		
		String [] s1=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			char[] ch=s1[i].toCharArray();
			
			if(ch[0]>='a' && ch[0]<='z')
			{
				ch[0]=(char)(ch[0]-32);
			}
			
			
			 s2=new String(ch);
        System.out.print(s2+" ");
			//System.out.println(s1[ch[i]]);
	   }
	 
	
}
	}



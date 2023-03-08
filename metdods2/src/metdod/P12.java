package metdod;

public class P12 
{
	private int i=10;
    private String s="java";
    private static void display()
    {
    	System.out.println("Hello display");
    }

	public static void main(String[] args) 
	{
		P12 ref=new P12();
       System.out.println(ref.i);	
       System.out.println(ref.s);
       display();
		
	}
}

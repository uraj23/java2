package metdod;

public class CountWords {

	public static void main(String[] args) 
	{

     String s="welcome to java programing ";
     int count=1;
     for(int i=0;i<s.length();i++)
     {
    	 if((i==0 &&s.charAt(i)!=' ')||( s.charAt(i)!=' '&& s.charAt(i-1)==' '))
    	 {
    		count++; 
    	 }
     }
     System.out.println(count);
     
     
     

	}

}

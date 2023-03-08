package metdod;

public class CountWords {

	public static void main(String[] args) 
	{

     String s="welcome to java programing ";
     int count=1;
     for(int i=0;i<s.length();i++)
     {
    	 if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
    	 {
    		count++; 
    	 }
     }
     System.out.println(count);
     
     
     String [] s1=s.split(" ");
     int count1=1;
     for(int i=0;i<s1.length;i++)
     {
    	
    	 
    		 count1++;
    	 
     }
     System.out.println(count1);

	}

}

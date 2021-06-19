//file name should be as fact_Class.java
package Class;
import java.util.*;
public class fact_Class {
    private int fact=1;
    private int n=0;
    private int i=1;
    
   
    
    public void get()
    {
    	 Scanner in=new Scanner(System.in);
    	System.out.printf("\nEnter N numbers:");
    	n=in.nextInt();
    	
    	for(i=1;i<=n;i++)
    	{
    		fact*=i;
    	}
    	
    	System.out.printf("\nFactorial = %d", fact);
    	System.out.flush();  
    	in=null;
    	
    }
    
 
	
	
	
}

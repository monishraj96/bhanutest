package org.test;

public class prime {

	public static void main(String[] args) {
		
		        boolean flag = false;
		       // int prime=0;
		        for(int k=1;k<=50;k++)
		        {
		        	int num = 29;
		           
		            for(int i = 2; i <= k/2; ++i)
		            {
		                // condition for nonprime number
		                if(k % i == 0)
		                {
		                    flag = true;
		                    break;
		                }
		            }

		            if (!flag)
		                System.out.println(k + " is a prime number.");
		           // else
		               // System.out.println(num + " is not a prime number.");
		        }

	
		           
		        
		       
		    }
		
		
	

}

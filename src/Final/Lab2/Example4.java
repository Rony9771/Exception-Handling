package Final.Lab2;

public class Example4 {
		   public static void main(String args[]){
			   
		    try{
		    	
		       int a = 0;
		       int b =20;
		       int fraction = b/a;
		    }
		    
		  catch(ArithmeticException e){
			  
		    System.out.println("In the catch block due to Exception = "+e);
		  }
		    
		  finally{
			  
			System.out.println("Inside the finally block");
		  }
		}
		}



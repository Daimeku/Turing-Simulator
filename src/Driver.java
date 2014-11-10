import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Driver {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String string;
		boolean conf1 = false, conf2 = false, conf3 = false;
		boolean run = true;
		
		while(run){
			System.out.println("=======================================================================");
			System.out.println("Enter the string to test: ");
			string = input.next();
			
			System.out.println("=============================================");
			conf1 = anagram(string);
			System.out.println("=============================================");
			conf2 = new palindrome().drome(string);
						
			System.out.println("Anagram: "+conf1);
			System.out.println("Palindrome: "+conf2);
			
			System.out.println("\n\nRun again? true/false:  ");
			
			run = input.nextBoolean();
			
		}
		
	
		
		
	}
	
	
	
	
	
	  public static boolean anagram(String input_string) 
	    {
		  
		  if( input_string.length() < 7){
			  return false;
			  }
		  
		  
	    	boolean conf = false;
	    	
	         ArrayList<String> input = new ArrayList<String>();//user input
	         ArrayList<String> gvstring = new ArrayList<String>();//the known string raccare
	        Scanner il= new Scanner(System.in);
	        for(int i=0;i<7;i++)
	            {
	        		
	              //  System.out.println("Enter a string of lenght(7) & of the alphabet(a,c,e,r)the string");
	        	
	                 input.add( Character.toString( input_string.charAt(i) ) );//takes in the user input by character until string is complete
	                 if(input.size()==7)
	                    {
	                         System.out.println("Have reached the end of the string, Marking with #");
	                         input.ensureCapacity(i);//allows the array size to be altered to allow for the # to be entered

	                         input.add("#");
	                     }
	            }
	        System.out.println("Your input was:\n");
	        System.out.println(input);//Shows the input entered
	       
	        gvstring.add("r");//These add the given string to the array gvstring
	        gvstring.add("a");
	        gvstring.add("c");
	        gvstring.add("c");
	        gvstring.add("a");
	        gvstring.add("r");
	        gvstring.add("e");
	        
	        System.out.println("Now we will compare your  input string with the computer string to check if its an anagram");
	        System.out.println("Your input was:");
	        System.out.println(input);
	        System.out.println("The computer string is:");
	        System.out.println(gvstring);
	        System.out.println("Now Simulating the Turing Machine:\n");
	        
	        for(int i=0;i<input.size()-1;i++)//Loop controlling input array
	        {
	            for( int z=0;z<gvstring.size();z++)//loop controlling gvstring array
	            {
	                if(input.get(i).equalsIgnoreCase(gvstring.get(z)))//if input is equal to given string
	                {
	                    input.set(i, "X");//marks an X for the match on the user input
	                    gvstring.set(z, "X");//marks an X for the match on the gvstring side
	                }
	             
	            } System.out.println(input+""+gvstring);//returns both input and gvstring
	        }
	         if(input.containsAll(gvstring))//if input and gvstring equals all X's
	                 {
	        	 		conf = true;
	                    System.out.println("Anagram");
	                    System.out.println("String Accepted!!\n\n");
	                 }
	                else
	         {
	             System.out.println("Im sorry this isnt an Anagram");
	         
	           System.out.println("String Rejected!!");
	         }
	         
	         return conf;
	    }
	  
	  
}

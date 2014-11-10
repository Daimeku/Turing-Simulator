import java.util.*;
import java.io.*;

 
class palindrome
{
//   public static void main(String args[])
//   {
//     boolean pal = new palindrome().drome();
//     System.out.println(pal);
//   }
   
   public boolean drome(String input_string){
    
	   System.out.println("Testing for palindrome");
      boolean success=true;
      String org, reverse="", test ="";
      String original;
    //  Scanner in = new Scanner(System.in);

      
   //   System.out.println("Enter a string to check if it is a palindrome");
      
      
      org= input_string;
      original = org;
       int length = org.length();
       boolean value= checkInput(org,length);
             
           
     if (value==true){
//     System.out.print("Original: ");
//                   
//                      for ( int i = 0 ; i <=length-1 ; i++ )
//                         {
//                            System.out.print(test = test + org.charAt(i));
//                            System.out.print("\t");
//                           
//                             if(i==length-1)
//                         {
//                             System.out.print("#");
//                             System.out.print("\t") ;  
//                         }
//                         }
                     //  System.out.print("\t");
                         //c   System.out.print("Mark off: ");
    	 System.out.println("operations\n");
                     for ( int i = 0 ; i <=length-1 ; i++ )
                     {
                       
                         char n=original.charAt(i) ;
                         switch(n)
                         {
                         case 'a':
                         org = org.substring(0, i)+'@'+org.substring(i+1);
                         break;
                         case 'r':
                             org = org.substring(0, i)+'*'+org.substring(i+1);
                             break;
                         case 'c':
                             org = org.substring(0, i)+'%'+org.substring(i+1);
                             break;
                             case'e':
                                 org = org.substring(0, i)+'$'+org.substring(i+1);
                                 break;
                            
                         }   
                         
                         System.out.print(org+"\t");
                         if(i==length-1)
                         {
                                                       
                             System.out.print("#\n");
                             
                         }
                     }
                     int x ;
                     
//                     
                      // System.out.print("\t");
//                            System.out.print("Testing: ");
                      for ( x =length-1 ; x >= 0 ; x-- )
                     {
                          reverse = reverse + original.charAt(x);
                         char s=org.charAt(x) ;
                         switch(s)
                         {
                         case '@':
                         org = org.substring(0, x)+'a'+org.substring(x+1);
                         break;
                         case '*':
                             org = org.substring(0, x)+'r'+org.substring(x+1);
                             break;
                         case '%':
                             org = org.substring(0, x)+'c'+org.substring(x+1);
                             break;
                             case'$':
                                 org = org.substring(0, x)+'e'+org.substring(x+1);
                                 break;
          //                           case'\0':
//                                     org = org.substring(0, i)+'_'+org.substring(i+1);
//                                     break;
                         }
                             
                         
                         System.out.print(org+"\t");
                     }

  System.out.print("\n");
      if (original.equalsIgnoreCase(reverse))
      {System.out.println("\nEntered string is a palindrome.");
      success=true;
      }
      else{
         System.out.println("\nEntered string is not a palindrome.");
     success=false;
      }
     
      }
      else{ System.out.print("\n");
          System.out.println("String rejected");
          success=false;
      }
      return success;
   }
   
   
   
   
   boolean checkInput(String org, int length){				// checking input string
	   
	   System.out.println("Input check");
       boolean success = true;
       String test ="";
    for ( int i = 0 ; i <=length - 1 ; i++ )
    {
        if((org.charAt(i)=='a'||org.charAt(i)=='r'||org.charAt(i)=='c'||org.charAt(i)=='e')==true)
        {
          System.out.print(test = test + org.charAt(i));                              System.out.print("\t");
          if(i==length-1)
                         {
                                                       
                             System.out.print("#\n\n");
                         }
          success=true;
        }
        else
        {
            System.out.print(test = test + org.charAt(i));                            System.out.print("\t");

            success= false; 
            break;
        }
        
    }
    
    return success;
   }
}	
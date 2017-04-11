import java.util.*;

//a simple Timer that can periodically print a timeout message.
public class Timer {

   public static void main(String args[]) {
      try {
         while(true){
	        int i=0;
	        while(i<=10){
	    	  // thread.sleep(100) gives the gap of one second interval
	          Thread.sleep(1000);
	          i++;
	          System.out.println(i);
	        }
        	System.out.println("Time Out");
         
         }
        
      }catch (Exception e) {
         System.out.println("Got an exception!");
      }
   }
}

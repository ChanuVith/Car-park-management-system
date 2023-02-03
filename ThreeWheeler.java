
import java.util.Date;
import java.util.Scanner;


public class ThreeWheeler extends Vehicle {
 
  
    public static String[][] S = new String[30][30];
    
    public ThreeWheeler(){    //has created for an instance of, adding a ThreeWheeler  to the park
      
        i=i+1;
    Scanner cc=new Scanner(System.in);
    System.out.println("Vehicle Number");
    S[i][0]=cc.next();
    System.out.println("Vechicle Brand");
    S[i][1]=cc.next();
    System.out.println("Please select one from below"); 
    System.out.println("Taxi         :Press 1"); 
    System.out.println("Not For Hire :press 2");
    	
    S[i][2]=cc.next();
   
    System.out.println("Vehicle is added Succesfully...!!!");
    System.out.println("TOKEN number is : "+i);
    Date now= new Date();
    System.out.println(now);
   
    }
    
    public ThreeWheeler(int n){  //has created for an instance where, a ThreeWheeler leave from the park
        
     this.i=n;
    
    System.out.println("Vehicle Number :"+S[i][0]);
    System.out.println("Vehicle Brand  :"+S[i][1]);
   
    
    S[i][0]=" ";
    S[i][1]=" ";
   
    
    System.out.println("Vehicle is removed Succesfully...!!!");
    Date now= new Date();
    System.out.println(now);
    }
      
}

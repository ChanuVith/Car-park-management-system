
import java.util.Date;
import java.util.Scanner;

public class Van extends Vehicle {
    
    private double seats;
   
   
    public static String[][] S = new String[30][30];

    
     public Van(){   //has created for an instance of, adding a Van  to the park
         
    i=i+1;   
    Scanner cc=new Scanner(System.in);
    System.out.println("Vehicle Number");
    S[i][0]=cc.next();
    System.out.println("Vechicle Brand");
    S[i][1]=cc.next();
    System.out.println("Number of seats"); 
    S[i][2]=cc.next();
  
    System.out.println("vehicle is added Succesfully...!!!");
    System.out.println("TOKEN number is : "+i);
    Date now= new Date();
    System.out.println(now);
    
    }
     
    public Van(int n){    //has created for an instance where, a Van leave from the park
      
        this.i=n;
        
    System.out.println("Vehicle Number :"+S[i][0]);
    System.out.println("Vehicle Brand  :"+S[i][1]);
    System.out.println("Number of Seats:"+S[i][2]);
   
   
    S[i][0]=" ";
    S[i][1]=" ";
    S[i][2]=" ";
   
    
    System.out.println("Vehicle is removed Succesfully...!!!"); 
    Date now= new Date();
    System.out.println(now);
    } 
       

    public double getNumOfSeats(){
    
    return seats;
    }
    
}

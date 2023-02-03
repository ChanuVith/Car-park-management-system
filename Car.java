
import java.util.Date;
import java.util.Scanner;

public class Car extends Vehicle {
    
    private String clr;
    private double doors;
    
    public static String[][] S = new String[30][30];
    
     
    public Car(){     //has created for an instance of, adding a car to the park
        
    i=i+1;  
    Scanner cc=new Scanner(System.in);
    System.out.println("Vehicle Number");
    S[i][0]=cc.next();
    System.out.println("Vechicle Brand");
    S[i][1]=cc.next();
    System.out.println("vehicle Color");
    S[i][2]=cc.next();
    System.out.println("Number of doors");
    S[i][3]=cc.next();
  
    System.out.println("Vehicle is added Succesfully...!!!");
    System.out.println("TOKEN number is : "+i);
    Date now= new Date();
    System.out.println(now);

    }   
    
    public Car(int n){  //has created for an instance where, a car leave from the park
        
        this.i=n;
    
    System.out.println("Vehicle Number :"+S[i][0]);
    System.out.println("Vehicle Brand  :"+S[i][1]);
    System.out.println("Vehicle Colour :"+S[i][2]);
    System.out.println("Number of Doors:"+S[i][3]);
   
    
    S[i][0]=" ";
    S[i][1]=" ";
    S[i][2]=" ";
    S[i][3]=" ";
   
    
    System.out.println("Vehicle is removed Succesfully...!!!");
    Date now= new Date();
    System.out.println(now);
    }
      

    
    public double getNumOfDoors(){
    
    return doors;
    }
    
    public String getColor(){
    
    return clr;
    }
    
}

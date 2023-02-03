
import java.util.Scanner;

public class SLIITCarParkManager implements CarParkManager {

        static int use=0;
      public static  SLIITCarParkManager park = new SLIITCarParkManager();
        
    public static void main(String[] args) {
    	  
           park.Display();
           
    }
       
       public void Display(){
        
        System.out.println("SLIIT CAR PARK");
        System.out.println("(ONLY CARS,VANS,THREEWHEELERS ARE ALLOWED TO ENTER)");
        System.out.println("******************************************************");
        
        Scanner cc=new Scanner(System.in);
        System.out.println("Check availability, Press 1"); //Checking the Availability
        
        int chk=cc.nextInt();
        
        if(chk==1){
        
        SLIITCarParkManager SL1=new SLIITCarParkManager();
        System.out.println("Empty slots    :"+SL1.getNumEmptySlots());
        System.out.println("Occupied Slots :"+SL1.getNumOccupiedSlots());
       
        
        if(SL1.getNumOccupiedSlots()==totalVehicleSlots){ //The instance where, Parking is full
            
        System.out.println("");
        System.out.println("Sorry ! Parking is Full...!!!");
        System.out.println("");
        System.out.println("Press 2 to remove a vehicle from a slot");
        
        int prs=cc.nextInt();
        
        if(prs==2){
            
        System.out.println("\nEnter the Vehicle Type");
        System.out.println("ThreeWheeler : Press 1");
        System.out.println("Car          : Press 2");
        System.out.println("Van          : Press 3");
 
        int type=cc.nextInt();
        
        if (type==1){  
            
        System.out.println("Enter the TOKEN number");
        int num=cc.nextInt();
        ThreeWheeler tw=new ThreeWheeler(num);
        use--;
        System.out.println("");
        park.Display();
        
              }
        
        if (type==2){   
        System.out.println("Enter the TOKEN number");
        int num=cc.nextInt();
        Car C=new Car(num);
        use--;
        System.out.println("");
        park.Display();
      
              }
        if (type==3){   
        System.out.println("Enter the TOKEN number");
        int num=cc.nextInt();
        Van v=new Van(num);
        use--;
        System.out.println("");
        park.Display();
      
            
                   }
               
                 } 
           
              }
           
        else{
            
        
        System.out.println("");
        System.out.println("Press 1 to add a vehicle to a slot");
        System.out.println("Press 2 to remove a vehicle from a slot");    
        
        int prs=cc.nextInt();
        
        if(prs==1){
        
       
        System.out.println("\nEnter the Vehicle Type");
        System.out.println("ThreeWheeler: Press 1");
        System.out.println("Car         : Press 2");
        System.out.println("Van         : Press 3");
 
        int type=cc.nextInt();
        
        if (type==1){  
        	  ThreeWheeler tw=new ThreeWheeler();
              use++;
              System.out.println("");
              park.Display();
           
            
              }
        if (type==2){  
        	 Car c=new Car();
             use++;
             System.out.println("");
             park.Display();
           
              }
        if (type==3){   
        	 Van v=new Van();
             use++;
             System.out.println("");
             park.Display();
              }
        
        }
        
        
        else if(prs==2){
            
        System.out.println("\nEnter the Vehicle Type");
        System.out.println("ThreeWheeler:Press 1");
        System.out.println("Car         :Press 2");
        System.out.println("Van         :Press 3");
 
        int type=cc.nextInt();
        
        if (type==1){  
            
        System.out.println("Enter the TOKEN number");
        int num=cc.nextInt();
        ThreeWheeler tw=new ThreeWheeler(num);
        use--;
        System.out.println("");
        park.Display();
        
              }
        
        if (type==2){   
        System.out.println("Enter the TOKEN number");
        int num=cc.nextInt();
        Car C=new Car(num);
        use--;
        System.out.println("");
        park.Display();
       
              }
        if (type==3){   
        System.out.println("Enter the TOKEN number");
        int num=cc.nextInt();
        Van v=new Van(num);
        use--;
        System.out.println("");
        park.Display();
        
            
         }
               
         }
        
         }
        
         }
        
         }
    
    
    
    public int getNumOccupiedSlots(){
    
    
    return this.use;
    }
    

    public int getNumEmptySlots(){
    
        
    return totalVehicleSlots-use;
    }
    
      
    public int vehicleLeft(){
    
    return 0;
    }
             
    public boolean vehicleEntered(){
    
    return true;
    }         
                
}

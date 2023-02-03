
public interface CarParkManager {
 
    
    final int totalVehicleSlots =20;   //Total number of Vehicle Slots in the park
    boolean vehicleEntered();
    int vehicleLeft();
    int getNumEmptySlots();
    int getNumOccupiedSlots();
    
    
}

import java.util.List;
import java.util.ArrayList;
public class Building {
    int noElevators;
    int noFloors;
    int avgPersonWeight;
    int maxElevatorLoad;
    List <Elevator> elevators = new ArrayList<>();
    
    
    public Building() {
        
    }

    public Building(int noElevators, int noFloors, int avgPersonWeight, int maxElevatorLoad) {
        this.noElevators = noElevators;
        this.noFloors = noFloors;
        this.avgPersonWeight = avgPersonWeight;
        this.maxElevatorLoad = maxElevatorLoad;

    }

    public void createNewElevator() {
        System.out.println("LIST OF ELEVATORS");
        for (int i = 0; i < this.noElevators; i++) {
            Elevator elevator = new Elevator();
            elevator.setId(i+1);
            elevator.setCurrentLoad(maxElevatorLoad);
            elevator.setTotalCapacity(maxElevatorLoad);
            elevator.setIdle(true);
            elevator.setIsGoingUp(false);
            elevator.setNoFloors(noFloors);
            elevators.add(elevator);
            System.out.println();
            System.out.format("ELEVATOR %s\n", elevator.id);
            System.out.format("TOT CAPACITY: %d\n", elevator.capacity);
            System.out.format("IS IDLE: %b\n", elevator.idle);
            System.out.format("CURR FLOOR: %d\n", elevator.currentFloor);
            System.out.println();
        }
    }
    

    // boolean goingUp;
    // boolean idle;
    // public int currentFloor;
    // public List<Integer> nextFloor;
}
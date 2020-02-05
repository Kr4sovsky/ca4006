import java.util.List;


public class ElevatorController {
    List<Elevator> elevators;


    int callFloor;
    int callDirection;

    // 
    // Able to look at each elevator and compare attributes across all 
    // to decide on which Elevator to assign each task to an Elevator
    //  
    // Attributes are currentFloor, nextFloor, lastFloor, currLoad 
    // 


    // if goingUp is false then lift direction is down
    // boolean goingUp;
    // boolean idle;
    // public int currentFloor;
    // public List<Integer> nextFloor;


    public void assignElevator() {
        List <Elevator> elevators = this.elevators;
        Elevator closestElevator = null;
        for (Elevator elevator : elevators) {
            if (closestElevator == null) {
                closestElevator = elevator;
                continue;
            }
            // travelling in the same direction
            // weight
            // which elevator is closest
            if (elevator.getNextFloor() < closestElevator.currentFloor) {

            }
            
        }

        }

}

// elevator_1 = [curr, next, last, load ]
// elevator_2 = [curr, next, last, load ]
// elevator_3 = [curr, next, last, load ]
import java.util.List;
import Elevator.java

public class ElevatorController {
    int elevatorID;



    int callFloor;
    int callDirection;

    // 
    // Able to look at each elevator and compare attributes across all 
    // to decide on which Elevator to assign each task to an Elevator
    //  
    // Attributes are currentFloor, nextFloor, lastFloor, currLoad 
    // 


    // if goingUp is false then lift direction is down
    boolean goingUp;
    boolean idle;
    public int currentFloor;
    public List<Integer> nextFloor;



elevator_1 = [curr, next, last, load ]
elevator_2 = [curr, next, last, load ]
elevator_3 = [curr, next, last, load ]
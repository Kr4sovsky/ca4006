import java.util.List;
import java.util.ArrayList;
public class Elevator {

    int id;
    int capacity;
    int currentLoad;
    // if isGoingUp is false then lift direction is down
    boolean isGoingUp;
    boolean idle;
    public int currentFloor;
    // nextFloor will contain a list of stops to be made next
    public List <Integer> nextFloors = new ArrayList<>();

    


    // SETTERS
    public void setTotalCapacity(int capacity) {
        // Initially set by user
        this.capacity = capacity;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setIdle(boolean idle) {
        // Initially True
        this.idle = idle;
        this.nextFloors.add(0);
    }

    public void setIsGoingUp(boolean isGoingUp) {
        // Initially null
        if (!isIdle()) {
            this.isGoingUp = isGoingUp;
        }
    }

    public void setCurrentLoad(int load) {
        // Initially null
        this.currentLoad = load;
    }

    // GETTERS

    public int getFloor() {
        // Returns Floor Number
        return this.currentFloor;
    }

    public boolean getDirection() {
        // Return Elevator Direction
        return this.isGoingUp;
    }

    public int getTotalCapacity() {
        // Returns set capacity
        return this.capacity;
    }

    public int getCurrentLoad() {
        // Returns Current Elevator load
        return this.currentLoad;
    }

    public int getNextFloor() {
        if (this.nextFloors.size() > 0) {
            return this.nextFloors.get(0);
        }
        setIdle(true);
        return 0;
    }

    public boolean isIdle() {
        // Initially returns True
        return this.idle;
    }


    // ACTIONS

    // 

    // public void checkQueue() {
    //     if (this.nextFloors.length) {
    //         return;
    //     }
    // }

    public void goToFloor(int nextFloor) {
        // Check if floor is already in this.nextFloor
        // if floor not in 
        for (int floor : this.nextFloors) {
            
        }
        // if not in nextFloor append new floor
        // this.nextFloor.add(floor);
    }

    void addElevatorCall(Person person) {
        isGoingUp = person.isGoingUp;
        callFloor = person.callFloor;

        // do something;



        pickUpMap.get(callFLoor).add(person);
    }

    void addFloorRequest(Person person) {
        destFloor = person.destFloor;
        weight = person.weight;
        this.availableCapacity = this.availableCapacity - weight;
        this.dropOffMap.get(person.destFloor).add(person);
    }

    void stopAtTheFloor() {
        List<Person> dropOff = dropOffMap.get(currFloor);
        List<Person> pickUp = pickUpMap.get(currFloor);
        if (dropOff.size() == 0 && pickUp.size() == 0) {
            setElevatorIdle();
            return;
        }
        for (Person person : dropOff) {
            this.availableCapacity = this.availableCapacity + person.weight;
        }
        for (Person person : pickUp) {
            this.availableCapacity = this.availableCapacity - person.weight;
        }
    }


}


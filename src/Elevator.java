import java.util.List;

public class Elevator {

    int capacity;
    int currentLoad;
    // if goingUp is false then lift direction is down
    boolean goingUp;
    boolean idle;
    public int currentFloor;
    // nextFloor will contain a list of stops to be made next
    public List <Integer> nextFloors;

    


    // SETTERS
    public void setTotalCapacity(int capacity) {
        // Initially set by user
        this.capacity = capacity;
    }

    public void setIdle(boolean idle) {
        // Initially True
        this.idle = idle;
        this.nextFloors.add(0);
    }

    public void setDirection(boolean goingUp) {
        // Initially null
        if (!isIdle()) {
            this.goingUp = goingUp;
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
        return this.goingUp;
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
}


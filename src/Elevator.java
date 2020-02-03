import java.util.List;

public class Elevator {
    int capacity;
    int currentLoad;
    // if goingUp is false then lift direction is down
    boolean goingUp;
    boolean idle;
    public int currentFloor;
    public List<Integer> nextFloor;


    //SETTERS
    public void setTotalCapacity(int capacity) {
        // Initially set by user
        this.capacity = capacity;
    }

    public void setIdle(boolean idle) {
        // Initially True
        this.idle = idle;
    }

    public void setDirection(boolean goingUp) {
        // Initially null
        if (!isIdle()) {
            this.goingUp = goingUp;
        }
    }

    public void setCurrentLoad(int load) {
        // Initiallyl null
        this.currentLoad = load;
    }

    //GETTERS
    public boolean isIdle() {
        // Initially returns True
        return idle;
    }

    public int getFloor() {
        // Returns Floor Number
        return currentFloor;
    }

    public boolean getDirection() {
        // Return Elevator Direction
        return goingUp;
    }

    public int getTotalCapacity() {
        // Returns set capacity
        return capacity;
    }

    public int getCurrentLoad() {
        // Returns Current Elevator load
        return currentLoad;
    }
}
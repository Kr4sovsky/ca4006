import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Elevator {
    int id;
    int noFloors;
    int capacity;
    int currentLoad;
    // if isGoingUp is false then lift direction is down
    boolean isGoingUp;
    boolean idle;
    public int currentFloor;
    // nextFloor will contain a list of stops to be made next
    public List<Integer> nextFloors = new ArrayList<>();

    public Map<Integer, List<Person>> pickUpMap = new HashMap<>();
    public Map<Integer, List<Person>> dropOffMap = new HashMap<>();
        


    // SETTERS
    public void setTotalCapacity(int capacity) {
        // Initially set by user
        this.capacity = capacity;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setNoFloors(int noFloors) {
        this.noFloors = noFloors;
    }

    public void setIdle(boolean idle) {
        // Initially True
        this.idle = idle;
        this.isGoingUp = false;
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
    // if (this.nextFloors.length) {
    // return;
    // }
    // }


    void addElevatorCall(Person person) {
        boolean isGoingUp = person.isGoingUp;
        int callFloor = person.callFloor;

        // do something;
        pickUpMap.get(person.callFloor).add(person);

    }



    void addFloorRequest(Person person) {
        int destinationFloor = person.destinationFloor;
        int weight = person.weight;
        this.currentLoad = this.currentLoad - weight;
        this.dropOffMap.get(person.destinationFloor).add(person);
    }

    

    public void goToFloor(int nextFloor) {

        
        Thread.sleep(2000);
        
        // Check if floor is already in this.nextFloor
        // if floor not in 
        for (int floor : this.nextFloors) {
            
        }
        // if not in nextFloor append new floor
        // this.nextFloor.add(floor);
    }

    public void moveFloor() {
        
        this.isGoingUp = nextFloors.get(0) > currentFloor;
        if (isGoingUp) {
            this.currentFloor++;
        } else {
            this.currentFloor--;
        }
        System.out.println("MOVING TO FLOOR " + this.currentFloor);
        if (currentFloor == nextFloors.get(0)) {
            stopAtTheFloor();
        } else {
            Thread.sleep(500);
        }
        
        
    }

    // TODO - add complexity by introducing unexpected scenarios (wrong button pressed)
    void pickUp(Person person) {
        Thread.sleep(500);
        System.out.println("PERSON " + person.name + " HAS ENTERED THE ELEVATOR AND SELECTED FLOOR " + person.destinationFloor);
        this.currentLoad = this.currentLoad - person.weight;
    }

    // TODO - add complexity by introducing unexpected scenarios (prick mode)
    void dropOff(Person person) {
        Thread.sleep(500);
        System.out.println("PERSON " + person.name + " HAS EXITED THE ELEVATOR!");
        this.currentLoad = this.currentLoad + person.weight;
    }

    void stopAtTheFloor() {
        System.out.println("ELEVATOR " + id + "HAS STOPPED ON FLOOR №" + currentFloor);
        Thread.sleep(500);
        System.out.println("DOORS OF ELEVATOR " + id + " ARE OPENED");
        List<Person> dropOff = dropOffMap.get(currentFloor);
        List<Person> pickUp = pickUpMap.get(currentFloor);
        
        if (dropOff.size() == 0) {
            System.out.println("NO DROP OFFS HAPPENED!");
        }
        
        for (Person person : dropOff) {
            dropOff(person);
        }
        dropOffMap.remove(currentFloor); 
        
        for (Person person : pickUp) {
            pickUp(person);
        }
        pickUpMap.remove(currentFloor);

        this.nextFloors = nextFloors.subList(1, nextFloors.size());
        if (dropOff.size() == 0 && pickUp.size() == 0) {
            if (nextFloors.size() == 0 && currentFloor != 0) {
                this.nextFloors.add(0);
            } else if (currentFloor == 0) {
                setIdle(true);
            }
        }
        Thread.sleep(1000);
        // if (!isGoingUp && isIdle()) {
        //     if (nextFloors.size() == 1) {
        //         setIdle(true);
        //         moveFloor();
        //     }
        // }
        
    }


}


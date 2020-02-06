class Person {
    
    String name;
    int callFloor;
    int destinationFloor;
    boolean isGoingUp;
    

    public Person(String name, int callFloor, int destinationFloor) {
        this.name = name;
        this.callFloor = callFloor;
        this.destinationFloor = destinationFloor;
        this.isGoingUp = callFloor < destinationFloor;
    } 

    void setIsGoingUp(boolean isGoingUp) {
        this.isGoingUp = isGoingUp;
    }

}
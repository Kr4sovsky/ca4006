class Person {
    
    String name;
    int callFloor;
    int destinationFloor;
    boolean isGoingUp;
    int weight;
    

    public Person(String name, int callFloor, int destinationFloor, int weight) {
        this.name = name;
        this.callFloor = callFloor;
        this.destinationFloor = destinationFloor;
        this.isGoingUp = callFloor < destinationFloor;
        this.weight = weight;
    } 

    void setIsGoingUp(boolean isGoingUp) {
        this.isGoingUp = isGoingUp;
    }

}

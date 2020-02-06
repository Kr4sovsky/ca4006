1) Elevator CLASS

CLASS ATTRIBUTES
id:                int(0 - 10)
capacity:          int(600-1000)
availableCapacity: int( 1000 - 0 )
nextFloors :       List<Integer>
nextFloor:         nextFloors.get(0)
currDirEnd:        int( 0 - 10 )
currFloor:         int ( 0 - 10)
dropOffMap:		  1: person1, person2
				   2: person3
				   10: person5
pickUpMap:		1: person1, person2

isIdle:            

CLASS FUNCTIONS

void addElevatorCall(person) {
	goingUp = person.isGoingUp;
	callFloor = person.callFloor;

	do something;
	pickUpMap.get(callFLoor).add(person)

}

void addFloorRequest(person) {
	destFloor = person.destFloor;
	weight = person.weight;
	this.availableCapacity = this.availableCapacity - weight
	this.dropOffMap.get(person.destFloor).add(person)
}

void stopAtTheFloor() {
	List<Person> dropOff = dropOffMap.get(currFloor)
	List<Person> pickUp = pickUpMap.get(currFloor)
	if (dropOff.size() == 0 && pickUp.size() == 0) {
		setElevatorIdle()
		return;
	}	
	for (Person person : dropOff) {
		this.availableCapacity = this.availableCapacity + person.weight
	}
	for (Person person : pickUp) {
		this.availableCapacity = this.availableCapacity - person.weight
	}
}






2) Person CLASS

CLASS ATRRIBUTES

id:               int( 0 - ? )
callFloor:        int( 0 - 10 )
destFloor:        int( 0 - 10 )
isGoingUp:	   	  if less than currFloor personGoingDown
				  if Greater than currFloor personGoingUp
weight:			  int( 30 - 120 )


3) ElevatorController CLASS

CLASS ATRIBUTES

elevators: 		List<Elevators>
numFloors: 		int

collectPersonMap:	1: person1, person2
					2: person3, person4


CLASS FUNCTIONS

Elevator findBestElevator(person) {
	bestElevator = null;
	for (Elevator elevator : this.elevators) {
		if something {
			bestElevator = elevator;
		}
	}
	return bestElevator;
}




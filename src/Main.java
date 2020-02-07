import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    // TODO: CREATE ELEVATOR CONTROLLER CLASS
    public static void main(String[] args) { 


        // Scanner scanner = new Scanner(System.in);

        // System.out.print("How many floors in your building?: ");
        // int noFloors = scanner.nextInt(); 
        
        // System.out.print("\nHow many elevators would you like to service this building?: ");
        // int noElevators = scanner.nextInt();

        // System.out.print("\nSelect your max elevator load between 600 and 1000 kg: ");
        // int maxElevatorLoad = scanner.nextInt();

        // System.out.print("\nSelect average person weight between 60-90");
        // int avgPersonWeight = scanner.nextInt();


        // Building building = new Building(noElevators, noFloors);


        Building building = new Building(1, 10, 80, 800);

        int totalTrips = 3;
        
        System.out.println();
        System.out.println("Your building has been created");
        System.out.format("It has %d floor(s)\n", building.noFloors);
        System.out.format("and %d elevator(s)\n", building.noElevators);
        System.out.println();

        // Creating 1 elevator
        building.createNewElevator();
        
        int minPersonWeight = 50;
        int maxPersonWeight = 120;
        
        List<Person> personList = new ArrayList<>(); 
        String[] names = {"Ronan", "Roland", "Ronald"};

        Random rn = new Random();
        for (int i = 0;  i < totalTrips; i++) {
            int callFloor = rn.nextInt(building.noFloors);
            int destFloor = rn.nextInt(building.noFloors);
            int weight = rn.nextInt(maxPersonWeight-minPersonWeight) + minPersonWeight;
            while (destFloor == callFloor) {
                System.out.println("destFloor same as callFloor, regenerating destFloor");
                destFloor = rn.nextInt(building.noFloors);
            }
            
            Person person = new Person(names[i], callFloor, destFloor, weight);
            System.out.println();
            System.out.println("PERSON NAME: "+ person.name);
            System.out.println("PERSON WEIGHT: " + person.weight);
            System.out.println("PERSON CALL FLOOR: "+ person.callFloor);
            System.out.println("PERSON DESTINATION: " + person.destinationFloor);
            System.out.println("GOING UP: " + person.isGoingUp);
            System.out.println();
            personList.add(person);
        }

        


        




        // for (int i = 0; i < numberOfElevators; i++)
        // elevator = new Elevator()



        
        
    }
    

    

}

import java.util.Random;

// this is the main class that runs the dot chaser program
public class DotChaser {
    public static void main(String[] args) {
        int N = 200; // default interval for adding new objects
        if (args.length != 0) N = Integer.parseInt(args[0]); // updates n if a value is provided

        ThingList thingList = new ThingList(); // creates a list to store objects
        Random rand = new Random();  // initializes a random generator for movement
        int count = 0; // tracks the number of iterations

        while (true) { // infinite loop to keep the simulation running
            if (count % N == 0) { // adds new objects every n iterations
                thingList.addThing(new TypeA(45, 50)); // adds an instance of TypeA
                thingList.addThing(new TypeB(55, 50)); // adds an instance of TypeB
                thingList.addThing(new TypeC(50, 50)); // adds an instance of TypeC
            }

            thingList.printAll(); // displays all objects in the list
            thingList.moveAll(rand);  // moves each object based on random input
            count++; // increases the iteration counter
        }
    }
}

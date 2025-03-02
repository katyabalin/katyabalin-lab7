import java.util.Random;

public class DotChaser {
    public static void main(String[] args) {
        int N = 200; // Default value for adding new dots

        if (args.length != 0) {
            N = Integer.parseInt(args[0]);
        }

        ThingList thingList = new ThingList(); // Using a linked list instead of a Node structure
        int count = 0;

        while (true) {
            // Every N rounds, add new Thing objects (TypeA, TypeB, TypeC)
            if (count % N == 0) {
                thingList.addThing(new TypeA(45, 50)); // Red
                thingList.addThing(new TypeB(55, 50)); // Blue
                thingList.addThing(new TypeC(50, 50)); // Green (Custom movement)
            }

            // Print the list of Things (each round)
            thingList.printAll();

            // Move all Things
            thingList.moveAll();

            count++;
        }
    }
}

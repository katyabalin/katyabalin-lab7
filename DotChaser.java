import java.util.Random;

public class DotChaser {
    public static void main(String[] args) {
        int N = 200;
        if (args.length != 0) N = Integer.parseInt(args[0]);

        ThingList thingList = new ThingList();
        Random rand = new Random();  
        int count = 0;

        while (true) {
            if (count % N == 0) {
                thingList.addThing(new TypeA(45, 50));
                thingList.addThing(new TypeB(55, 50));
                thingList.addThing(new TypeC(50, 50)); // Custom TypeC
            }

            thingList.printAll();
            thingList.moveAll(rand);  
            count++;
        }
    }
}

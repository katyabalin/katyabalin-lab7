import java.util.Random;

// represents TypeB which is a subclass of thing
public class TypeB extends Thing {
    private int timeSinceLast; // keeps track of steps taken since last turn

    // constructor initializes TypeB with a starting position and assigns 'b' as its label
    public TypeB(int row, int col) {
        super(row, col, 'b'); // calls the parent constructor with 'b' as the identifier
        this.timeSinceLast = 0; // sets the step counter to zero
    }

    @Override
    // determines if the object should turn based on step count and randomness
    public void maybeTurn(Random rand) {
        timeSinceLast++; // increases the step counter
        if (timeSinceLast == 10) { // checks if 10 steps have been taken
            timeSinceLast = 0; // resets the counter
            int i = rand.nextInt(3); // generates a random number between 0 and 2
            if (i == 1) rightTurn(); // turns right if the number is 1
            if (i == 2) leftTurn();  // turns left if the number is 2
        }
    }
}

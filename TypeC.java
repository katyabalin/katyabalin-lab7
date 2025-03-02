import java.util.Random;

// represents TypeC which is a subclass of thing
public class TypeC extends Thing {
    private int stepCount = 0; // keeps track of the number of steps taken

    // constructor initializes TypeC with a starting position and assigns 'g' as its label
    public TypeC(int row, int col) {
        super(row, col, 'g'); // calls the parent constructor with 'g' as the identifier
    }

    @Override
    // determines if the object should turn based on the step count
    public void maybeTurn(Random rand) {
        stepCount++; // increases the step counter
        if (stepCount % 2 == 0) rightTurn(); // turns right on even steps
        else leftTurn(); // turns left on odd steps
    }
}

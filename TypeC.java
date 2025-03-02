public class TypeC extends Thing {
    private int stepCount = 0;

    public TypeC(int row, int col) {
        super(row, col, 'g'); // Green Color
    }

    @Override
    public void maybeTurn() {
        stepCount++;
        if (stepCount % 2 == 0) rightTurn();
        else leftTurn();
    }
}

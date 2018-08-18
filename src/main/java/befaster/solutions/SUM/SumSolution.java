package befaster.solutions.SUM;


public class SumSolution {

    public int compute(int x, int y) {
        checkIfNumberIsInsideInterval(x, y);
        return x+y;
    }

    private void checkIfNumberIsInsideInterval(int x, int y) {
        checkIfNumberIsTooLow(x, y);
        checkIfNumberIsTooHigh(x, y);
    }

    private void checkIfNumberIsTooHigh(int x, int y) {
        if (x > 100 || y > 100){
            throw new NumberTooHighException();
        }
    }

    private void checkIfNumberIsTooLow(int x, int y) {
        if(x < 0 || y < 0) {
            throw new NumberTooLowerException();
        }
    }

}

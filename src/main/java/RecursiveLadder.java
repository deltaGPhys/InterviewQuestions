public class RecursiveLadder {

    private int N;
    private Integer count;

    public RecursiveLadder(int N) {
        this.N = N;
        this.count = 0;
    }

    public int getSteps() {
        takeStep(this.N);
        return this.count;
    }

    public void takeStep(int rungs) {

        if (rungs >= 3) {
            takeStep(rungs-3);
        }
        if (rungs >= 2) {
            takeStep(rungs-2);
        }
        if (rungs >= 1) {
            takeStep(rungs-1);
        }
        if (rungs == 0) {
            count++;
        }
    }
}

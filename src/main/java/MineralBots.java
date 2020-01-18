import java.util.Arrays;

public class MineralBots {

    // have quota of N minerals; 1 robot can mine 1 unit per day or build a robot, which takes an additional day to begin operation.
    //
    // state is determined by number of active robots, number of dormant robots, total mined thus far.
    // at the beginning of each day, turn inactive robots to active
    // min number of days is <= mineral quota
    // bail on a path if it has >= current minimum
    // declare completion on current day if we have N - n active robots or on next day if we have N - n - m total robots

    private int N;
    private int min;

    public MineralBots (int N) {
        this.N = N;
        this.min = N;
    }

    public int execute() {
        nextDay(1,0,0,0);
        return this.min;
    }

    public void nextDay(int active, int inactive, int mined, int days) {
        int res = checkForCompletion(active,inactive,mined);
        if (res != 0) {
            evalResult(res + days);
        } else if (days < this.min) {

            active += inactive;
            inactive = 0;

            for (int i = 0; i <= active; i++) {
                nextDay(active - i, i, mined + (active - i), ++days);
            }
        }
    }

    public int checkForCompletion(int active, int inactive, int mined) {
        // return 1 if complete today, 2 if complete tomorrow, 0 otherwise
        return (N - mined <= active) ? 1 : (N - mined <= active + inactive) ? 2 : 0;
    }

    public void evalResult (int days) {
        this.min = Math.min(days, this.min);
    }

}

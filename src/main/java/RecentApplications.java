import java.time.LocalDate;

public class RecentApplications {

    private LocalDate[] appDates; //assuming that this is ordered chronologically
    private int recentApps;
    private LocalDate reevalDate;

    public RecentApplications(LocalDate[] appDates) {
        this.appDates = appDates;
    }

    public int getRecentApps() {
        return recentApps;
    }

    public LocalDate getReevalDate() {
        return reevalDate;
    }

    public int calcRecentApps(LocalDate date) {
        if (this.appDates.length == 0) {
            this.recentApps = 0;
            return 0;
        }
        int previousApps = 0;

        for (int i = this.appDates.length-1; i >= 0; i--) {
            if (!this.appDates[i].plusMonths(24).isBefore(date) && !this.appDates[i].isAfter(date)) {
                previousApps++;
                this.reevalDate = this.appDates[i].plusMonths(24).plusDays(1);
            } else if (!this.appDates[i].isAfter(date)) {
                this.recentApps = previousApps;
                return previousApps;
            }
        }
        return previousApps;
    }
}

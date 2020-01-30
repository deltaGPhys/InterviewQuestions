import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class RecentApplicationsTest {

    private RecentApplications recentApplications;

    @Before
    public void setUp() throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, uuuu");
        String[] dates = new String[] {
                "Jan 2, 2016",
                "Feb 3, 2017",
                "Jan 2, 2018",
                "Mar 4, 2018",
                "Feb 3, 2019",
                "Apr 5, 2019",
                "Jan 2, 2020",
                "Mar 4, 2020"
            };
        LocalDate[] appDates = Arrays.stream(dates).map(x -> LocalDate.parse(x, formatter)).toArray(LocalDate[]::new);
        recentApplications = new RecentApplications(appDates);
    }

    @Test
    @Parameters({"2020-04-05,4","2030-01-01,0","2020-03-04,5","2018-01-02,3","2015-01-01,0","2019-02-04,3"})
    public void calcRecentApps(String date, int result) {
        Assert.assertEquals(result,recentApplications.calcRecentApps(LocalDate.parse(date)));
    }

    @Test
    @Parameters({"2020-04-05,2021-02-04","2030-01-01,null","2020-03-04,2021-02-04","2018-01-02,2018-01-03","2015-01-01,null","2019-02-04,2018-01-03"})
    public void calcReevalDate(String date, String reevalDate) {
        recentApplications.calcRecentApps(LocalDate.parse(date));
        Assert.assertEquals(LocalDate.parse(reevalDate),recentApplications.getReevalDate());
    }
}
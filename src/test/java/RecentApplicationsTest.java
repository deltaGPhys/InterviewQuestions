import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class RecentApplicationsTest {

    private RecentApplications recentApplications;

    @Before
    public void setUp() throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, uuuu");
//        String[] dates = new String[] {
//                "Jan 2, 2016",
//                "Feb 3, 2017",
//                "Jan 2, 2018",
//                "Mar 4, 2018",
//                "Feb 3, 2019",
//                "Apr 5, 2019",
//                "Jan 2, 2020",
//                "Mar 4, 2020"
//            };
        String[] dates = new String[] {
                "2020-01-31",
                "2020-04-02"
            };
        //LocalDate[] appDates = Arrays.stream(dates).map(x -> LocalDate.parse(x, formatter)).toArray(LocalDate[]::new);
        LocalDate[] appDates = Arrays.stream(dates).map(x -> LocalDate.parse(x)).toArray(LocalDate[]::new);
        recentApplications = new RecentApplications(appDates);
    }

    @Test
    //@Parameters({"2020-04-05,4","2030-01-01,0","2020-03-04,5","2018-01-02,3","2015-01-01,0","2019-02-04,3"})
    @Parameters({"2020-01-31,1","2020-04-02,2"})
    public void calcRecentApps(String date, int result) {
        Assert.assertEquals(result,recentApplications.calcRecentApps(LocalDate.parse(date)));
    }

    @Test
//    @Parameters({"2020-04-05,2021-02-04","2020-03-04,2020-03-05","2018-01-02,2018-01-03","2019-02-04,2020-01-03"})
    @Parameters({"2020-01-31,2022-02-01","2020-04-02,2022-02-01"})
    public void calcReevalDate(String date, String reevalDate) {
        recentApplications.calcRecentApps(LocalDate.parse(date));
        Assert.assertEquals(LocalDate.parse(reevalDate),recentApplications.getReevalDate());
    }

    @Test
    public void calcReevalDateBefore() {
        recentApplications.calcRecentApps(LocalDate.parse("2015-01-01"));
        Assert.assertEquals(null, recentApplications.getReevalDate());
    }


    @Test
    public void calcReevalDateWayAfter() {
        recentApplications.calcRecentApps(LocalDate.parse("2030-01-01"));
        Assert.assertEquals(null, recentApplications.getReevalDate());
    }

    @Test
    public void blah() {
        List<String> blah = new ArrayList<>(Arrays.asList("4", "3", "12", "1"));
        blah.stream().forEach(i -> {
            int num = Integer.parseInt(i);
            System.out.println(String.format("%d is %s", num, num%2==1 ? "odd": "even"));
        });
    }

    @Test
    public void stream() {
        Stream<String> words = Stream.of("The", "Quick", "Brown", "Fox");
        words.forEach(str -> System.out.print(str)); // can also do this as a lambda
    }

    @Test
    public void stream2() { // what's the output?
        Arrays.stream(new String[]{"The", "Quick", "Brown", "Fox"})
                .filter(w -> w.length() > 3)
                .forEach(w -> System.out.println(w));
    }

    @Test
    public void stream3() { // what's the output?
        Arrays.stream(new String[]{"The", "Quick", "Brown", "Fox"})
                .filter(w -> w.length() > 3)
                .map(String::length)
//                .map(w -> w.length())
                .forEach(cow -> System.out.println(cow)
                );
    }

    @Test
    public void stream4() { // what's the output?
        System.out.println(
                Arrays.stream(new String[]{"The", "Quick", "Brown", "Fox", "Flies", "Bats", "Lazy"})
                .filter(w -> w.length() > 3)
                .map(String::length)
                .distinct()
                .count()
        );
    }

    @Test
    public void streamMergeArrays() {
        String[] array1 = new String[]{"The", "Quick", "Brown", "Fox", "Flies", "Bats", "Lazy"};
        String[] array2 = new String[]{"Snap", "Crackle", "Pop"};

        String[] merged = Stream.of(array1, array2).flatMap(Arrays::stream).toArray(String[]::new);
        for (String o: merged) {
            System.out.println(o);
        }
    }
}

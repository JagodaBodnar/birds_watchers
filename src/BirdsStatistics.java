import java.util.Arrays;

public class BirdsStatistics {
    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);
        int[] birdsLastWeek = birdWatcher.getLastWeek();
        birdWatcher.getToday();
        birdWatcher.incrementTodaysCount();
        int birdsToday = birdWatcher.getToday();
        boolean dayWithoutBirds = birdWatcher.hasDayWithoutBirds();
        int sumBirds = birdWatcher.getCountForFirstDays(4);
        int busyDays = birdWatcher.getBusyDays();
        System.out.printf("Bird count from last week: %s %n", Arrays.toString(birdsLastWeek));
        System.out.printf("Bird count for today incremented: %d %n", birdsToday);
        System.out.printf("There is a day with no visiting birds: %s %n", dayWithoutBirds);
        System.out.printf("Calculate the number of visiting birds for the first number of days: %d %n", sumBirds);
        System.out.printf("Days where five or more birds have visited garden: %d %n", busyDays);
    }
}

class Solution {
    // A global array for days in each month of a non-leap year
    private final int[] noOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        // Step 1: Convert all date strings into absolute days of the year (1 - 365)
        int startAlice = getDayOfYear(arriveAlice);
        int endAlice = getDayOfYear(leaveAlice);
        int startBob = getDayOfYear(arriveBob);
        int endBob = getDayOfYear(leaveBob);

        // Step 2: Find the intersection of the two intervals
        int latestArrival = Math.max(startAlice, startBob);
        int earliestDeparture = Math.min(endAlice, endBob);

        // Step 3: Calculate the overlapping days
        if (latestArrival <= earliestDeparture) {
            return earliestDeparture - latestArrival + 1;
        }
        
        return 0; // No overlap
    }

    // Helper method to convert "MM-DD" to a day number from 1 to 365
    private int getDayOfYear(String date) {
        String[] parts = date.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        int dayCount = 0;
        // Sum up all days of the fully completed previous months
        for (int i = 0; i < month - 1; i++) {
            dayCount += noOfDays[i];
        }
        
        return dayCount + day;
    }
}

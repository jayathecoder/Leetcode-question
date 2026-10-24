class Solution {
    private final int[] noOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        // Step 1: Map all dates to absolute days of the year (1 - 365)
        int startAlice = getDayOfYear(arriveAlice);
        int endAlice = getDayOfYear(leaveAlice);
        int startBob = getDayOfYear(arriveBob);
        int endBob = getDayOfYear(leaveBob);

        // Step 2: Use a coordinate / difference array to mark changes
        // Size 367 avoids any off-by-one errors when marking day + 1
        int[] timelineDiff = new int[367];

        // Alice's events
        timelineDiff[startAlice] += 1;
        timelineDiff[endAlice + 1] -= 1; // Event resets the day AFTER departure

        // Bob's events
        timelineDiff[startBob] += 1;
        timelineDiff[endBob + 1] -= 1;

        // Step 3: Sweep across the timeline accumulating the prefix sum
        int activePeople = 0;
        int overlappingDays = 0;

        for (int i = 1; i <= 365; i++) {
            activePeople += timelineDiff[i];
            
            // If both Alice and Bob are present, count this day
            if (activePeople == 2) {
                overlappingDays++;
            }
        }

        return overlappingDays;
    }

    private int getDayOfYear(String date) {
        String[] parts = date.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        int dayCount = 0;
        for (int i = 0; i < month - 1; i++) {
            dayCount += noOfDays[i];
        }
        return dayCount + day;
    }
}

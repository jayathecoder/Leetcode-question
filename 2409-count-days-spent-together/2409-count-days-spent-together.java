class Solution {
    public void fillDate(int[] days, String arrive, String leave, int[] noOfDays){
        String[] parts1 = arrive.split("-");
        int arriveMonth = Integer.parseInt(parts1[0]);
        int arriveDay = Integer.parseInt(parts1[1]);


        String[] parts2 = leave.split("-");
        int leaveMonth = Integer.parseInt(parts2[0]);
        int leaveDay = Integer.parseInt(parts2[1]);


        // Arrive index
        int idx1 = 0;
        for(int i=0; i < arriveMonth-1; i++){
            idx1 += noOfDays[i];
        }
        idx1 += (arriveDay - 1);

        // Leave index
        int idx2 = 0;
        for(int i=0; i < leaveMonth - 1; i++){
            idx2 += noOfDays[i];
        }
        idx2 += (leaveDay - 1);


        for(int i = idx1; i <= idx2; i++){
            days[i]++;
        }

    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int[] noOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int[] days = new int[365];


        fillDate(days, arriveAlice, leaveAlice, noOfDays);
        fillDate(days, arriveBob, leaveBob, noOfDays);

        int overlaps  = 0;

        for(int i=0; i < 365; i++){
            if(days[i] >= 2) overlaps++;
        }

        return overlaps;
    }
}
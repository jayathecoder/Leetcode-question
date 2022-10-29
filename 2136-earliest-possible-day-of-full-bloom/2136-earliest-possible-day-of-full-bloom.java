class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
       int n = plantTime.length;
       int[][] arr = new int[n][2];
       for(int i = 0; i < n; i++){
           arr[i][0] = plantTime[i];
           arr[i][1] = growTime[i];
       }
       Arrays.sort(arr, (a, b) -> (b[1] - a[1]));    // sorted on the basis of growTime in non ascending order
       int maxDay = 0;
       int seedPlant = 0;
       for(int i = 0; i < arr.length; i++){
           seedPlant = seedPlant + arr[i][0];    // upto which Day we will plant the seed
           maxDay = Math.max(maxDay, seedPlant+ arr[i][1] + 1);   // time taken by the plant to completely grow up
       }
       return maxDay - 1;    // day started from 0 in question so we return maxDay - 1
        
    }
}
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long cost = 0;

        if ((long) costBoth < (long) cost1 + cost2) {
            long max = Math.max(need1, need2);
            long min = Math.min(need1, need2);

            long n1 = need1 - min;
            long n2 = need2 - min;

            cost = Math.min(
                max * costBoth,
                (min * costBoth) + (n1 * cost1) + (n2 * cost2)
            );
        } else {
            cost = (long) need1 * cost1 + (long) need2 * cost2;
        }

        return cost;
    }
}
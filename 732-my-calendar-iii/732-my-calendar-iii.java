class MyCalendarThree {

    private Map<Integer, Integer> mp = new TreeMap<>();
    private int maxCount = 0;
    public int book(int start, int end) {
        mp.put(start, mp.getOrDefault(start, 0) + 1);
        mp.put(end, mp.getOrDefault(end, 0) - 1);
        int count = 0;
        for(Map.Entry<Integer, Integer> it : mp.entrySet()){
            count += it.getValue();
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
}
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */
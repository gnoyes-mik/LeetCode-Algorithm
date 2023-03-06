class Solution {
    public int convertTime(String current, String correct) {
        long start = covertToMinutes(current);
        // System.out.println("start = " + start);
        long end = covertToMinutes(correct);
        // System.out.println("end = " + end);
        long diff = end - start;
        // System.out.println("diff = " + diff);
        if(diff == 0) {
            return 0;
        }
        return calculate(diff);
    }

    private int calculate(long diff) {
        int val = 0;
        while(diff >= 60) {
            diff -= 60;
            val++;
        }
        while(diff >= 15) {
            diff -= 15;
            val++;
        }
        while(diff >= 5) {
            diff -= 5;
            val++;
        }
        while(diff >= 1) {
            diff -= 1;
            val++;
        }
        return val;
    }

    private Long covertToMinutes(String strTime) {
        String[] tmp = strTime.split(":");
        long h = Long.parseLong(tmp[0]);
        long m = Long.parseLong(tmp[1]);
        return h * 60 + m;
    }
}
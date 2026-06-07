package com.indivaragroup.examtwenty;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingScheduler {
    public static int maxNonOverlappingMeetings(int[][] meetings) {
        if (meetings == null || meetings.length == 0) return 0;
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[1]));
        int count = 0;
        int lastEndTime = -1;
        for (int[] meeting : meetings) {
            if (meeting[0] >= lastEndTime) {
                count++;
                lastEndTime = meeting[1];
            }
        }
        return count;
    }
}

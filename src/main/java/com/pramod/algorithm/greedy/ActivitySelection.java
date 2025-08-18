package com.pramod.algorithm.greedy;

import java.util.*;

class Activity {
    int start, end;
    Activity(int s, int e) { start = s; end = e; }
}

public class ActivitySelection {
    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
                new Activity(1, 3),
                new Activity(2, 5),
                new Activity(4, 6),
                new Activity(6, 8),
                new Activity(5, 7),
                new Activity(8, 9)
        );

        // Step 1: Sort by end time
      activities.sort(Comparator.comparingInt(a -> a.end));
       // activities.sort(Comparator.comparing(a->a.end));

        int count = 0;
        int lastEnd = -1;

        // Step 2: Pick earliest finishing compatible activities
        for (Activity act : activities) {
            if (act.start >= lastEnd) {
                count++;
                lastEnd = act.end;
                System.out.println("Selected: [" + act.start + ", " + act.end + "]");
            }
        }

        System.out.println("Maximum activities: " + count);
    }
}
package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

    public int removeDuplicates(int[] nums) {
        Set<Integer> integer = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            integer.add(nums[i]);
        }

        int count = 0;
        for (Integer num : integer) {
            nums[count] = num;
            count++;
        }

        return count;
    }


}

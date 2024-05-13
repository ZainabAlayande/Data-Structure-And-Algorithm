package org.example;

public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        for(int i = m; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                nums1[i] = nums2[count];
                count++;
            }
        }

        boolean thereIsMoreToSwap = true;
        while(thereIsMoreToSwap) {
            thereIsMoreToSwap = false;

            for(int i = 0; i < nums1.length - 1; i++) {
                if (nums1[i] > nums1[i + 1]) {
                    thereIsMoreToSwap = true;
                    int temp = nums1[i];
                    nums1[i] = nums1[i + 1];
                    nums1[i + 1] = temp;
                }
            }

        }
    }

}

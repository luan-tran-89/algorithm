package com.leetcode.array.thirdMax;

/**
 * @author gasieugru
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,2,3,1};
        System.out.println(solution.thirdMax(nums));
    }

    public int thirdMax(int[] nums) {
        long m1 = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == m1 || num == m2 || num == m3) {
                continue;
            }

            if (num > m1) {
                m3 = m2;
                m2 = m1;
                m1 = num;
            } else if (num > m2) {
                m3 = m2;
                m2 = num;
            } else if (num > m3) {
                m3 = num;
            }
        }

        return (int) (m3 != Long.MIN_VALUE ? m3 : m1);
    }
}

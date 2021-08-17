package algorithm.problem.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || k <= 0) return new int[0];

        Deque<Integer> deque = new ArrayDeque<>();

        int[] ans = new int[nums.length + 1 - k];
        int ansIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(!deque.isEmpty() && deque.getFirst() <= i - k) {
                deque.removeFirst();
            }

            while(!deque.isEmpty() && nums[deque.getLast()] < nums[i]) {
                deque.removeLast();
            }

            deque.addLast(i);

            if(i >= k - 1) {
                ans[ansIndex++] = nums[deque.getFirst()];
            }
        }

        return ans;
    }
}


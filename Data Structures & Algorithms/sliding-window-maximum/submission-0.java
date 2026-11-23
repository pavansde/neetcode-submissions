class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0,r=0,n=nums.length;
        int[] output = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>(); 
        while(r<n)
        {
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[r])
            {
                dq.pollLast();
            }
            dq.offer(r);
            if(l>dq.peekFirst())
            {
                dq.pollFirst();
            }
            if(r-l+1>=k)
            {
                output[l] = nums[dq.peekFirst()];
                l++;
            }
            r++;
        }
        return output;
    }
}

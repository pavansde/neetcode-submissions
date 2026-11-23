class Solution {
    public int longestConsecutive(int[] nums) {
        int longestSequence=0;
        Map<Integer,Boolean> exploredMap = new HashMap<>();
        for(int num : nums)
        {
            exploredMap.put(num,false);
        }

        for(int num: nums)
        {
            int currentLength=1;
            int nextnum=num+1;
            while(exploredMap.containsKey(nextnum)&& exploredMap.get(nextnum)==false)
            {
                currentLength++;
                exploredMap.put(nextnum,Boolean.TRUE);
                nextnum++;
            }
            int prevnum = num-1;
            while(exploredMap.containsKey(prevnum)&& exploredMap.get(prevnum)==false)
            {
                currentLength++;
                exploredMap.put(prevnum,Boolean.TRUE);
                prevnum--;
            }
            longestSequence = Math.max(longestSequence,currentLength);
        }
        return longestSequence;
    }
}
